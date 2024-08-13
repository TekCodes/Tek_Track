package Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    

}
