package Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Models.User;
import Repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);

        if(optionalUser.isEmpty()){
            return null;
        }

        User user = optionalUser.get();
        return user;
    }

    public User create (User user) {
        return userRepository.save(user);
    }

    public Boolean deleteById(Long id) {
        userRepository.deleteById(id);
        return true;
    }

    public Boolean deleteByUser(User user) {
        userRepository.delete(user);
        return true;
    }

    public User update(Long id, User newUserData){
        Optional<User> optionalUser = userRepository.findById(id);
        //Guard clause
        if(optionalUser.isEmpty()){
            return null;
        }
        User originalUser = optionalUser.get();
        originalUser.setfName(newUserData.getfName());
        originalUser.setlName(newUserData.getlName());
        originalUser.setUserName(newUserData.getUserName());
        originalUser.setPassword(newUserData.getPassword());
        return userRepository.save(originalUser);
    }

}
