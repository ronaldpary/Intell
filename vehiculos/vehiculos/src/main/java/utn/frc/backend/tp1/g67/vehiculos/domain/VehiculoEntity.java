package utn.frc.backend.tp1.g67.vehiculos.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter @Setter @NoArgsConstructor @ToString

@Entity
@Table(name = "Vehiculos")

public class VehiculoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID", nullable = false)
    private Integer ID;

    @Basic
    @Column(name="PATENTE", nullable = false, length = 64)
    private String PATENTE;

    @Basic
    @Column(name="ID_MODELO", nullable = false)
    private Integer ID_MODELO;

    public VehiculoEntity(Integer ID, String PATENTE, Integer ID_MODELO) {
        this.ID = ID;
        this.PATENTE = PATENTE;
        this.ID_MODELO = ID_MODELO;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VehiculoEntity that = (VehiculoEntity) o;
        return Objects.equals(ID, that.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ID);
    }
}
