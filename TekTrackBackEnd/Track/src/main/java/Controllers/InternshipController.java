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

import Models.Internship;
import Models.Interview;
import Services.InternshipService;

@RestController
@RequestMapping
public class InternshipController {

    @Autowired //Inject Service dependency
    private InternshipService internshipService;

    public InternshipController(InternshipService internshipService) {
        this.internshipService = internshipService;
    }

        @GetMapping("/allInternship")  
    public ResponseEntity<List<Internship>> getAllInternship() { 
        return new ResponseEntity<>(internshipService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")  
    public ResponseEntity<Internship> getInternship(@PathVariable Long id) {
        Internship internship = internshipService.findById(id);
        if ( internship == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(internship, HttpStatus.OK);
    }

    @PostMapping("/newInternship")  
    public ResponseEntity<Internship> create(@RequestBody Internship internship) {
        return new ResponseEntity<>(internshipService.create(internship), HttpStatus.CREATED);
    }
    
    @PutMapping("/updateInternship/{id}")  
    public ResponseEntity<Internship> update(@PathVariable Long id, @RequestBody Internship internship) {
        return new ResponseEntity<>(internshipService.update(id, internship), HttpStatus.OK);
    }

    @DeleteMapping("/deleteInternship/{id}")  
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        return new ResponseEntity<>(internshipService.deleteById(id), HttpStatus.OK);
    }

}
