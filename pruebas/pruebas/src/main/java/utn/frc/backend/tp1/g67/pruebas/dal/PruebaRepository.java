package utn.frc.backend.tp1.g67.pruebas.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import utn.frc.backend.tp1.g67.pruebas.domain.PruebaEntity;

public interface PruebaRepository extends JpaRepository<PruebaEntity, Integer>{
}
