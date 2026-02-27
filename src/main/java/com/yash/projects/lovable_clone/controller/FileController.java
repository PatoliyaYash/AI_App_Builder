package com.yash.projects.lovable_clone.controller;

import com.yash.projects.lovable_clone.dto.project.FileContentResponse;
import com.yash.projects.lovable_clone.dto.project.FileNode;
import com.yash.projects.lovable_clone.dto.project.FileTreeResponse;
import com.yash.projects.lovable_clone.service.ProjectFileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/projects/{projectId}/files")
public class FileController {

    private final ProjectFileService fileService;

    @GetMapping
    public ResponseEntity<FileTreeResponse> getFileTree(@PathVariable Long projectId) {
        Long userId = 1L;
        return ResponseEntity.ok(fileService.getFileTree(projectId));
    }

    @GetMapping("/content")
    public ResponseEntity<FileContentResponse> getFile(
            @PathVariable Long projectId,
            @RequestParam String path) {
        return ResponseEntity.ok(fileService.getFileContent(projectId, path));
    }
}
