package com.tutorial.oauth2.repositories;

import com.tutorial.oauth2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByuserName(String userName);
}
