package com.hotel.hotel.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "temporada")
public class Tarifa {
    @Id
    private Long id;

    @Column
    private double precio;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sede_id")
    private SedeHotel sedeId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "temporada_id")
    private Temporada temporadaId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo_id")
    private Tipo tipoId;

    @Column 
    private int num_personas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public SedeHotel getSedeId() {
        return sedeId;
    }

    public void setSedeId(SedeHotel sedeId) {
        this.sedeId = sedeId;
    }

    public Temporada getTemporadaId() {
        return temporadaId;
    }

    public void setTemporadaId(Temporada temporadaId) {
        this.temporadaId = temporadaId;
    }

    public Tipo getTipoId() {
        return tipoId;
    }

    public void setTipoId(Tipo tipoId) {
        this.tipoId = tipoId;
    }

    public int getNum_personas() {
        return num_personas;
    }

    public void setNum_personas(int num_personas) {
        this.num_personas = num_personas;
    }

    
    
}
