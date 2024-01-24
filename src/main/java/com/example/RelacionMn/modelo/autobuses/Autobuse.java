package com.example.RelacionMn.modelo.autobuses;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "autobuses")
public class Autobuse {
    @Id
    @Column(length =7)
    private String matricula;
    private int AFabricacion;

    @OneToMany(mappedBy = "autobus",
            cascade = CascadeType.ALL,
            fetch= FetchType.EAGER)
    private List<Visita> visitas;

    //lista de visitas, mapping, wide, cascade


    public Autobuse(String matricula, int AFabricacion) {
        this.matricula = matricula;
        this.AFabricacion = AFabricacion;
    }
}


