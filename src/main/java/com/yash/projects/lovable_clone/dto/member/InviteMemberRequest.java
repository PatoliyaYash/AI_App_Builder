package com.yash.projects.lovable_clone.dto.member;

import com.yash.projects.lovable_clone.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
) {
}
