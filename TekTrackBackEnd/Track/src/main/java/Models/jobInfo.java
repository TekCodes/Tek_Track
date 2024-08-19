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

    public JobInfo(String company, String jobTitle, String jobUrlLink, Date dateApplied, String contactName, String contactEmail, String contactNumber, String referral, Boolean remote, Boolean gotResponse) {
        this.company = company;
        this.jobTitle = jobTitle;
        this.jobUrlLink = jobUrlLink;
        this.dateApplied = dateApplied;
        this.contactName = contactName;
        this.contactEmail = contactEmail;
        this.contactNumber = contactNumber;
        this.referral = referral;
        this.remote = remote;
        this.gotResponse = gotResponse;
    }

    public JobInfo(long jobInfoId, String company, String jobTitle, String jobUrlLink, Date dateApplied, String contactName, String contactEmail, String contactNumber, String referral, Boolean remote, Boolean gotResponse) {
        this.jobInfoId = jobInfoId;
        this.company = company;
        this.jobTitle = jobTitle;
        this.jobUrlLink = jobUrlLink;
        this.dateApplied = dateApplied;
        this.contactName = contactName;
        this.contactEmail = contactEmail;
        this.contactNumber = contactNumber;
        this.referral = referral;
        this.remote = remote;
        this.gotResponse = gotResponse;
    }

    public long getJobInfoId() {
        return jobInfoId;
    }

    public void setJobInfoId(long jobInfoId) {
        this.jobInfoId = jobInfoId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobUrlLink() {
        return jobUrlLink;
    }

    public void setJobUrlLink(String jobUrlLink) {
        this.jobUrlLink = jobUrlLink;
    }

    public Date getDateApplied() {
        return dateApplied;
    }

    public void setDateApplied(Date dateApplied) {
        this.dateApplied = dateApplied;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getReferral() {
        return referral;
    }

    public void setReferral(String referral) {
        this.referral = referral;
    }

    public Boolean getRemote() {
        return remote;
    }

    public void setRemote(Boolean remote) {
        this.remote = remote;
    }

    public Boolean getGotResponse() {
        return gotResponse;
    }

    public void setGotResponse(Boolean gotResponse) {
        this.gotResponse = gotResponse;
    }

    @Override
    public int hashCode() { // Overridden method to generate a hash code for the User object.
        return Objects.hash(jobInfoId, company, jobTitle, jobUrlLink, dateApplied, contactName, contactEmail, contactNumber, referral, remote, gotResponse); // Returns a hash code
    }
}
