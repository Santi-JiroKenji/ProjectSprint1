package sut.se.team08.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sut.se.team08.entity.User;
import sut.se.team08.repository.UserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class UserController {
    @Autowired
    public UserRepository userRepository;

    @GetMapping("/login/{username}/{password}")
    public Boolean getUser(@PathVariable String username, @PathVariable String password){
        User usernames = userRepository.findByUsername(username);
        User passwords = userRepository.findByPassword(password);
        System.out.println("This is check User ==> " + username + " | " + password);
        if(usernames != null && passwords != null){
            return true;
        }
        return false;
    }
}
