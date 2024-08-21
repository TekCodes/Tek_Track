package com.Tek.Track;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import Models.User;
import Repositories.UserRepository;
import Services.UserService;
import java.util.Optional;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TrackApplication.class)
public class UserServiceUnitTests {

    @MockBean // Mock the UserRepository to isolate service layer tests
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @Test // Test findByUsername
    public void whenUserNameIsProvided_thenRetrievedUserNameIsCorrect() {
        String mockUserName = "Username";

        User mockUser = new User();
        mockUser.setUserName(mockUserName);

        Mockito.when(userRepository.findByUsername(mockUserName)).thenReturn(mockUser);

        String testName = userService.findByUserName(mockUserName).getUserName();

        Assert.assertEquals(mockUserName, testName);
    }


    @Test // Test findById
    public void whenUserIdIsProvided_thenRetrievedUserIsCorrect() {
        Long mockId = 2L;
        String mockFirstName = "FirstName";
        String mockLastName = "LastName";
        String mockEmail = "Email@email.email";
        String mockUserName = "Username";
        String mockPassword = "Qq!1";

        User mockUser = new User(mockFirstName, mockLastName, mockEmail, mockUserName, mockPassword, null);
        mockUser.setUserId(mockId);

        Mockito.when(userRepository.findById(mockId)).thenReturn(Optional.of(mockUser));

        User retrievedUser = userService.findById(mockId);

        Assert.assertNotNull(retrievedUser);
        Assert.assertEquals(mockFirstName, retrievedUser.getfirstName());
        Assert.assertEquals(mockLastName, retrievedUser.getlastName());
        Assert.assertEquals(mockEmail, retrievedUser.getEmail());
        Assert.assertEquals(mockUserName, retrievedUser.getUserName());
        Assert.assertEquals(mockPassword, retrievedUser.getPassword());
    }

    @Test // Test create method in User Service
    public void whenNewUserIsProvided_thenNewUserIsCreated() {
        User mockUser = new User("first", "last", "email@email.com", "username", "password", null);

        Mockito.when(userRepository.save(mockUser)).thenReturn(mockUser);

        User createdUser = userService.create(mockUser);

        Assert.assertNotNull(createdUser);
        Assert.assertEquals(mockUser.getUserName(), createdUser.getUserName());
    }

    @Test // Test Update method in User Service
    public void whenUserIsUpdated_thenUserDetailsAreUpdated() {
        Long mockId = 2L;
        User existingUser = new User("OldFirstName", "OldLastName", "old.email@email.email", "OldUsername", "OldPassword", null);
        existingUser.setUserId(mockId);

        User updatedUser = new User("NewFirstName", "NewLastName", "new.email@email.email", "NewUsername", "NewPassword", null);
        updatedUser.setUserId(mockId);

        Mockito.when(userRepository.findById(mockId)).thenReturn(Optional.of(existingUser));
        Mockito.when(userRepository.save(updatedUser)).thenReturn(updatedUser);

        User result = userService.update(mockId, updatedUser);

        Assert.assertNotNull(result);
        Assert.assertEquals(updatedUser.getfirstName(), result.getfirstName());
        Assert.assertEquals(updatedUser.getlastName(), result.getlastName());
        Assert.assertEquals(updatedUser.getEmail(), result.getEmail());
        Assert.assertEquals(updatedUser.getUserName(), result.getUserName());
        Assert.assertEquals(updatedUser.getPassword(), result.getPassword());
    }

    

}
