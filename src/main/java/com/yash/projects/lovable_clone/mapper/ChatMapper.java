package com.yash.projects.lovable_clone.mapper;

import com.yash.projects.lovable_clone.dto.chat.ChatResponse;
import com.yash.projects.lovable_clone.entity.ChatMessage;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ChatMapper {

    List<ChatResponse> fromListOfChatMessage(List<ChatMessage> chatMessageList);
}
