package utn.frc.backend.tp1.g67.pruebas.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.frc.backend.tp1.g67.pruebas.web.api.dto.PruebaDTO;
import utn.frc.backend.tp1.g67.pruebas.web.service.PruebasService;

import java.util.List;

@RestController
@RequestMapping("/pruebas")

public class PruebasAPI {

    private PruebasService service;

    @Autowired
    public PruebasAPI(PruebasService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<PruebaDTO>> findPruebas() {
        List<PruebaDTO> pruebas = service.findAll();

        return pruebas.isEmpty()
                ? ResponseEntity.noContent().build()
                : ResponseEntity.ok(pruebas);
    }

}
