package yonk.dev.lab_week06.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yonk.dev.lab_week06.backend.entities.User;
import yonk.dev.lab_week06.backend.repositories.UserRepository;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void addUser(User user){
        userRepository.save(user);
    }

    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(BigInteger id){
        return userRepository.findById(id);
    }

    public void updateUserById(BigInteger id, User user){
        Optional<User> userUpdate = getUserById(id);
        if(userUpdate.isPresent()) {
            userUpdate = Optional.ofNullable(user);
            userRepository.save(userUpdate.get());
        }
    }
}
