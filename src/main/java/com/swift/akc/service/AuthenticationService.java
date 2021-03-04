package com.swift.akc.service;

import com.swift.akc.entity.Admin;
import com.swift.akc.model.AuthenticationModel;

public interface AuthenticationService {

  Admin userValidation(AuthenticationModel authenticationModel);

  Admin fetchById(Integer id);
}
