package Models;
import java.sql.Date;
import org.springframework.data.annotation.Id;
import jakarta.persistence.*;

@Entity
public class Internship {

    //Unique table ID
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long internshipId;

    //Table columns
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

    //Constructors
    public Internship() {} //Default constructor, required by JPA

    public Internship(String company, String jobTitle) {
        this.company = company;
        this.jobTitle = jobTitle;
    }

    //Getters and Setters

}
