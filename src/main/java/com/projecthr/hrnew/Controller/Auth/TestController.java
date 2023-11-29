package com.projecthr.hrnew.Controller.Auth;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {
    @GetMapping("/all")
    public String allAccess() {
        return "Public Content.";
    }

    @GetMapping("/user")
    @PreAuthorize
            ("hasRole('USER') or " +
            "hasRole('MAINTENANCEAGENT') or " +
            "hasRole('ADMIN') or " +
            "hasRole('CLIENT') or " +
            "hasRole('EMPLOYEE') or " +
            "hasRole('HUMANRECAURCE') or " +
            "hasRole('TEAMLEADER')")
    public String userAccess() {
        return "User Content.";
    }
    @GetMapping("/hr")
    @PreAuthorize("hasRole('HUMANRECAURCE')")
    public String humanrecaurceAccess() {
        return "Humanrecaurce Board.";
    }
    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminAccess() {
        return "Admin Board.";
    }
    @GetMapping("/client")
    @PreAuthorize("hasRole('CLIENT')")
    public String clientAccess() {
        return "Client Board.";
    }
    @GetMapping("/ma")
    @PreAuthorize("hasRole('MAINTENANCEAGENT')")
    public String maintenanceagentAccess() {
        return "Maintenanceagent Board.";
    }
    @GetMapping("/employee")
    @PreAuthorize("hasRole('EMPLOYEE')")
    public String employeeAccess() {
        return "Employee Board.";
    }
    @GetMapping("/tl")
    @PreAuthorize("hasRole('TEAMLEADER')")
    public String TeamleaderAccess() {
        return "Teamleader Board.";
    }
}
