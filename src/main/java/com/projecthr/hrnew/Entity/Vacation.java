package com.projecthr.hrnew.Entity;

import com.projecthr.hrnew.Entity.Enum.Vacation_Status;
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
@Table(name = "vacation")
public class Vacation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vacationId;
    private String Reason;
    private String Description;
    private LocalDateTime Submission_date;
    private LocalDateTime Starting_date;
    private LocalDateTime Finishing_date;
    @Enumerated(EnumType.STRING)
    private Vacation_Status vacation_status;

    public static void setId(Long vacationId) {
    }
}
