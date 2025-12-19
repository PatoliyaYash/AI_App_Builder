package com.yash.projects.lovable_clone.mapper;

import com.yash.projects.lovable_clone.dto.member.MemberResponse;
import com.yash.projects.lovable_clone.entity.ProjectMember;
import com.yash.projects.lovable_clone.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProjectMemberMapper {

    @Mapping(target = "userId", source = "id")
    @Mapping(target = "projectRole", constant = "OWNER")
    MemberResponse toProjectMemberResponseFromOwner(User owner);

    @Mapping(target = "userId", source = "user.id")
    @Mapping(target = "name", source = "user.name")
    @Mapping(target = "email", source = "user.email")
    MemberResponse toProjectMemberResponseFromMember(ProjectMember projectMember);
}
