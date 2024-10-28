package utn.frc.backend.tp1.g67.vehiculos.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.frc.backend.tp1.g67.vehiculos.dal.VehiculoRepository;
import utn.frc.backend.tp1.g67.vehiculos.web.api.dto.VehiculoDTO;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculosService {

    private VehiculoRepository rep;

    @Autowired
    public VehiculosService(VehiculoRepository rep) {
        this.rep = rep;
    }

    public List<VehiculoDTO> findAll() {
        return rep.findAll().stream().map(vehiculoEntity -> new VehiculoDTO(vehiculoEntity)).toList();
    }
}
