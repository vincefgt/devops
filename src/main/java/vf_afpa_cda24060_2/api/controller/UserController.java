package vf_afpa_cda24060_2.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
}