package com.swift.akc.utils;

import lombok.experimental.UtilityClass;
import org.apache.commons.codec.binary.Base64;

@UtilityClass
public class SecurityUtils {

  public String base64Encode(int userId){
    Base64 base64 = new Base64();
    return new String(base64.encode(String.valueOf(userId).getBytes()));
  }

  public String base64Decode(String token){
    Base64 base64 = new Base64();
    return new String(base64.decode(token));
  }

}
