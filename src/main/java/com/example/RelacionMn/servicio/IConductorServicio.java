package com.example.RelacionMn.servicio;

import com.example.RelacionMn.modelo.autobuses.Autobuse;
import com.example.RelacionMn.modelo.autobuses.Conductore;

import java.util.List;

public interface IConductorServicio {
    Conductore insertar(Conductore c);
    Conductore modificar(Conductore c);
    void eliminar(String dni);
    List<Conductore> obtenerTodos();
    Conductore obtenerUno(String c);
}
