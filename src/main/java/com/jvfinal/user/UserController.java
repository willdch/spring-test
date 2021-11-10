package com.jvfinal.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jvfinal.models.User;

@RestController
@RequestMapping("/api/user")
public class UserController {

  @Autowired
  private MySQLUserDetailsService userService;
  @Autowired
  UserRepository userRepo;
  
//  gets all users
  @GetMapping("")
  public List<User> getAllUsers() {
	  List<User> usersFound = userRepo.findAll();
	  return usersFound;
	  
  }

//  registers new users. 
  @PostMapping("/register")
  public void register(@RequestBody User newUser) {
    userService.Save(newUser);
  }
}