package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    // JPQL query (users by role)
    @Query("SELECT u FROM User u JOIN u.roles r WHERE r.name = :role")
    List<User> findUsersByRole(@Param("role") String role);
}