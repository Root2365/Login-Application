package com.login.app.controller;

import com.login.app.constant.AppsConstants;
import com.login.app.dto.SignInRQ;
import com.login.app.dto.SignUpRQ;
import com.login.app.dto.UserDTO;
import com.login.app.dto.common.ResponseDTO;
import com.login.app.exception.AppsException;
import com.login.app.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/login")
    public ResponseEntity<ResponseDTO<UserDTO>> signIn(@RequestBody SignInRQ signInRQ) {
        ResponseDTO<UserDTO> response = new ResponseDTO<>();

        try {
            UserDTO userDTO = this.userService.signIn(signInRQ);
            response.setResult(userDTO);
            response.setStatus(AppsConstants.ResponseStatus.SUCCESS);
        } catch (AppsException e) {
            response.setStatus(AppsConstants.ResponseStatus.FAILED);
            response.setAppsErrorMessages(e.getAppsErrorMessages());
        }

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping(value = "/register")
    public ResponseEntity<ResponseDTO<UserDTO>> saveUser(@RequestBody SignUpRQ signUpRQ) {
        ResponseDTO<UserDTO> response = new ResponseDTO<>();

        try {
            UserDTO userDTO = this.userService.signUp(signUpRQ);
            response.setResult(userDTO);
            response.setStatus(AppsConstants.ResponseStatus.SUCCESS);
        } catch (AppsException e) {
            response.setStatus(AppsConstants.ResponseStatus.FAILED);
            response.setAppsErrorMessages(e.getAppsErrorMessages());
        }

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
