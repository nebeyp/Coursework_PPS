package com.example.kursovik_PPS.service;


import com.example.kursovik_PPS.config.CustomUser;
import com.example.kursovik_PPS.model.User;
import com.example.kursovik_PPS.repositories.UserRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;


@Component
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRep empRepo;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        User emp = empRepo.findByUsername(email);

        if (emp == null) {
            throw new UsernameNotFoundException("user name not found");
        } else {
            return new CustomUser(emp);
        }
    }

}