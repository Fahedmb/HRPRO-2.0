package com.projecthr.hrnew.Repository;

import com.projecthr.hrnew.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
