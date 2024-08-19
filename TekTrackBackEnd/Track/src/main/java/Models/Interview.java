package Models;

import java.sql.Date;
import java.time.LocalDate;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.*;

@Entity
@Table(name= "Interview")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Interview {

    //Unique table ID
    @Id
    @GeneratedValue(name = "interview_id", strategy = GenerationType.IDENTITY)
    private Long interviewId;

    //Table columns
    @Column(name = "interview_date", nullable = false)
    private LocalDate interviewDate;
  
    @Column(name = "interview_stage", nullable = false, length = 50)
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

    public Interview(Date interviewDate, String stage, Boolean tyNote, String interviewType, String interviewLink, String interviewStatus, String interviewContactName, String interviewContactEmail) {
        this.interviewDate = interviewDate;
        this.stage = stage;
        this.tyNote = tyNote;
        this.interviewType = interviewType;
        this.interviewLink = interviewLink;
        this.interviewStatus = interviewStatus;
        this.interviewContactName = interviewContactName;
        this.interviewContactEmail = interviewContactEmail;
    }
    
    // Getters and Setters 
    public Long getInterviewId() {
        return interviewId;
    }

    public void setInterviewId(Long interviewId) {
        this.interviewId = interviewId;
    }

    public LocalDate getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(LocalDate interviewDate) {
        this.interviewDate = interviewDate;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public Boolean getTyNote() {
        return tyNote;
    }

    public void setTyNote(Boolean tyNote) {
        this.tyNote = tyNote;
    }

    public String getInterviewType() {
        return interviewType;
    }

    public void setInterviewType(String interviewType) {
        this.interviewType = interviewType;
    }

    public String getInterviewLink() {
        return interviewLink;
    }

    public void setInterviewLink(String interviewLink) {
        this.interviewLink = interviewLink;
    }

    public String getInterviewStatus() {
        return interviewStatus;
    }

    public void setInterviewStatus(String interviewStatus) {
        this.interviewStatus = interviewStatus;
    }

    public String getInterviewContactName() {
        return interviewContactName;
    }

    public void setInterviewContactName(String interviewContactName) {
        this.interviewContactName = interviewContactName;
    }

    public String getInterviewContactEmail() {
        return interviewContactEmail;
    }

    public void setInterviewContactEmail(String interviewContactEmail) {
        this.interviewContactEmail = interviewContactEmail;
    }
}


