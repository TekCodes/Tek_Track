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

    

}
