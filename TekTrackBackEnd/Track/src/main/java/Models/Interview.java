package Models;

import java.sql.Date;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;

@Entity
@Table(name= "Interview")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Interview {

    //Unique table ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long interviewId;

    //Table columns
    @Column(nullable = false, length = 100)
    private Date interviewDate;
  
    @Column(nullable = false, length = 50)
    private String stage; //Possible ENUM (1st, 2nd, Final)
    
    @ Column(name = "ty_note")
    private Boolean tyNote;

    @Column(name = "interview_type")
    private String interviewType; //Possible ENUM (In Person, Virtual, Zoom, GoogleMeets, Phone)

    @Column(name = "interview_link", length = 154)
    private String interviewLink;

    @Column(name = "interview_status")
    private String interviewStatus;

    @Column(name = "interview_contact_name")
    private String interviewContactName;

    @Column(name = "interview_contact_email")
    private String interviewContactEmail;


    //Job Info instance //Many to many
    //Internship Instance //Many to many
   
    //Constructors
    public Interview() {}

    public Interview(Date interviewDate, String stage, Boolean tyNote, String interviewType, String interviewLink) {}







}
