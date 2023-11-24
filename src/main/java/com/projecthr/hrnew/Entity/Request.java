package com.projecthr.hrnew.Entity;

import com.projecthr.hrnew.Entity.Enum.Request_type;
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
@Table(name = "request")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long requestId;
    @Enumerated(EnumType.STRING)
    private Request_type type;
    private String name;
    private String description;
    private LocalDateTime Submitted_at;

    public static void setId(Long requestId) {
    }
}
