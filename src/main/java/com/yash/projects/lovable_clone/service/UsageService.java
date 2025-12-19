package com.yash.projects.lovable_clone.service;

import com.yash.projects.lovable_clone.dto.subscription.PlanLimitsResponse;
import com.yash.projects.lovable_clone.dto.subscription.UsageTodayResponse;

public interface UsageService {
    UsageTodayResponse getTodayUsageOfUser(Long userId);

    PlanLimitsResponse getCurrentSubscriptionLimitOfUser(Long userId);
}
