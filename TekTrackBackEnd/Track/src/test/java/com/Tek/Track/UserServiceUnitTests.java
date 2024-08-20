package com.Tek.Track;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import Models.User;
import Services.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TrackApplication.class)
public class UserServiceUnitTests {

    @Autowired
    private UserService userService;

    @Test
    public void whenUserNameIsProvided_thenRetrievedUserNameIsCorrect() {
        String mockUserName = "Username";
        String expectedUserName = "Username";

        Mockito.when(userService.findByUserName(mockUserName)).thenReturn(new User(mockUserName));

        String testName = userService.findByUserName(mockUserName).getUserName();

        Assert.assertEquals(expectedUserName, testName);
    }

    @SuppressWarnings("removal")
    @Test
    public void whenUserIdIsProvided_thenRetrievedUserIsCorrect() {
        String mockFirstName = "FirstName";
        //String expectedFirstName = "FirstName";
        String mockLastName = "LastName";
        //String expectedLastName = "LastName";
        String mockEmail = "Email@email.email";
        //String expectedEmail = "Email@email.email";
        String mockUserName = "Username";
        //String expectedUserName = "Username";
        String mockPassword = "Qq!1";
        //String expectedPassword = "Qq!1";
        Long id = new Long(2);

        Mockito.when(userService.findById(id)).thenReturn(new User(mockFirstName, mockLastName, mockEmail, mockUserName, mockPassword));

        String testFirstName = userService.findById(id).getfirstName();
        String testLastName = userService.findById(id).getlastName();
        String testEmail = userService.findById(id).getEmail();
        String testUserName = userService.findById(id).getUserName();
        String testPassword = userService.findById(id).getPassword();// Might not pass due to JSON ignore annotation on User Model class

        Assert.assertEquals(mockFirstName, testFirstName);
        Assert.assertEquals(mockLastName, testLastName);
        Assert.assertEquals(mockEmail, testEmail);
        Assert.assertEquals(mockUserName, testUserName);
        Assert.assertEquals(mockPassword, testPassword);
    }

}
