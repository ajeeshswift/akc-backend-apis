package com.swift.akc.controller;

import com.swift.akc.entity.Admin;
import com.swift.akc.model.AuthenticationModel;
import com.swift.akc.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
@RequiredArgsConstructor
public class AuthenticationController {

  private final AuthenticationService authenticationService;

  @PostMapping("/userValidation")
    public Admin validation(@RequestBody AuthenticationModel authenticationModel){
    return authenticationService.userValidation(authenticationModel);

}

}
