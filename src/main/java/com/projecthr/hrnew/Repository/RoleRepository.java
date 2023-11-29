package com.projecthr.hrnew.Repository;

import com.projecthr.hrnew.Entity.Enum.ERole;
import com.projecthr.hrnew.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
