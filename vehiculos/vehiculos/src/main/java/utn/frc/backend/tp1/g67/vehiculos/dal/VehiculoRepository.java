package utn.frc.backend.tp1.g67.vehiculos.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import utn.frc.backend.tp1.g67.vehiculos.domain.VehiculoEntity;

public interface VehiculoRepository extends JpaRepository<VehiculoEntity, Integer>{
}
