package com.hotel.hotel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.hotel.Entity.Tipo;

@Repository
public interface TipoRepository extends JpaRepository<Tipo, Long> {

}
