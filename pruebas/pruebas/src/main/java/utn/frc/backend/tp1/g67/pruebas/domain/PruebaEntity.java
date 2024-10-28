package utn.frc.backend.tp1.g67.pruebas.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter @Setter @NoArgsConstructor @ToString

@Entity
@Table(name = "Pruebas")
public class PruebaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID", nullable = false)
    private Integer ID;

    @Basic
    @Column(name="ID_VEHICULO", nullable = false)
    private Integer ID_VEHICULO;

    @Basic
    @Column(name="ID_INTERESADO", nullable = false)
    private Integer ID_INTERESADO;

    @Basic
    @Column(name="ID_EMPLEADO", nullable = false)
    private Integer ID_EMPLEADO;

    @Basic
    @Column(name="FECHA_HORA_INICIO", nullable = false, length = 64)
    private String FECHA_HORA_INICIO;

    @Basic
    @Column(name="FECHA_HORA_FIN", nullable = false, length = 64)
    private String FECHA_HORA_FIN;

    @Basic
    @Column(name="COMENTARIOS", nullable = false, length = 128)
    private String COMENTARIOS;

    public PruebaEntity(Integer ID, Integer ID_VEHICULO, Integer ID_INTERESADO, Integer ID_EMPLEADO, String FECHA_HORA_INICIO, String FECHA_HORA_FIN, String COMENTARIOS) {
        this.ID = ID;
        this.ID_VEHICULO = ID_VEHICULO;
        this.ID_INTERESADO = ID_INTERESADO;
        this.ID_EMPLEADO = ID_EMPLEADO;
        this.FECHA_HORA_INICIO = FECHA_HORA_INICIO;
        this.FECHA_HORA_FIN = FECHA_HORA_FIN;
        this.COMENTARIOS = COMENTARIOS;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PruebaEntity that = (PruebaEntity) o;
        return Objects.equals(ID, that.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ID);
    }
}
