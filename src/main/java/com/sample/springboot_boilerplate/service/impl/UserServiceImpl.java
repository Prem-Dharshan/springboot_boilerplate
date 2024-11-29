package com.sample.springboot_boilerplate.service.impl;

import com.sample.springboot_boilerplate.dto.UserDTO;
import com.sample.springboot_boilerplate.entity.User;
import com.sample.springboot_boilerplate.exception.InvalidCredentialsException;
import com.sample.springboot_boilerplate.exception.ResourceNotFoundException;
import com.sample.springboot_boilerplate.mapper.UserMapper;
import com.sample.springboot_boilerplate.repository.UserRepository;
import com.sample.springboot_boilerplate.service.UserService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        // Check for duplicate roll number or email
        if (userRepository.findByMailId(userDTO.getMailId()).isPresent()) {
            throw new IllegalArgumentException("Email already exists");
        }

        User user = userMapper.mapToEntity(userDTO);
        user.setCreatedDate(LocalDate.now());
        User savedUser = userRepository.save(user);
        return userMapper.mapToDto(savedUser);
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(userMapper::mapToDto)
                .collect(Collectors.toList());
    }

    @Override
    public UserDTO getUserById(Integer id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with ID: " + id));
        return userMapper.mapToDto(user);
    }

    @Override
    public UserDTO updateUser(Integer id, UserDTO userDTO) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with ID: " + id));

        // Update fields only if provided in the request
        Optional.ofNullable(userDTO.getUserName()).ifPresent(user::setUserName);
        Optional.ofNullable(userDTO.getRollNo()).ifPresent(user::setRollNo);
        Optional.ofNullable(userDTO.getMailId()).ifPresent(user::setMailId);
        Optional.ofNullable(userDTO.getPassword()).ifPresent(user::setPassword);
        Optional.ofNullable(userDTO.getUserStatus()).ifPresent(user::setUserStatus);
        Optional.ofNullable(userDTO.getUserRole()).ifPresent(user::setUserRole);

        User updatedUser = userRepository.save(user);
        return userMapper.mapToDto(updatedUser);
    }

    @Override
    public void deleteUser(Integer id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with ID: " + id));
        userRepository.delete(user);
    }

    @Override
    public UserDTO login(String email, String password) {
        // Check if user exists by email
        User user = userRepository.findByMailId(email)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with email: " + email));

        // Check if the password matches
        if (!user.getPassword().equals(password)) {
            throw new InvalidCredentialsException("Invalid credentials");
        }

        // Return user DTO if credentials are valid
        return userMapper.mapToDto(user);
    }
}
