package com.swift.akc.service;


import com.swift.akc.entity.Admin;
import com.swift.akc.exceptions.AuthenticationException;
import com.swift.akc.model.AuthenticationModel;
import com.swift.akc.repository.AdminRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;



@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {

  private final AdminRepository adminRepository;

  @Override
  public Admin userValidation(AuthenticationModel authenticationModel){
    Admin admin = adminRepository.findByNameAndPass(authenticationModel.getUserName(), DigestUtils.md5Hex(authenticationModel.getPassword()));

    if(admin==null){
      throw new AuthenticationException("Invalid User name or Password");
    }
    return admin;
  }



}
