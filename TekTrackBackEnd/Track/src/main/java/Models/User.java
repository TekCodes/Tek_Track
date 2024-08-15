package Models; // Specifies the package where this class belongs. 

import java.util.Objects; // Imports the Objects class for utility methods (e.g., for `equals` and `hashCode`).

import org.springframework.data.annotation.Id; // Imports the `Id` annotation for identifying primary key fields in a Spring Data entity.

import jakarta.persistence.Entity; // Imports the `Entity` annotation to denote that this class is a JPA entity.
import jakarta.persistence.GeneratedValue; // Imports the `GeneratedValue` annotation to specify how the primary key should be generated.
import jakarta.persistence.GenerationType; // Imports the `GenerationType` enumeration to define the strategy for generating primary keys.

@Entity // Marks this class as a JPA entity that will be mapped to a database table.
public class User {

    @Id // Specifies that the `userId` field is the primary key of the entity.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Indicates that the primary key should be generated automatically by the database (identity column).
    private long userId; // Defines the `userId` field, which is a unique identifier for the user.

    private String fName; // Defines the `fName` field to store the user's first name.

    private String lName; // Defines the `lName` field to store the user's last name.

    private String userName; // Defines the `userName` field to store the user's username.

    private String password; // Defines the `password` field to store the user's password.
    
    private JobInfo jobInfo;

    public User() {} // Default constructor, required by JPA.

    public User(String fName, String lName, String userName, String password, JobInfo jobInfo) { // Constructor to initialize a User object without `userId`.
        this.fName = fName; // Sets the user's first name.
        this.lName = lName; // Sets the user's last name.
        this.userName = userName; // Sets the user's username.
        this.password = password; // Sets the user's password.
        this.jobInfo = jobInfo; // Sets the user's job information.
    }

    public User(long userId, String fName, String lName, String userName, String password,  JobInfo jobInfo) { // Constructor to initialize a User object with `userId`.
        this.userId = userId; // Sets the user's ID.
        this.fName = fName; // Sets the user's first name.
        this.lName = lName; // Sets the user's last name.
        this.userName = userName; // Sets the user's username.
        this.password = password; // Sets the user's password.
        this.jobInfo = jobInfo; // Sets the user's job information.
    }

    public long getUserId() { // Getter method for `userId`.
        return userId; // Returns the user's ID.
    }

    public void setUserId(long userId) { // Setter method for `userId`.
        this.userId = userId; // Sets the user's ID.
    }

    public String getfName() { // Getter method for `fName`.
        return fName; // Returns the user's first name.
    }

    public void setfName(String fName) { // Setter method for `fName`.
        this.fName = fName; // Sets the user's first name.
    }

    public String getlName() { // Getter method for `lName`.
        return lName; // Returns the user's last name.
    }

    public void setlName(String lName) { // Setter method for `lName`.
        this.lName = lName; // Sets the user's last name.
    }

    public String getUserName() { // Getter method for `userName`.
        return userName; // Returns the user's username.
    }

    public void setUserName(String userName) { // Setter method for `userName`.
        this.userName = userName; // Sets the user's username.
    }

    public String getPassword() { // Getter method for `password`.
        return password; // Returns the user's password.
    }

    public void setPassword(String password) { // Setter method for `password`.
        this.password = password; // Sets the user's password.
    }

    public JobInfo getJobInfo(){ // Getter method to retrieve job information.
        return jobInfo;
    }

    public void setJobInfo(JobInfo jobInfo){ // Setter method for job information.
        this.jobInfo = jobInfo;
    }

    @Override
    public boolean equals(Object o) { // Overridden method to compare User objects for equality.
        if (this == o) return true; // Checks if the compared object is the same as this object.
        if (o == null || getClass() != o.getClass()) return false; // Checks if the compared object is null or of a different class.
        User user = (User) o; // Casts the object to User.
        return userId == user.userId && // Compares the `userId` fields.
                Objects.equals(fName, user.fName) && // Compares the `fName` fields.
                Objects.equals(lName, user.lName) && // Compares the `lName` fields.
                Objects.equals(userName, user.userName) && // Compares the `userName` fields.
                Objects.equals(password, user.password); // Compares the `password` fields.
    }

    @Override
    public int hashCode() { // Overridden method to generate a hash code for the User object.
        return Objects.hash(userId, fName, lName, userName, password); // Returns a hash code based on the `userId`, `fName`, `lName`, `userName`, and `password`.
    }
}
