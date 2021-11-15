package com.tutorial.oauth2.repositories;

import com.tutorial.oauth2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByuserName(String userName);
    List<User> readAllByUserNameIsNotNull();
    User saveAndFlush(User user);
    void deleteByUserName(String userName);
    @Modifying
    @Query("update User user set user.userName = ?1 where user.id = ?2")
    Integer updateUserNameById(String userName,Long userId);
    User getTopByUserNameContaining(String character);
    List<User> getTopByIdOrUserNameContaining( Long id, String userName);
}