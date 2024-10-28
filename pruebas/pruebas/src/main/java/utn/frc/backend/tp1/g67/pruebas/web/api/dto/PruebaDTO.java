package utn.frc.backend.tp1.g67.pruebas.web.api.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;
import utn.frc.backend.tp1.g67.pruebas.dal.PruebaRepository;
import utn.frc.backend.tp1.g67.pruebas.domain.PruebaEntity;

@Data
@NoArgsConstructor
public class PruebaDTO {

    protected Integer ID;
    @NotBlank(message = "ID es obligatorio")

    protected Integer ID_VEHICULO;
    @NotBlank(message = "ID es obligatorio")

    protected Integer ID_INTERESADO;
    @NotBlank(message = "ID es obligatorio")

    protected Integer ID_EMPLEADO;
    @NotBlank(message = "ID es obligatorio")

    protected String FECHA_HORA_INICIO;
    @NotBlank(message = "ID es obligatorio")

    protected String FECHA_HORA_FIN;
    @NotBlank(message = "ID es obligatorio")

    protected String COMENTARIOS;
    @NotBlank(message = "ID es obligatorio")

    public PruebaDTO(PruebaEntity entity) {
        ID = entity.getID();
        ID_VEHICULO = entity.getID_VEHICULO();
        ID_INTERESADO = entity.getID_INTERESADO();
        ID_EMPLEADO = entity.getID_EMPLEADO();
        FECHA_HORA_INICIO = entity.getFECHA_HORA_INICIO();
        FECHA_HORA_FIN = entity.getFECHA_HORA_FIN();
        COMENTARIOS = entity.getCOMENTARIOS();
    }

    public PruebaEntity toPruebaEntity() {
        return new PruebaEntity(ID, ID_VEHICULO, ID_INTERESADO, ID_EMPLEADO, FECHA_HORA_INICIO, FECHA_HORA_FIN, COMENTARIOS);
    }

}
