package com.example.demo.users;

import com.example.demo.users.services.userService;
import jakarta.validation.Valid;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.slf4j.Logger;

@RestController
public class controller {
    @Autowired
    private userService userService;
    private final Logger LOGGER= LoggerFactory.getLogger(controller.class);

    @PostMapping("/user")
   public Users createUser(@Valid @RequestBody Users user){
        LOGGER.info("User creating...");
    return userService.createUser(user);
   }

   @GetMapping("/user")
    public List<Users> getALlUsers(){
        return userService.getAllUsers();
   }

   @GetMapping("user/{id}")
    public Users getUserProfile(@PathVariable("id") Long userId) {
        return userService.getUserProfile(userId);
   }

   @DeleteMapping("user/{id}")
   public String deleteUser(@PathVariable("id") Long UserId){
        LOGGER.warn("User deleting...");
        return userService.deleteUser(UserId);
   }








}
