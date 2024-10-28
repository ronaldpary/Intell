package utn.frc.backend.tp1.g67.pruebas.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.frc.backend.tp1.g67.pruebas.dal.PruebaRepository;
import utn.frc.backend.tp1.g67.pruebas.web.api.dto.PruebaDTO;

import java.util.List;
import java.util.Optional;

@Service
public class PruebasService {

    private PruebaRepository rep;

    @Autowired
    public PruebasService(PruebaRepository rep) {
        this.rep = rep;
    }

    public List<PruebaDTO> findAll() {
        return rep.findAll().stream().map(pruebaEntity -> new PruebaDTO(pruebaEntity)).toList();
    }

}
