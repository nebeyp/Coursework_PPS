package com.example.kursovik_PPS.controllers;

import com.example.kursovik_PPS.model.Aircraft;
import com.example.kursovik_PPS.service.AircraftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private AircraftService airService;

    @RequestMapping(value = "/" , method = RequestMethod.GET)
    public String home() {
        return "index_main";
    }

    @RequestMapping(value = "/aircrafts" , method = RequestMethod.GET)
    public String getall() {
        return "aircrafts";
    }

    @RequestMapping(value = "/aircrafts/edit/{id}" , method = RequestMethod.GET)
    public String editAir() {
        return "aircraft_edit";
    }

    @RequestMapping(value = "/aircrafts/add" , method = RequestMethod.GET)
    public String addAir() {
        return "aircraft_add";
    }

    @RequestMapping(value = "/aircrafts/analyze" , method = RequestMethod.GET)
    public String airAnalyze() {
        return "aircrafts_analyze";
    }

    @RequestMapping(value = "/archive" , method = RequestMethod.GET)
    public String getArhive() {
        return "archive";
    }

    @RequestMapping(value = "/login" , method = RequestMethod.GET)
    public String getlogin() {
        return "login";
    }




}
