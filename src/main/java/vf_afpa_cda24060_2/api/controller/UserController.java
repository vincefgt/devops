package vf_afpa_cda24060_2.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vf_afpa_cda24060_2.api.model.User;
import vf_afpa_cda24060_2.api.service.UserService;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    private User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/users")
    public List<User> findAll() {
            return (List<User>) userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable int id) {
        Optional<User> user = Optional.ofNullable(userService.getUser(id));
        return user.orElse(null);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
    }

    @PutMapping("/user/{id}")
        public User updateuser (@PathVariable("id") Integer id, @RequestBody User user) {
            Optional<User> userOptional = Optional.ofNullable(userService.getUser(id));
            if (userOptional.isPresent()) {
                User userToUpdate = userOptional.get();

                String firstName = user.getFirstname();
                if (firstName != null) {
                    userToUpdate.setFirstname(firstName);
                }
                String lastName = user.getLastname();
                if (lastName != null) {
                    userToUpdate.setLastname(lastName);
                }
                userService.saveUser(userToUpdate);
                return userToUpdate;
            } else {
                return null;
            }
        }

    }