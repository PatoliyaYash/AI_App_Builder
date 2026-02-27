package com.yash.projects.lovable_clone.repository;

import com.yash.projects.lovable_clone.entity.ChatEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatEventRepository extends JpaRepository<ChatEvent, Long> {
}
