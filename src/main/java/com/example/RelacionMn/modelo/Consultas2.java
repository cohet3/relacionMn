package com.example.RelacionMn.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table (name = "Consulta2")
public class Consultas2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idConsulta;
    @Column(nullable = false)
    private LocalTime hora;
    @Column(nullable = false)
    private LocalDate Fecha;

    @ManyToMany
    @JoinTable (name = "consultas analiticas", joinColumns = @JoinColumn( name = "idConsulta " ,referencedColumnName = "idConsulta" ),
            inverseJoinColumns = @JoinColumn (name = " id_Analitica", referencedColumnName  ="idAnalitica"))
    private List<Analitica2> analiticas;


}

