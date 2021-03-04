package com.swift.akc.dto;

import com.swift.akc.entity.Admin;

public class AppContext {

  private static final ThreadLocal<Admin> APP_CONTEXT = new ThreadLocal<>();

  public static void setAdmin(Admin admin) {
    APP_CONTEXT.set(admin);
  }

  public static Admin getAdmin() {
    return APP_CONTEXT.get();
  }

  public static void destroy() {
    APP_CONTEXT.remove();
  }
}
