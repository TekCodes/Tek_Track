package Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import Models.Internship;
import Services.InternshipService;

@RestController
@RequestMapping("/internships")
public class InternshipController {

    @Autowired //Inject Service dependency
    private InternshipService internshipService;

    public InternshipController(InternshipService internshipService) {
        this.internshipService = internshipService;
    }

    @GetMapping("/internship")
    public ResponseEntity<List<Internship>> getAllInternship() { 
        return new ResponseEntity<>(internshipService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/internship/{id}")
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
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        boolean deleted = internshipService.deleteById(id);
        if(deleted){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
