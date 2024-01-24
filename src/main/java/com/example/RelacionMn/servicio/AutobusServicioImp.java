package com.example.RelacionMn.servicio;

import com.example.RelacionMn.modelo.autobuses.Autobuse;
import com.example.RelacionMn.repository.IAutobusRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutobusServicioImp implements IAutobusServicio{
    @Autowired
    private IAutobusRepositorio repoAutobus;
    @Override
    public Autobuse insertar(Autobuse a) {
        return repoAutobus.save(a);
    }

    @Override
    public Autobuse modificar(Autobuse a) {
        return repoAutobus.save(a);
    }

    @Override
    public void eliminar(String matricula) {
repoAutobus.deleteById(matricula);

    }

    @Override
    public List<Autobuse> obtenerTodos() {
        return repoAutobus.findAll();
    }

    @Override
    public Autobuse obtenerUno(String matricula) {
        return repoAutobus.findById(matricula).orElse(new Autobuse());
    }
}
