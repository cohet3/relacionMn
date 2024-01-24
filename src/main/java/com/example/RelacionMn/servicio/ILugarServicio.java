package com.example.RelacionMn.servicio;

import com.example.RelacionMn.modelo.autobuses.Conductore;
import com.example.RelacionMn.modelo.autobuses.Lugar;

import java.util.List;

public interface ILugarServicio {
    Lugar insertar(Lugar l);
    Lugar modificar(Lugar l);
    void eliminar(int idLugar);
    List<Lugar> obtenerTodos();
    Lugar obtenerUno(int idLugar);
}
