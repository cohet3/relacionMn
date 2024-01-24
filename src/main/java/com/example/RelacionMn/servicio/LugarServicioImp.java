package com.example.RelacionMn.servicio;


import com.example.RelacionMn.modelo.autobuses.Lugar;
import com.example.RelacionMn.repository.ILugarRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LugarServicioImp implements ILugarServicio {
    @Autowired
    private ILugarRepositorio repoLugar;
    @Override
    public Lugar insertar(Lugar l) {
        return repoLugar.save(l);
    }

    @Override
    public Lugar modificar(Lugar l) {
        return repoLugar.save(l);
    }

    @Override
    public void eliminar(int idLugar) {
        repoLugar.deleteById(String.valueOf(idLugar));

    }

    @Override
    public List<Lugar> obtenerTodos() {
            return repoLugar.findAll();
    }

    @Override
    public Lugar obtenerUno(int idLugar) {
        return repoLugar.findById(String.valueOf(idLugar)).orElse(new Lugar());
    }
}
