package com.hotel.hotel.Service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;



@Service
public class TemporadaService{


  private LocalDate inicioTemporadaAlta;
    private LocalDate finTemporadaAlta;

    public TemporadaService() {
        
        this.inicioTemporadaAlta = LocalDate.of(LocalDate.now().getYear(), 12, 1); 
        this.finTemporadaAlta = LocalDate.of(LocalDate.now().getYear(), 3, 31); 
    }

    public boolean esTemporadaAlta(LocalDate fecha) {
        return !fecha.isBefore(inicioTemporadaAlta) && !fecha.isAfter(finTemporadaAlta);
    }

    
}
