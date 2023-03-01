package com.ltp.RegisterForm.service;

import com.ltp.RegisterForm.entity.User;
import com.ltp.RegisterForm.web.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
