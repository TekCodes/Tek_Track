package Services;  // Specifies the package name where the service class is located

import java.util.Optional;  // Imports the Optional class to handle optional values

import org.springframework.beans.factory.annotation.Autowired;  // Imports the @Autowired annotation for dependency injection
import org.springframework.stereotype.Service;  // Imports the @Service annotation to mark the class as a service component

import Models.User;  // Imports the User model class
import Repositories.UserRepository;  // Imports the UserRepository interface for database operations

@Service  // Marks this class as a service component, so it can be detected and managed by Spring
public class UserService {

    @Autowired  // Automatically injects the UserRepository dependency into this field
    private UserRepository userRepository;

    // Constructor for UserService to initialize the userRepository field
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Method to retrieve all users from the repository
    public Iterable<User> findAll() {
        return userRepository.findAll();  // Calls the findAll method on the repository to get all users
    }

    // Method to find a user by their ID
    public User findById(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);  // Attempts to find a user by ID, wrapped in an Optional

        if (optionalUser.isEmpty()) {  // Checks if the Optional is empty (i.e., user not found)
            return null;  // Returns null if the user is not found
        }

        User user = optionalUser.get();  // Retrieves the user from the Optional
        return user;  // Returns the found user
    }

    // Method to create a new user
    public User create(User user) {
        return userRepository.save(user);  // Saves the new user to the repository and returns the saved user
    }

    // Method to delete a user by their ID
    public Boolean deleteById(Long id) {
        userRepository.deleteById(id);  // Deletes the user with the given ID from the repository
        return true;  // Returns true to indicate successful deletion
    }

    // Method to delete a user by the user object
    public Boolean deleteByUser(User user) {
        userRepository.delete(user);  // Deletes the given user object from the repository
        return true;  // Returns true to indicate successful deletion
    }

    // Method to update an existing user with new data
    public User update(Long id, User newUserData) {
        Optional<User> optionalUser = userRepository.findById(id);  // Finds the user by ID, wrapped in an Optional

        // Guard clause: checks if the user was found
        if (optionalUser.isEmpty()) {
            return null;  // Returns null if the user is not found
        }

        User originalUser = optionalUser.get();  // Retrieves the existing user from the Optional
        originalUser.setfName(newUserData.getfName());  // Updates the first name
        originalUser.setlName(newUserData.getlName());  // Updates the last name
        originalUser.setUserName(newUserData.getUserName());  // Updates the username
        originalUser.setPassword(newUserData.getPassword());  // Updates the password
        return userRepository.save(originalUser);  // Saves the updated user and returns the saved user
    }
}
