package Controllers;

import Services.JobService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Models.JobInfo;

@RestController
@RequestMapping("/jobs")
public class JobController {
    @Autowired
    private JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/jobs")
    public ResponseEntity<List<JobInfo>> getAllJobs() {
        return new ResponseEntity<>(jobService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/job")
    public ResponseEntity<JobInfo> getJob(@PathVariable Long id) {
        return new ResponseEntity<>(jobService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/new_job")
    public ResponseEntity<JobInfo> create(@RequestBody JobInfo jobInfo) {
        return new ResponseEntity<>(jobService.create(jobInfo), HttpStatus.CREATED);
    }

    @PutMapping("/update_job")
    public ResponseEntity<JobInfo> update(@PathVariable Long id, @RequestBody JobInfo jobInfo) {
        return new ResponseEntity<>(jobService.update(id, jobInfo), HttpStatus.OK);
    }

    @DeleteMapping("/delete_job")
    public ResponseEntity<Boolean> deleteById(@PathVariable Long id) {
        return new ResponseEntity<>(jobService.deleteById(id), HttpStatus.OK);
    }

    

}
