package reto.kruger.vacunacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import reto.kruger.vacunacion.security.service.Users;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
    Optional<Users> findByUsername(String username);
    Boolean existsUsername(String username);
    Boolean existsByEmail (String email);
}
