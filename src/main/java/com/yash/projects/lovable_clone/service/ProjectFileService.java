package com.yash.projects.lovable_clone.service;

import com.yash.projects.lovable_clone.dto.project.FileContentResponse;
import com.yash.projects.lovable_clone.dto.project.FileNode;
import com.yash.projects.lovable_clone.dto.project.FileTreeResponse;

import java.util.List;

public interface ProjectFileService {
    FileTreeResponse getFileTree(Long projectId);

    FileContentResponse getFileContent(Long projectId, String path);

    void saveFile(Long projectId, String filePath, String fileContent);
}
