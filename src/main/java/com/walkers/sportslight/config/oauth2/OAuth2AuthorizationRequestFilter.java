package com.walkers.sportslight.config.oauth2;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
@Slf4j
public class OAuth2AuthorizationRequestFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String requestURI = request.getRequestURI();

        if(requestURI.startsWith("/actuator")){
            filterChain.doFilter(request, response);
            return;
        }



        if (requestURI.startsWith("/login/oauth2/code")) {
            log.info("Authorization request: " + request.getQueryString());
        }
        filterChain.doFilter(request, response);
    }
}
