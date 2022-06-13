package reto.kruger.vacunacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import reto.kruger.vacunacion.model.ERole;
import reto.kruger.vacunacion.model.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
