package com.example.RelacionMn.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
@IdClass(ConsultaAnalitica.class)

@Table(name="consulta_analitica2")
public class ConsultaAnalitica {
    @Id
    private Consultas2 consulta;
    @Id
    private Analitica2 analitica;
}
