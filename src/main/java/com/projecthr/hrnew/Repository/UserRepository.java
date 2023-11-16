package com.projecthr.hrnew.Repository;

import com.projecthr.hrnew.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
