package com.Tek.Track.JobTests;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ActiveProfiles;
import com.Tek.Track.Controllers.JobController;

@WebMvcTest(controllers = JobController.class)
@ActiveProfiles("test")
public class JobControllerTests {

    

}
