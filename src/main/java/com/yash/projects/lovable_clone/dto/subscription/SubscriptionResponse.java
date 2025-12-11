package com.yash.projects.lovable_clone.dto.subscription;

import java.time.Instant;

public record SubscriptionResponse(
        PlanResponse plan,
        String Status,
        Instant periodEnd,
        Long tokenUsedThisCycle
) {
}
