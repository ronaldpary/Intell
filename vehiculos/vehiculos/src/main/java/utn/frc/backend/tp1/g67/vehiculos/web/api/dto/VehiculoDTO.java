package utn.frc.backend.tp1.g67.vehiculos.web.api.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;
import utn.frc.backend.tp1.g67.vehiculos.dal.VehiculoRepository;
import utn.frc.backend.tp1.g67.vehiculos.domain.VehiculoEntity;

@Data
@NoArgsConstructor
public class VehiculoDTO {

    protected Integer ID;
    @NotBlank(message = "ID es obligatorio")

    protected String PATENTE;
    @NotBlank(message = "ID es obligatoiro")

    protected Integer ID_MODELO;
    @NotBlank(message = "ID es obligatoiro")

    public VehiculoDTO(VehiculoEntity entity) {
        ID = entity.getID();
        PATENTE = entity.getPATENTE();
        ID_MODELO = entity.getID_MODELO();
    }

    public VehiculoEntity toVehiculoEntity() {
        return new VehiculoEntity(ID, PATENTE, ID_MODELO);
    }
}
