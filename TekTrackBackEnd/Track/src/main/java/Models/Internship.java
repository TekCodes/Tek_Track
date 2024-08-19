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
    private String assesment;

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
    private String status;

    @Column()
    private Boolean remote;

    @Column()
    private Boolean response;

    @Column(length = 100)
    private String jobLink;

    //Constructors
    public Internship() {} //Default constructor, required by JPA

    public Internship(String company, String jobTitle, Date dateApplied, String duration, String assesment, Boolean assesment_completed, String contactPersonName, String contactPersonEmail, String contactPersonPhone, String jobDescription, String status, Boolean remote, Boolean response, String jobLink) {
        this.company = company;
        this.jobTitle = jobTitle;
        this.dateApplied = dateApplied;
        this.duration = duration;
        this.assesment = assesment;
        this.assesment_completed = assesment_completed;
        this.contactPersonName = contactPersonName;
        this.contactPersonEmail = contactPersonEmail;
        this.contactPersonPhone = contactPersonPhone;
        this.jobDescription = jobDescription;
        this.status = status;
        this.remote = remote;
        this.response = response;
        
    }

    //Getters and Setters

}
