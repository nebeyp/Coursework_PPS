package com.example.kursovik_PPS.repositories;

import com.example.kursovik_PPS.model.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AircraftRepository extends JpaRepository<Aircraft, Long> {
    public Aircraft getAircraftByName(String name);
    public Aircraft getAircraftByModel(String model);
    // Можно добавить дополнительные методы запросов к базе данных, если необходимо
}
