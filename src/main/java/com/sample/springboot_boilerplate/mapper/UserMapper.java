package com.sample.springboot_boilerplate.mapper;

import com.sample.springboot_boilerplate.dto.UserDTO;
import com.sample.springboot_boilerplate.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserDTO mapToDto(User user) {
        return new UserDTO(
                user.getId(),
                user.getUserName(),
                user.getPassword(),
                user.getRollNo(),
                user.getMailId(),
                user.getUserStatus(),
                user.getCreatedDate(),
                user.getUserRole()
        );
    }

    public User mapToEntity(UserDTO userDTO) {
        User user = new User();
        user.setUserName(userDTO.getUserName());
        user.setPassword(userDTO.getPassword());
        user.setRollNo(userDTO.getRollNo());
        user.setMailId(userDTO.getMailId());
        user.setUserStatus(userDTO.getUserStatus());
        user.setCreatedDate(userDTO.getCreatedDate());
        user.setUserRole(userDTO.getUserRole());
        return user;
    }

}
