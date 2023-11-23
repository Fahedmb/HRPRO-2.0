package com.projecthr.hrnew.Repository;

import com.projecthr.hrnew.Entity.Reports;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<Reports, Long> {
}
