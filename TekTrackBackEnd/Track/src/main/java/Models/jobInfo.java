package Models;

import java.util.Date;
import java.util.Objects;

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

    private String jobUrlLink;

    private Date dateApplied;
    
    private String contactName;

    private String contactEmail;

    private String contactNumber;

    private String referral;

    private Boolean remote;

    private Boolean gotResponse;




    public JobInfo() {
    }



    @Override
    public int hashCode() { // Overridden method to generate a hash code for the User object.
        return Objects.hash(jobInfoId, company, jobTitle, jobUrlLink, dateApplied, contactName, contactEmail, contactNumber, referral, remote, gotResponse); // Returns a hash code
    }
}
