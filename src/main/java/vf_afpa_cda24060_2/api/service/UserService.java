package vf_afpa_cda24060_2.api.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vf_afpa_cda24060_2.api.model.User;
import vf_afpa_cda24060_2.api.repository.UserRepository;

@Data
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User getUser(int id) {
        return userRepository.findById(id).orElse(null);
    }

    public Iterable<User> getAllUsers() {
     return userRepository.findAll();
    }
}
