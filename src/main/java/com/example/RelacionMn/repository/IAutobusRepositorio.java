package com.example.RelacionMn.repository;

import com.example.RelacionMn.modelo.autobuses.Autobuse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAutobusRepositorio extends JpaRepository <Autobuse,String> {

}
