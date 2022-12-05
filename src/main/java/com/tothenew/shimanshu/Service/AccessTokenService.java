package com.tothenew.shimanshu.Service;

import com.tothenew.shimanshu.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccessTokenService {
    @Autowired
    UserRepository userRepository;

}