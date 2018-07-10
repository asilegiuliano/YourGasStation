package com.engim.svilupposw.profilemanagement.models;

/**
 * Created by svilupposw on 27/03/18.
 */

// ----------------- POJO CLASS (SE NON CI FOSSERO STATI I COSTRUTTORI)

public class Rifornimento {


    // --- COSTRUTTORE 1
    public Rifornimento(String nomeBenzinaio, double importo) {
        this.nomeBenzinaio = nomeBenzinaio;
        this.importo = importo;
    }

    // --- COSTRUTTORE 2
    public Rifornimento(){

    }

    private String nomeBenzinaio;

    private double importo;

    public String getNomeBenzinaio() {
        return nomeBenzinaio;
    }

    public void setNomeBenzinaio(String nomeBenzinaio) {
        this.nomeBenzinaio = nomeBenzinaio;
    }

    public double getImporto() {
        return importo;
    }

    public void setImporto(double importo) {
        this.importo = importo;
    }
}
