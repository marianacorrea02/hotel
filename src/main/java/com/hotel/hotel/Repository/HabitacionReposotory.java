package com.hotel.hotel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.hotel.Entity.Habitacion;

public interface HabitacionReposotory extends JpaRepository<Habitacion, Long> {
    
}
