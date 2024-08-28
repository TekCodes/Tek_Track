package com.Tek.Track.JobTests;

import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ActiveProfiles;
import com.Tek.Track.Controllers.JobController;
import com.Tek.Track.Models.JobInfo;
import com.Tek.Track.Services.JobService;

@WebMvcTest(controllers = JobController.class)
@ActiveProfiles("test")
public class JobControllerTests {

    @Mock
    private JobService jobService;

    @InjectMocks
    private JobController jobController;

    private JobInfo job1;
    private JobInfo job2;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        job1 = new JobInfo();
        job1.setJobInfoId(1L);
        job1.setJobTitle("Software Engineer");

        job2 = new JobInfo();
        job2.setJobInfoId(2L);
        job2.setJobTitle("Data Scientist");
    }

}
