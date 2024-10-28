package utn.frc.backend.tp1.g67.vehiculos.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.frc.backend.tp1.g67.vehiculos.web.api.dto.VehiculoDTO;
import utn.frc.backend.tp1.g67.vehiculos.web.service.VehiculosService;

import java.util.List;

@RestController
@RequestMapping("/vehiculos")

public class VehiculosAPI {

    private VehiculosService service;

    @Autowired
    public VehiculosAPI(VehiculosService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<VehiculoDTO>> findPruebas() {
        List<VehiculoDTO> vehiculos = service.findAll();

        return vehiculos.isEmpty()
                ? ResponseEntity.noContent().build()
                : ResponseEntity.ok(vehiculos);
    }
}
