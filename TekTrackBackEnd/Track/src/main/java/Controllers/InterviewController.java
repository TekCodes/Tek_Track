package Controllers;

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

import Models.Interview;
import Models.User;
import Services.InterviewService;

@RestController
@RequestMapping("/interview")
public class InterviewController {

    @Autowired //Inject 'UserService' dependency
    private InterviewService interviewService;

    public InterviewController(InterviewService interviewService) {
        this.interviewService = interviewService;
    }

    @GetMapping("/interview")  
    public ResponseEntity<List<Interview>> getAllInterview() { 
        return new ResponseEntity<>(interviewService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/interview")  
    public ResponseEntity<Interview> getInterview(@PathVariable Long id) {
        return new ResponseEntity<>(interviewService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/newInterview")  
    public ResponseEntity<Interview> create(@RequestBody Interview interview) {
        return new ResponseEntity<>(interviewService.create(interview), HttpStatus.CREATED);
    }
    
    @PutMapping("/updateInterview/{id}")  
    public ResponseEntity<Interview> update(@PathVariable Long id, @RequestBody Interview interview) {
        return new ResponseEntity<>(interviewService.update(id, interview), HttpStatus.OK);
    }

    @DeleteMapping("/deleteInterview/{id}")  
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        return new ResponseEntity<>(interviewService.deleteById(id), HttpStatus.OK);
    }

    @DeleteMapping("/deleteInterview/{id}")  
    public ResponseEntity<Boolean> deleteById(@PathVariable Long id) {
        return new ResponseEntity<>(interviewService.deleteById(id), HttpStatus.OK);
    }


}
