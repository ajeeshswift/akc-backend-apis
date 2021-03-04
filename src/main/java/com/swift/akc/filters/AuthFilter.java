package com.swift.akc.filters;

import com.swift.akc.dto.AppContext;
import com.swift.akc.entity.Admin;
import com.swift.akc.exceptions.AuthenticationException;
import com.swift.akc.service.AuthenticationService;
import com.swift.akc.utils.SecurityUtils;
import java.io.IOException;
import java.util.Enumeration;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class AuthFilter implements Filter {

  private final AuthenticationService authenticationService;

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {

  }

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {
    HttpServletRequest httpRequest = (HttpServletRequest) request;
    String token = httpRequest.getHeader("Authorization");
    if (token != null) {
      log.info("Authorization encoded token {}", token);
      Integer id = Integer.valueOf(SecurityUtils.base64Decode(token));
      Admin admin = authenticationService.fetchById(id);
      if(admin == null) {
        throw new AuthenticationException("Either user or password incorrect");
      }
      AppContext.setAdmin(admin);
    }
    chain.doFilter(httpRequest, response);
  }

  @Override
  public void destroy() {
    AppContext.destroy();
  }
}
