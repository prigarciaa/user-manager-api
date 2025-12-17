package com.priscila.usermanager.repository;

import com.priscila.usermanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}