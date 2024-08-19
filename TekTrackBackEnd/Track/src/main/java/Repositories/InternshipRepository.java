package Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import Models.Internship;

@Repository
public interface InternshipRepository extends CrudRepository <Internship, Long>{
    
}
