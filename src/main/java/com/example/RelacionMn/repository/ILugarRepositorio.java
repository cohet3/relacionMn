package com.example.RelacionMn.repository;

import com.example.RelacionMn.modelo.autobuses.Lugar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILugarRepositorio extends JpaRepository<Lugar, String> {
}
