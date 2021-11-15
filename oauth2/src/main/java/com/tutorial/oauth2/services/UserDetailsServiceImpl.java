package com.tutorial.oauth2.services;

import com.tutorial.oauth2.model.AuthUser;
import com.tutorial.oauth2.model.User;
import com.tutorial.oauth2.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByuserName(username);
        if (user == null)throw new UsernameNotFoundException("User name not found");
        UserDetails userDetails = new AuthUser(user);
        return userDetails;
    }

    public List<User> getAllUsers(){
        List<User> userDetails = userRepository.readAllByUserNameIsNotNull();
        return userDetails;
    }

    public void createUser(User user){
        userRepository.saveAndFlush(user);
    }
    public void deleteUser(String userName){
        userRepository.deleteByUserName(userName);
    }

    public Integer updateUserById(String userName, Long id){
        return userRepository.updateUserNameById(userName, id);
    }
    public User searchUser(String character){
        return userRepository.getTopByUserNameContaining(character);
    }
    public List<User> searchUser(Long id, String userName  ){
        return userRepository.getTopByIdOrUserNameContaining(id, userName);
    }
}
