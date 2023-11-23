package com.projecthr.hrnew.Repository;

import com.projecthr.hrnew.Entity.Department;
import com.projecthr.hrnew.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
