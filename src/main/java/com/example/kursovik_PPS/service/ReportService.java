package com.example.kursovik_PPS.service;

import com.example.kursovik_PPS.model.Aircraft;
import com.example.kursovik_PPS.model.Report;
import com.example.kursovik_PPS.repositories.AircraftRepository;
import com.example.kursovik_PPS.repositories.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class ReportService {

    // Внедряем зависимость от репозитория для работы с данными
    @Autowired
    private ReportRepository repRepository;

    public List<Report> getAllReports() {
        return repRepository.findAll();
    }

    public Report getReportById(Long id) {
        return repRepository.findById(id).orElse(null);
    }

    public Report createReport(Report report) {
        return repRepository.save(report);
    }

    public Report updateReport(Report report) {
        return repRepository.save(report);
    }

    public void deleteReport(Long id) {
        repRepository.deleteById(id);
    }

    public boolean exists(Long id) {
        return repRepository.existsById(id);
    }
    // Другие методы, если необходимо
}
