package com.yash.projects.lovable_clone.controller;

import com.yash.projects.lovable_clone.dto.auth.AuthResponse;
import com.yash.projects.lovable_clone.dto.auth.SignupRequest;
import com.yash.projects.lovable_clone.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

    private AuthService authService;

    public ResponseEntity<AuthResponse> signup(SignupRequest request){
        return ResponseEntity.ok(authService.signup(request));
    }
}
