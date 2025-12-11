package com.yash.projects.lovable_clone.service;

import com.yash.projects.lovable_clone.dto.subscription.PlanResponse;

import java.util.List;

public interface PlanService {
    List<PlanResponse> getAllActivePlans();
}
