package com.projecthr.hrnew.Service;

import com.projecthr.hrnew.Entity.Department;
import com.projecthr.hrnew.Entity.Department;

import java.util.List;

public interface DepartmentService {
    Department createDepartment(Department department);
    Department updateDepartment(Department department);
    Department getDepartmentById(Long departmentId);
    List<Department> getAllDepartments();
    void deleteDepartment(Long DepartmentId);
}
