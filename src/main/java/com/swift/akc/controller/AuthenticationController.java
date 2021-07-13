package com.swift.akc.controller;

import com.swift.akc.dto.AdminDTO;
import com.swift.akc.entity.Admin;
import com.swift.akc.model.AuthenticationModel;
import com.swift.akc.service.AuthenticationService;
import com.swift.akc.utils.SecurityUtils;
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
    AdminDTO adminDTO = new AdminDTO();
    Admin admin = authenticationService.userValidation(authenticationModel);
System.out.println("admin :"+admin);

    String token = SecurityUtils.base64Encode(admin.getId());
System.out.println("token :"+token);
    adminDTO.setUserName(admin.getName());
    adminDTO.setToken(token);
System.out.println("adminDTO :"+adminDTO);
    return adminDTO;
  }

}
