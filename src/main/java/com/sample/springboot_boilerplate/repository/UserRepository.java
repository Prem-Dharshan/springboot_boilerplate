package com.sample.springboot_boilerplate.repository;

import com.sample.springboot_boilerplate.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    // Native Query to find user by email
    @Query(value = "SELECT * FROM users u WHERE u.mail_id = :email", nativeQuery = true)
    Optional<User> findByMailId(@Param("email") String email);

    // JPQL Query for Get List of Users by Role
    @Query("SELECT u FROM User u WHERE u.userRole = :role")
    List<User> findUsersByRole(@Param("role") String role);
}
