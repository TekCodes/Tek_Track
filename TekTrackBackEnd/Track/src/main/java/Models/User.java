package Models;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    private String fName;

    private String lName;

    private String userName;

    private String password;

    public User(){}

    public User (long userId, String fName, String lName, String userName, String password){
        this.userId = userId;
        this.fName = fName;
        this.lName = lName;
        this.userName = userName;
        this.password = password;
    }

    

}
