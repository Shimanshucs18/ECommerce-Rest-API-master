package com.tothenew.shimanshu;

import com.tothenew.shimanshu.Model.Role;
import com.tothenew.shimanshu.Model.User;
import com.tothenew.shimanshu.Repository.RoleRepository;
import com.tothenew.shimanshu.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class Boostrap implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;
    @Autowired
    PasswordEncoder passwordEncoder;


    @Override
    public void run(ApplicationArguments args) throws Exception {

        if (Objects.isNull((roleRepository.findByAuthority("ROLE_ADMIN")))) {
            Role role = new Role();
            role.setAuthority("ROLE_ADMIN");
            roleRepository.save(role);
        }
        if (Objects.isNull((roleRepository.findByAuthority("ROLE_SELLER")))) {
            Role role = new Role();
            role.setAuthority("ROLE_SELLER");
            roleRepository.save(role);
        }

        if (Objects.isNull((roleRepository.findByAuthority("ROLE_CUSTOMER")))) {
            Role role = new Role();
            role.setAuthority("ROLE_CUSTOMER");
            roleRepository.save(role);
        }
        if (Objects.isNull(userRepository.findUserByEmail("shimanshu.sharma@tothenew.com"))) {
            User user = new User();
            user.setFirstName("Shimanshu");
            user.setLastName("Sharma");
            user.setEmail("shimanshu.sharma@tothenew.com");
            user.setPassword(passwordEncoder.encode("Shimanshu@1111"));
            user.setIsActive(true);
            user.setIsDeleted(false);
            user.setIsExpired(false);
            user.setIsLocked(false);

            Role role = roleRepository.findByAuthority("ROLE_ADMIN");
            Set<Role> roles = new HashSet<>();
            roles.add(role);
            user.setRoles(roles);
            userRepository.save(user);

        }
    }
}




