package com.projecthr.hrnew.Repository;

import com.projecthr.hrnew.Entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<Request, Long> {
}
