package com.example.kursovik_PPS.model;

import lombok.Data;
import lombok.Getter;


import java.awt.*;
import jakarta.persistence.*; // for Spring Boot 3

@Entity
@Data
@Table(name = "report")
public class Report {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name_report")
    private String name_report;

    @Column(name = "report_text")
    private String report_text;

    public Report() {
        super();
    }

    public Report(Long id, String name, String report) {
        this.id = id;
        this.name_report = name;
        this.report_text = report;
    }

    public void setId_rep(Long id) {
        this.id = id;
    }

    public void setName_rep(String name) {
        this.name_report = name;
    }

    public void setText_rep(String rep_text) {
        this.report_text = rep_text;
    }


}
