package com.example.RelacionMn.repository;

import com.example.RelacionMn.modelo.autobuses.Conductore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IConductorRepo extends JpaRepository<Conductore, String> {
}
