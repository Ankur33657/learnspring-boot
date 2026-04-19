package com.example.demo.users.services;

import com.example.demo.users.Users;

import java.util.List;

public interface userService {

  public Users createUser(Users user);
  public List<Users> getAllUsers();

  public Users getUserProfile(Long userId);
  public String deleteUser(Long userId);
}
