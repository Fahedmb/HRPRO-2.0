package com.projecthr.hrnew.Repository;

import com.projecthr.hrnew.Entity.Vacation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VacationRepository extends JpaRepository<Vacation, Long> {
}
