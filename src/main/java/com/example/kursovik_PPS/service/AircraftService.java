package com.example.kursovik_PPS.service;

import com.example.kursovik_PPS.model.Aircraft;
import com.example.kursovik_PPS.repositories.AircraftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class AircraftService {

    // Внедряем зависимость от репозитория для работы с данными
    @Autowired
    private AircraftRepository aircraftRepository;

    // Метод для получения всех летательных аппаратов из репозитория
    public List<Aircraft> getAllAircrafts() {
        return aircraftRepository.findAll();
    }

    // Метод для получения летательного аппарата по его идентификатору
    public Aircraft getAircraftById(Long id) {
        return aircraftRepository.findById(id).orElse(null);
    }

    public Aircraft getAircraftByName(String name) {
        return aircraftRepository.getAircraftByName(name);
    }

    public Aircraft getAircraftByModel(String model) {
        return aircraftRepository.getAircraftByModel(model);
    }

    // Метод для создания нового летательного аппарата


    public Aircraft createAircraft(Aircraft aircraft) throws Exception {
        Aircraft found_air = getAircraftByName(aircraft.getName());
        if (found_air != null && found_air.getModel().equals(aircraft.getModel())) {
            throw new Exception("Данные уже есть в таблице");
        }
        return aircraftRepository.save(aircraft);

    }

    // Метод для обновления существующего летательного аппарата
    public Aircraft updateAircraft(Aircraft aircraft) throws Exception {
        Aircraft found_air = getAircraftByName(aircraft.getName());
        if (found_air != null && found_air.getModel().equals(aircraft.getModel())) {
            throw new Exception("Эти данные уже есть в таблице");
        }
        return aircraftRepository.save(aircraft);
    }

    // Метод для удаления летательного аппарата по его идентификатору
    public void deleteAircraft(Long id) {
        aircraftRepository.deleteById(id);
    }

    public boolean exists(Long id) {
        return aircraftRepository.existsById(id);
    }
    // Другие методы, если необходимо
}
