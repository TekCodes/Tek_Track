package Models;

import java.util.Date;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class JobInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long jobInfoId;

    private String company;

    private String jobTitle;

    private Date dateApplied;
    
    private String contactName;

    private String contactEmail;

    private String contactNumber;

    private String referral;

    private Boolean remote;

    private Boolean gotResponse;

    private String jobUrlLink;


    public JobInfo() {
    }

    public JobInfo(String company, String jobTitle, Date dateApplied, String contactName, String contactEmail, String contactNumber, String referral, Boolean remote, Boolean gotResponse, String jobUrlLink) {
        this.company = company;
        this.jobTitle = jobTitle;
        this.dateApplied = dateApplied;
        this.contactName = contactName;
        this.contactEmail = contactEmail;
        this.contactNumber = contactNumber;
        this.referral = referral;
        this.remote = remote;
        this.gotResponse = gotResponse;
        this.jobUrlLink = jobUrlLink;
    }

    public JobInfo(long jobInfoId, String company, String jobTitle, Date dateApplied, String contactName, String contactEmail, String contactNumber, String referral, Boolean remote, Boolean gotResponse, String jobUrlLink) {
        this.jobInfoId = jobInfoId;
        this.company = company;
        this.jobTitle = jobTitle;
        this.dateApplied = dateApplied;
        this.contactName = contactName;
        this.contactEmail = contactEmail;
        this.contactNumber = contactNumber;
        this.referral = referral;
        this.remote = remote;
        this.gotResponse = gotResponse;
        this.jobUrlLink = jobUrlLink;
    }

    
}
