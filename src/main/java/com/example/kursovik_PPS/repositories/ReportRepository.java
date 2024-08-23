package com.example.kursovik_PPS.repositories;

import com.example.kursovik_PPS.model.Aircraft;
import com.example.kursovik_PPS.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRepository extends JpaRepository<Report, Long> {
    // Можно добавить дополнительные методы запросов к базе данных, если необходимо
}
