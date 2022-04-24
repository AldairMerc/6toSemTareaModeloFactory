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
public class Computadora implements Dispos{
    private String marcaModelo;
    private String sistemaOp;
    private int ram;
    private int capacidad;
    private boolean ssd;

    public Computadora() {
    }

    public Computadora(String marca, String sistemaOp, int ram, int capacidad, boolean ssd) {
        this.marcaModelo = marca;
        this.sistemaOp = sistemaOp;
        this.ram = ram;
        this.capacidad = capacidad;
        this.ssd = ssd;
    }

    public boolean isSsd() {
        return ssd;
    }

    public void setSsd(boolean ssd) {
        this.ssd = ssd;
    }

    public String getMarcaModelo() {
        return marcaModelo;
    }

    public void setMarcaModelo(String marcaModelo) {
        this.marcaModelo = marcaModelo;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    } 

    public String getSistemaOp() {
        return sistemaOp;
    }

    public void setSistemaOp(String sistemaOp) {
        this.sistemaOp = sistemaOp;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marcaModelo + ", sistop=" + sistemaOp + ", ram=" + ram + ", capacidad=" + capacidad + ", ssd=" + ssd + '}';
    }
    
    
    
}
