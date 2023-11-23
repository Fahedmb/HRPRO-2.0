package com.projecthr.hrnew.Controller;

import com.projecthr.hrnew.Entity.*;
import com.projecthr.hrnew.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @PostMapping
    public Department createDepartment(@RequestBody Department department) {
        return departmentService.createDepartment(department);
    }

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable Long departmentId) {
        return departmentService.getDepartmentById(departmentId);
    }

    @GetMapping
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @PutMapping("/{departmentId}")
    public Department updateDepartment(@PathVariable Long departmentId, @RequestBody Department department) {
        Department.setId(departmentId);
        return departmentService.updateDepartment(department);
    }

    @DeleteMapping("/{departmentId}")
    public void deleteDepartment(@PathVariable Long departmentId) {
        departmentService.deleteDepartment(departmentId);
    }
}


