package com.sample.springboot_boilerplate.service;

import com.sample.springboot_boilerplate.dto.UserDTO;

import java.util.List;

public interface UserService {

    UserDTO createUser(UserDTO userDTO);

    List<UserDTO> getAllUsers();

    UserDTO getUserById(Integer id);

    UserDTO updateUser(Integer id, UserDTO userDTO);

    void deleteUser(Integer id);

    UserDTO login(String email, String password);
}
