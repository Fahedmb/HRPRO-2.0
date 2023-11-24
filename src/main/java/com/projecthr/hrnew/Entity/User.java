package com.projecthr.hrnew.Entity;

import com.projecthr.hrnew.Entity.Enum.User_Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "user")
public class User {
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

    public void setId(Long userId) {
    }
}
