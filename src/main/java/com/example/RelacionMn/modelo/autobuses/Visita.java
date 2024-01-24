package com.example.RelacionMn.modelo.autobuses;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "visitas")
public class Visita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVisita;

    @ManyToOne
    @JoinColumn(name = "matricula",
            nullable = false,
            foreignKey = @ForeignKey(name="FK_visita_autobus"))
    private Autobuse autobus;

    @ManyToOne
    @JoinColumn(name = "dni",
            nullable = false,
            foreignKey = @ForeignKey(name="FK_visita_conductor"))
    private Conductore conductor;

    @ManyToOne
    @JoinColumn(name = "idLugar",
            nullable = false,
            foreignKey = @ForeignKey(name="FK_visita_lugar"))
    private Lugar lugar;
    private LocalDate Fvisita;

    public Autobuse getAutobus() {
        return autobus;
    }

    public void setAutobus(Autobuse autobus) {
        this.autobus = autobus;
    }

    public Conductore getConductor() {
        return conductor;
    }

    public void setConductor(Conductore conductor) {
        this.conductor = conductor;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public LocalDate getFvisita() {
        return Fvisita;
    }

    public void setFvisita(LocalDate fvisita) {
        Fvisita = fvisita;
    }

    @Override
    public String toString() {
        return "Visita{" +
                "idVisita=" + idVisita +
                ", Fvisita=" + Fvisita +
                '}';
    }

    public Visita(int idVisita, LocalDate fvisita) {
        this.idVisita = idVisita;
        Fvisita = fvisita;
    }
}
