package com.projecthr.hrnew.Repository;

import com.projecthr.hrnew.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
