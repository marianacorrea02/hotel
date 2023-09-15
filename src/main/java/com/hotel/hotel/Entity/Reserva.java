package com.hotel.hotel.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "reserva")
public class Reserva{
    @Id
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sede_id")
    private SedeHotel sedeId;

    @ManyToOne
    @JoinColumn(name = "habitacion_id")
    private Habitacion habitacionId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "temporada_id")
    private Temporada temporadaId;

    @Column 
    private int num_personas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SedeHotel getSedeId() {
        return sedeId;
    }

    public void setSedeId(SedeHotel sedeId) {
        this.sedeId = sedeId;
    }

    public Habitacion getHabitacionId() {
        return habitacionId;
    }

    public void setHabitacionId(Habitacion habitacionId) {
        this.habitacionId = habitacionId;
    }

    public Temporada getTemporadaId() {
        return temporadaId;
    }

    public void setTemporadaId(Temporada temporadaId) {
        this.temporadaId = temporadaId;
    }

    public int getNum_personas() {
        return num_personas;
    }

    public void setNum_personas(int num_personas) {
        this.num_personas = num_personas;
    }

    
}