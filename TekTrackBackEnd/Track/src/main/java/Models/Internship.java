package Models;
import java.sql.Date;
import org.springframework.data.annotation.Id;
import jakarta.persistence.*;

@Entity
public class Internship {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long internshipId;

    @Column(nullable = false, length = 30)
    private String company;
    
    @Column(nullable = false, length = 30)
    private String jobTitle;
    
    @Column(name = "date_applied")
    private Date dateApplied;
    
    @Column(nullable = false)
    private String duration; //(Dropbox season)

    @Column()
    private String Assesment;

    @Column()
    private Boolean assesment_completed;

    @Column()
    private String contactPersonName;

    @Column()
    private String contactPersonEmail;

    @Column()
    private String contactPersonPhone;

    @Column(length = 250)
    private String jobDescription;

    @Column()
    private String Status;

    @Column()
    private Boolean remote;

    @Column()
    private Boolean response;

    @Column(length = 100)
    private String jobLink;

}
