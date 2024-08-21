package com.Tek.Track;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import Controllers.UserController;
import Models.User;

@WebMvcTest(controllers = UserController.class)
@ActiveProfiles("test")
public class UserControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserController userController;

     @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this); // Initialize mocks before each test
    }

    

}
