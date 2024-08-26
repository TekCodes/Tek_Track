package com.Tek.Track.JobTests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.Tek.Track.TrackApplication;

import com.Tek.Track.Repositories.JobRepository;
import com.Tek.Track.Services.JobService;

@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TrackApplication.class)
public class JobServiceUnitTests {

    @MockBean
    private JobRepository jobRepository;

    @Autowired
    private JobService jobService;

    @Test
    public void whenJobIdIsProvided_thenRetrievedJobIsCorrect() {
        
    }

}
