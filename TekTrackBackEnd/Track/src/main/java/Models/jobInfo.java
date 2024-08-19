package Models;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class JobInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long jobInfoId;
    //Company
    //Job_Title
    //Date Applied
    //ContactPersonName
    //Contact Person email
    //Contact Person Phone Number
    //Referral
    //Job Description
    //Status
    //Remote
    //Got response
    //JobLink

}
