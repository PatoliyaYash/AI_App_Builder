package com.yash.projects.lovable_clone.service;

import com.yash.projects.lovable_clone.dto.chat.StreamResponse;
import reactor.core.publisher.Flux;

import java.util.Optional;

public interface AiGenerationService {
    Flux<StreamResponse> streamResponse(String message, Long projectId);
}
