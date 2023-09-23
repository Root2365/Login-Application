package com.login.app.service;

import com.login.app.constant.AppsConstants;
import com.login.app.dto.UserDTO;
import com.login.app.entity.User;
import com.login.app.exception.AppsException;
import com.login.app.dto.SignInRQ;
import com.login.app.dto.SignUpRQ;
import com.login.app.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserDTO signIn(SignInRQ model) throws AppsException {
        User user = this.userRepository.findByEmailAndPassword(model.getUsername(), model.getPassword());
        if (user != null) {
            return new UserDTO(user);
        } else {
            throw new AppsException("User not found");
        }
    }

    public UserDTO signUp(SignUpRQ signUpRQ) throws AppsException {
        User user = userRepository.findByEmail(signUpRQ.getEmail());
        if (user == null) {
            user = new User();

            user.setFirstName(signUpRQ.getFirstName());
            user.setLastName(signUpRQ.getLastName());
            user.setEmail(signUpRQ.getEmail());
            user.setPassword(signUpRQ.getPassword());
            user.setStatus(AppsConstants.Status.ACT);
            user.setUserRole(signUpRQ.getRole());

            user = this.userRepository.saveAndFlush(user);
            return new UserDTO(user);
        } else {
            throw new AppsException("Email already registered!");
        }
    }
}
