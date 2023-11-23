package com.projecthr.hrnew.Service;

import com.projecthr.hrnew.Entity.Project;


import java.util.List;


public interface ProjectService {
    List<Project> getAllProjects();
    Project getProjectById(Long projectId);
    Project createProject(Project project);
    Project updateProject(Long projectId, Project project);
    void deleteProject(Long projectId);
}
