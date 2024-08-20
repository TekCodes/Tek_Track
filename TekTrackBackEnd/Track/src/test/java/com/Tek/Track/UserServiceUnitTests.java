package com.Tek.Track;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import Services.UserService;

import org.junit.runner.RunWith;

@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TrackApplication.class)
public class UserServiceUnitTests {

    @Autowired
    private UserService userService;

    
}
