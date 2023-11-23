package com.projecthr.hrnew.Entity;

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
@Table(name = "task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskId;
    private String name;
    private String description;
    private int complexity;
    private int priotity;
    private LocalDateTime starting_time;
    private LocalDateTime finishing_time;

    public static void setId(Long taskId) {
    }
}
