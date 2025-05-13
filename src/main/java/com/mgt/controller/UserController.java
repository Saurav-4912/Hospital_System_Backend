
package com.mgt.controller;

import com.mgt.jwtServices.JwtService;
import com.mgt.model.AuthRequest;
import com.mgt.model.User;
import com.mgt.model.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class UserController
{

    @Autowired
    private UserInfoService service;

    @Autowired
    private JwtService jwtService;

    @Autowired
    private AuthenticationManager authenticationManager;



    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome this endpoint is not secure";
    }

    @PostMapping("/register")
    public ResponseEntity<?> addNewUser(@RequestBody User userInfo) {
        String result = service.addUser(userInfo);

        if (result.equals("Error: Username already exists!")) {

            return ResponseEntity.ok(Collections.singletonMap("message", "Duplicate entory"));
        }
        return ResponseEntity.ok(Collections.singletonMap("message", "User created successfully"));
    }


    @PostMapping("/login")
    public ResponseEntity<String> authenticateAndGetToken(@RequestBody AuthRequest authRequest) {
        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));

            if (authentication.isAuthenticated()) {
            


                        String token = jwtService.generateToken(authRequest.getUsername());
                        return ResponseEntity.ok(token);

                } else {
                    return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
                }
          
        } catch (AuthenticationException ex) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Authentication failed: " + ex.getMessage());
        }
    }

    @GetMapping("/testApi")
    public String getMethodName() {
        return "This secure api endpoint";
    }
    


}
