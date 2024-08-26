package com.Tek.Track.UserTests;

import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import com.Tek.Track.Controllers.UserController;
import com.Tek.Track.Models.User;
import com.Tek.Track.Services.UserService;

@WebMvcTest(controllers = UserController.class)
@ActiveProfiles("test")
public class UserControllerTests {

    @Mock
    private UserService userService;

    @InjectMocks
    private UserController userController;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this); // Initialize mocks before each test
    }

    @Test 
    public void testGetAllUsers() {
        List<User> mockUsers = new ArrayList<>();
        User user1 = new User(1L, "FirstName1", "LastName1", "email1@example.com", "user1", "password1");
        User user2 = new User(2L, "FirstName2", "LastName2", "email2@example.com", "user2", "password2");
        mockUsers.add(user1);
        mockUsers.add(user2);
        when(userService.findAll()).thenReturn(mockUsers);

        
        ResponseEntity<List<User>> response = userController.getAllUsers();

        
        Assert.assertEquals(HttpStatus.OK, response.getStatusCode());
        Assert.assertEquals(mockUsers.size(), response.getBody().size());
        Assert.assertEquals(mockUsers, response.getBody());
    }

    @Test
    public void testGetUserById() {
        Long userId = 1L;
        User mockUser = new User(userId, "FirstName", "LastName", "email@example.com", "user", "password");
        when(userService.findById(userId)).thenReturn(mockUser);

        
        ResponseEntity<User> response = userController.getUserById(userId);

        
        Assert.assertEquals(HttpStatus.OK, response.getStatusCode());
        Assert.assertEquals(mockUser, response.getBody());
    }

    @Test
    public void testGetUserByUserName() throws Exception {
        String username = "user";
        User mockUser = new User(1L, "FirstName", "LastName", "email@example.com", username, "password");
        when(userService.findByUserName(username)).thenReturn(mockUser);

        
        ResponseEntity<User> response = userController.getUserByUserName(username);

        Assert.assertEquals(HttpStatus.OK, response.getStatusCode());
        Assert.assertEquals(mockUser, response.getBody());
    }

    @Test
    public void testCreateUser() {
        User newUser = new User("FirstName", "LastName", "email@example.com", "user", "password");
        User createdUser = new User(1L, "FirstName", "LastName", "email@example.com", "user", "password");
        when(userService.create(newUser)).thenReturn(createdUser);

        ResponseEntity<User> response = userController.create(newUser);

        Assert.assertEquals(HttpStatus.CREATED, response.getStatusCode());
        Assert.assertEquals(createdUser, response.getBody());
    }

    @Test
    public void testUpdateUser() {
        Long userId = 1L;
        User updatedUser = new User(userId, "FirstName", "LastName", "email@example.com", "user", "password");
        when(userService.update(userId, updatedUser)).thenReturn(updatedUser);

        ResponseEntity<User> response = userController.update(userId, updatedUser);

        Assert.assertEquals(HttpStatus.OK, response.getStatusCode());
        Assert.assertEquals(updatedUser, response.getBody());
    }

    @Test
    public void testDeleteUserById() {
        Long userId = 1L;
        when(userService.deleteById(userId)).thenReturn(true);

        ResponseEntity<Boolean> response = userController.delete(userId);

        Assert.assertEquals(HttpStatus.OK, response.getStatusCode());
        Assert.assertTrue(response.getBody());
    }

    @Test
    public void testDeleteUserByUserName() {
        String username = "user";
        when(userService.deleteByUserName(username)).thenReturn(true);

        ResponseEntity<Boolean> response = userController.deleteByUserName(username);

        Assert.assertEquals(HttpStatus.OK, response.getStatusCode());
        Assert.assertTrue(response.getBody());
    }


}
