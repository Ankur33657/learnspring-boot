package com.example.demo.users.services;

import com.example.demo.error.types.ResourceNotFound;
import com.example.demo.users.Users;
import com.example.demo.users.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class userServiceImpl implements userService {

  @Autowired
  private repository userrepository;


  @Override
  public Users createUser(Users user){
   return userrepository.save(user);
  }

  @Override
  public List<Users> getAllUsers(){
    return userrepository.findAll();
  }

  @Override
  public Users getUserProfile(Long userId)  {

      Optional<Users> user= userrepository.findById(userId);
      if(user.isEmpty()){
       throw new ResourceNotFound("User not found");
      }
      return user.get();
  }

   @Override
  public String deleteUser(Long userId){
     userrepository.deleteById(userId);
       return "User Deleted";

   }

}
