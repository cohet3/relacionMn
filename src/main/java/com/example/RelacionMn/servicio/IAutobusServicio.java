package com.example.RelacionMn.servicio;

import com.example.RelacionMn.modelo.autobuses.Autobuse;

import java.util.List;

public interface IAutobusServicio {
    Autobuse insertar(Autobuse a);
    Autobuse modificar(Autobuse a);
    void eliminar(String matricula);
    List<Autobuse> obtenerTodos();
    Autobuse obtenerUno(String matricula);

}
