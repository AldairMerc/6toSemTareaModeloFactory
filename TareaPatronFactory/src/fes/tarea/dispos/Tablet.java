/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.tarea.dispos;

import fes.tarea.factory.Dispos;

/**
 *
 * @author aldam
 */
public class Tablet implements Dispos{ 
    
    private String marcaModelo; 
    private String sistemaOp; 
    private boolean stylus; 
    private boolean audifonos; 
    private int ram; 
    private int capacidad;  

    public Tablet() {
    }

    public Tablet(String marcaModelo, String sistemaOp, boolean stylus, boolean audifonos, int ram, int capacidad) {
        this.marcaModelo = marcaModelo;
        this.sistemaOp = sistemaOp;
        this.stylus = stylus;
        this.audifonos = audifonos;
        this.ram = ram;
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getMarcaModelo() {
        return marcaModelo;
    }

    public void setMarcaModelo(String marcaModelo) {
        this.marcaModelo = marcaModelo;
    }

    public String getSistemaOp() {
        return sistemaOp;
    }

    public void setSistemaOp(String sistemaOp) {
        this.sistemaOp = sistemaOp;
    }

    public boolean isStylus() {
        return stylus;
    }

    public void setStylus(boolean stylus) {
        this.stylus = stylus;
    }

    public boolean isAudifonos() {
        return audifonos;
    }

    public void setAudifonos(boolean audifonos) {
        this.audifonos = audifonos;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Tablet{" + "marcaModelo=" + marcaModelo + ", sistemaOp=" + sistemaOp + ", stylus=" + stylus + ", audifonos=" + audifonos + ", ram=" + ram + ", capacidad=" + capacidad + '}';
    }
    
    
    
} 
