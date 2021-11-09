package com.tutorial.oauth2.dob.repositories;

import com.tutorial.oauth2.dob.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByuserName(String userName);
}
