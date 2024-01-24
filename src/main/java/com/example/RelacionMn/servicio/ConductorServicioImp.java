package com.example.RelacionMn.servicio;

import com.example.RelacionMn.modelo.autobuses.Conductore;
import com.example.RelacionMn.repository.IConductorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConductorServicioImp implements IConductorServicio {

    @Autowired
    private IConductorRepo conductorRepo;

    @Override
    public Conductore insertar(Conductore c) {
        return conductorRepo.save(c);
    }

    @Override
    public Conductore modificar(Conductore c) {
        return conductorRepo.save(c);
    }

    @Override
    public void eliminar(String dni) {
        conductorRepo.deleteById((dni));
    }
    @Override
    public List<Conductore> obtenerTodos() {
        return conductorRepo.findAll();
    }

    @Override
    public Conductore obtenerUno(String dni) {
        return conductorRepo.findById(dni).orElse(new Conductore());
    }
}
