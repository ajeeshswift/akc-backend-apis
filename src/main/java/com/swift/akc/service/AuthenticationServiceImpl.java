package com.swift.akc.service;

import com.sun.org.apache.xml.internal.security.algorithms.SignatureAlgorithm;
import com.swift.akc.entity.Admin;
import com.swift.akc.exceptions.AuthenticationException;
import com.swift.akc.model.AuthenticationModel;
import com.swift.akc.repository.AdminRepository;
import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
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

  @Override
  public String getJWTToken(String userName) {
     /*String secretKey = "mySecretKey";
    List<GrantedAuthority> grantedAuthorities = AuthorityUtils
        .commaSeparatedStringToAuthorityList("ROLE_USER");

   String token = Jwts
        .builder()
        .setId("softtekJWT")
        .setSubject(userName)
        .claim("authorities",
            grantedAuthorities.stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.toList()))
        .setIssuedAt(new Date(System.currentTimeMillis()))
        .setExpiration(new Date(System.currentTimeMillis() + 600000))
        .signWith(SignatureAlgorithm.HS512,
            secretKey.getBytes()).compact();*/

    //return "Bearer " + token;
    return "Bearer " ;
  }
  //}

}
