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
@Table(name = "habitacion")
public class Habitacion {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "sede_id")
    private SedeHotel sedeId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo_id")
    private Tipo tipoId;

    @Column
    private int cupo;

    @Column
    private boolean disponible;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Tipo getTipoId() {
        return tipoId;
    }

    public void setTipoId(Tipo tipoId) {
        this.tipoId = tipoId;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public SedeHotel getSedeId() {
        return sedeId;
    }

    public void setSedeId(SedeHotel sedeId) {
        this.sedeId = sedeId;
    }

    


}
