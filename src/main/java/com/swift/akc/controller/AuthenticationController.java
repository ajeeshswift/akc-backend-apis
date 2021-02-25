package com.swift.akc.controller;

import com.swift.akc.dto.AdminDTO;
import com.swift.akc.entity.Admin;
import com.swift.akc.model.AuthenticationModel;
import com.swift.akc.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
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
    public AdminDTO validation(@RequestBody AuthenticationModel authenticationModel){

    String token = authenticationService.getJWTToken(authenticationModel.getUserName());
    AdminDTO adminDTO = new AdminDTO();
    adminDTO.setUserName(authenticationModel.getUserName());
    adminDTO.setToken(token);
    return adminDTO;

    //return authenticationService.userValidation(authenticationModel);

}

}
