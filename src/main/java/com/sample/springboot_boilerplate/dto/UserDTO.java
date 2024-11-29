package com.sample.springboot_boilerplate.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Integer id;

    @NotBlank(message = "User name is required")
    @Size(max = 255, message = "User name cannot exceed 255 characters")
    private String userName;

    @NotBlank(message = "Password is required")
    @Size(max = 255, message = "Password cannot exceed 255 characters")
    private String password;

    @NotBlank(message = "Roll number is required")
    @Size(max = 10, message = "Roll number cannot exceed 10 characters")
    private String rollNo;

    @NotBlank(message = "Email is required")
    @Email(message = "Email must be a valid email address")
    private String mailId;

    @NotBlank(message = "User status is required")
    private String userStatus;

    private LocalDate createdDate;

    @NotBlank(message = "User role is required")
    private String userRole;
}
