package com.yash.projects.lovable_clone.service;

import com.yash.projects.lovable_clone.dto.auth.AuthResponse;
import com.yash.projects.lovable_clone.dto.auth.SignupRequest;
import org.jspecify.annotations.Nullable;

public interface AuthService {
    AuthResponse signup(SignupRequest request);
}
