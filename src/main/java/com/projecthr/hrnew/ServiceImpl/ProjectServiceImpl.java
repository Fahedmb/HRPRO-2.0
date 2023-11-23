package com.projecthr.hrnew.ServiceImpl;

import com.projecthr.hrnew.Entity.Project;
import com.projecthr.hrnew.Repository.ProjectRepository;
import com.projecthr.hrnew.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectRepository projectRepository;


    @Override
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    @Override
    public Project getProjectById(Long projectId) {
        Optional<Project> optionalProject = projectRepository.findById(projectId);
        return optionalProject.orElse(null);
    }

    @Override
    public Project createProject(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public Project updateProject(Long projectId, Project updatedProject) {
        Optional<Project> optionalProject = projectRepository.findById(projectId);
        if (optionalProject.isPresent()) {
            Project existingProject = optionalProject.get();
            return projectRepository.save(existingProject);
        }
        return null;
    }

    @Override
    public void deleteProject(Long projectId) {
        projectRepository.deleteById(projectId);
    }
}
