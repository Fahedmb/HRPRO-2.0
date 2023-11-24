package com.projecthr.hrnew.Repository;

import com.projecthr.hrnew.Entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
