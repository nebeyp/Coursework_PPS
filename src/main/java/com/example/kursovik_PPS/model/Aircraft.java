package com.example.kursovik_PPS.model;

import lombok.Data;
import lombok.Getter;


import java.awt.*;
import jakarta.persistence.*; // for Spring Boot 3

@Entity
@Data
@Table(name = "aircraft")
public class Aircraft {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name; //Крыло, и тп

    @Column(name = "model")
    private String model; //Модель летательного аппарата

    @Column(name = "k_aero_sopr")
    private double k_aero_sopr;

    @Column(name = "s_secheniya")
    private double s_secheniya;

    @Column(name = "f_tyagi_dvig")
    private double f_tyagi_dvig;

    @Column(name = "m_topliva")
    private double m_topliva;

    @Column(name = "dlina_borta")
    private double dlina_borta;

    @Column(name = "shirina_borta")
    private double shirina_borta;

    @Column(name = "s_krylo")
    private double s_krylo;

    @Column(name = "m_dvigatel")
    private double m_dvigatel;

    @Column(name = "m_krylo")
    private double m_krylo;

    @Column(name = "m_structure")
    private double m_structure;
    // Другие поля летательного аппарата

    // Конструкторы, геттеры и сеттеры

    public Aircraft() {
        super();
    }

    public Aircraft(Long id, String name, String model, double k_aero_sopr, double s_secheniya, double f_tyagi_dvig,
                    double m_topliva, double dlina_borta, double shirina_borta, double s_krylo, double m_dvigatel,
                    double m_krylo, double m_structure) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.k_aero_sopr = k_aero_sopr;
        this.s_secheniya = s_secheniya;
        this.f_tyagi_dvig = f_tyagi_dvig;
        this.m_topliva = m_topliva;
        this.dlina_borta = dlina_borta;
        this.shirina_borta = shirina_borta;
        this.s_krylo = s_krylo;
        this.m_dvigatel = m_dvigatel;
        this.m_krylo = m_krylo;
        this.m_structure = m_structure;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public double getK_aero_sopr() {
        return k_aero_sopr;
    }

    public double getS_secheniya() {
        return s_secheniya;
    }

    public double getF_tyagi_dvig() {
        return f_tyagi_dvig;
    }

    public double getM_topliva() {
        return m_topliva;
    }

    public double getDlina_borta() {
        return dlina_borta;
    }

    public double getShirina_borta() {
        return shirina_borta;
    }

    public double getS_krylo() {
        return s_krylo;
    }

    public double getM_dvigatel() {
        return m_dvigatel;
    }

    public double getM_krylo() {
        return m_krylo;
    }

    public double getM_structure() {
        return m_structure;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

//    public double getK_aero_sopr() {
//        return K_aero_sopr;
//    }

    public void setk_aero_sopr(double k_aero_sopr) {
        this.k_aero_sopr = k_aero_sopr;
    }

//    public double gets_secheniya() {
//        return s_secheniya;
//    }

    public void sets_secheniya(double s_secheniya) {
        this.s_secheniya = s_secheniya;
    }

//    public double getf_tyagi_dvig() {
//        return f_tyagi_dvig;
//    }

    public void setf_tyagi_dvig(double f_tyagi_dvig) {
        this.f_tyagi_dvig = f_tyagi_dvig;
    }

//    public double getM_topliva() {
//        return m_topliva;
//    }

    public void setm_topliva(double m_topliva) {
        this.m_topliva = m_topliva;
    }

//    public double getDlina_borta() {
//        return dlina_borta;
//    }

    public void setdlina_borta(double dlina_borta) {
        this.dlina_borta = dlina_borta;
    }

//    public double getShirina_borta() {
//        return shirina_borta;
//    }

    public void setshirina_borta(double shirina_borta) {
        this.shirina_borta = shirina_borta;
    }

//    public double getS_krylo() {
//        return S_krylo;
//    }

    public void setS_krylo(double s_krylo) {
        this.s_krylo = s_krylo;
    }

//    public double getM_dvigatel() {
//        return M_dvigatel;
//    }

    public void setM_dvigatel(double m_dvigatel) {
        this.m_dvigatel = m_dvigatel;
    }

//    public double getM_krylo() {
//        return M_krylo;
//    }

    public void setM_krylo(double m_krylo) {
        this.m_krylo = m_krylo;
    }

//    public double getM_structure() {
//        return m_structure;
//    }

    public void setM_structure(double m_structure) {
        this.m_structure = m_structure;
    }
}
