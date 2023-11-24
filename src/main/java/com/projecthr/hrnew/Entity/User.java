package com.projecthr.hrnew.Entity;

import com.projecthr.hrnew.Entity.Enum.User_Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "user")
public class User {
    //users can have a role get their roles from the ENUM User_Role.
    //Users can only have one role.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String name;
    private String lastName;
    private String email;
    private String password;
    private int age;
    private LocalDateTime createdAt;
    @Enumerated(EnumType.STRING)
    private User_Role role;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;
    @OneToMany(mappedBy = "user")
    private List<Vacation> vacations;
    @OneToMany(mappedBy = "user")
    private List<Task> tasks;
    @OneToMany(mappedBy = "user")
    private List<Reports> reports;
    @OneToMany(mappedBy = "user")
    private List<Request> requests;

    public void setId(Long userId) {
        this.userId = userId;
    }
}
