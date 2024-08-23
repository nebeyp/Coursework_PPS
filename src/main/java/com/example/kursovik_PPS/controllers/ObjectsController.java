package com.example.kursovik_PPS.controllers;


import com.example.kursovik_PPS.model.Aircraft;
import com.example.kursovik_PPS.model.Report;
import com.example.kursovik_PPS.service.AircraftService;
import com.example.kursovik_PPS.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/")
public class ObjectsController {

    @Autowired
    private AircraftService airService;

    // Метод для получения всех летательных аппаратов
    @GetMapping("/aircrafts")
    public ResponseEntity<List<Aircraft>> getAllAircrafts() {
        List<Aircraft> aircrafts = airService.getAllAircrafts();
        return new ResponseEntity<>(aircrafts, HttpStatus.OK);
    }

    // Метод для получения летательного аппарата по его идентификатору
    @GetMapping("/aircrafts/{id}")
    public ResponseEntity<Aircraft> getAircraftById(@PathVariable Long id) {
        Aircraft aircraft = airService.getAircraftById(id);
        if (aircraft != null) {
            return new ResponseEntity<>(aircraft, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Метод для создания нового летательного аппарата
    @PostMapping("/aircrafts")
    public ResponseEntity<Aircraft> createAircraft(@RequestBody Aircraft aircraft) {
        try {System.out.println(aircraft);

            Aircraft createdAircraft = airService.createAircraft(aircraft);
            return new ResponseEntity<>(createdAircraft, HttpStatus.CREATED);}
        catch (Exception e) { return new ResponseEntity<>(HttpStatus.NOT_FOUND); }
    }

    // Метод для обновления существующего летательного аппарата по его идентификатору
    @PutMapping("/aircrafts/{id}")
    public ResponseEntity<Aircraft> updateAircraft(@PathVariable Long id, @RequestBody Aircraft aircraft) {
        try {if (!airService.exists(id)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
            aircraft.setId(id);
            Aircraft updatedAircraft = airService.updateAircraft(aircraft);
            return new ResponseEntity<>(updatedAircraft, HttpStatus.OK);}
        catch (Exception e) { return new ResponseEntity<>(HttpStatus.NOT_FOUND);}



    }

    // Метод для удаления летательного аппарата по его идентификатору
    @DeleteMapping("/aircrafts/{id}")
    public ResponseEntity<Void> deleteAircraft(@PathVariable Long id) {
        if (!airService.exists(id)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        airService.deleteAircraft(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @Autowired
    private ReportService repService;

    @GetMapping("/reports")
    public ResponseEntity<List<Report>> getAllReports() {
        List<Report> reports = repService.getAllReports();
        return new ResponseEntity<>(reports, HttpStatus.OK);
    }

    @PostMapping("/reports")
    public ResponseEntity<Report> createReport(@RequestBody Report report) {

        //System.out.println(report);

        Report createdReport = repService.createReport(report);
        return new ResponseEntity<>(createdReport, HttpStatus.CREATED);
    }

    @DeleteMapping("/reports/{id}")
    public ResponseEntity<Void> deleteReport(@PathVariable Long id) {
        if (!repService.exists(id)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        repService.deleteReport(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Метод для получения летательного аппарата по его идентификатору
    @GetMapping("/reports/{id}")
    public ResponseEntity<Report> getReportById(@PathVariable Long id) {
        Report report = repService.getReportById(id);
        if (report != null) {
            return new ResponseEntity<>(report, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


}
