package com.hotel.hotel.Controller;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.hotel.Entity.Habitacion;
import com.hotel.hotel.Entity.SedeHotel;
import com.hotel.hotel.Service.TemporadaService;

@RestController
@RequestMapping("/hotel")
public class Buscador {

    @Autowired

    public TemporadaService temporadaService;

    @GetMapping
        public ResponseEntity<String> verificarTemporada(@RequestParam String fecha) {
            try {
                LocalDate fechaIngresada = LocalDate.parse(fecha); // Parsear la fecha ingresada

                if (temporadaService.esTemporadaAlta(fechaIngresada)) {
                    return ResponseEntity.ok("Temporada alta.");
                } else {
                    return ResponseEntity.ok("Temporada baja.");
                }
            } catch (Exception e) {
                return ResponseEntity.badRequest().body("Formato de fecha incorrecto. Utiliza el formato 'yyyy-MM-dd'.");
            }
        }

    @GetMapping("/habitaciones-disponibles")
    public ResponseEntity<String> obtenerHabitacionesDisponibles(
            @RequestParam("fechaInicio") String fechaInicio,
            @RequestParam("fechaFin") String fechaFin,
            @RequestParam("sede") String sede
    ) {
        
        return (ResponseEntity<String>) ResponseEntity.ok();
    }

}
