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
public class Smartphone implements Dispos{
    private String marcaModelo;
    private String sistemaOp;
    private boolean multiSim;
    private int tamanioPantalla;
    private int ram;
    private int resolucionCamTrasera;
    private int resolucionCamFrontal;

    public Smartphone() {
    }

    public Smartphone(String marcaModelo, String sistemaOp, boolean multiSim, int tamanioPantalla, int ram, int resolucionCamTrasera, int resolucionCamFrontal) {
        this.marcaModelo = marcaModelo;
        this.sistemaOp = sistemaOp;
        this.multiSim = multiSim;
        this.tamanioPantalla = tamanioPantalla;
        this.ram = ram;
        this.resolucionCamTrasera = resolucionCamTrasera;
        this.resolucionCamFrontal = resolucionCamFrontal;
    }

    public int getResolucionCamFrontal() {
        return resolucionCamFrontal;
    }

    public void setResolucionCamFrontal(int resolucionCamFrontal) {
        this.resolucionCamFrontal = resolucionCamFrontal;
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

    public boolean isMultiSim() {
        return multiSim;
    }

    public void setMultiSim(boolean multiSim) {
        this.multiSim = multiSim;
    }

    public int getTamanioPantalla() {
        return tamanioPantalla;
    }

    public void setTamanioPantalla(int tamanioPantalla) {
        this.tamanioPantalla = tamanioPantalla;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getResolucionCamTrasera() {
        return resolucionCamTrasera;
    }

    public void setResolucionCamTrasera(int resolucionCamTrasera) {
        this.resolucionCamTrasera = resolucionCamTrasera;
    }

    @Override
    public String toString() {
        return "Smartphone{" + "marcaModelo=" + marcaModelo + ", sistemaOp=" + sistemaOp + ", multiSim=" + multiSim + ", tamanioPantalla=" + tamanioPantalla + ", ram=" + ram + ", resolucionCamTrasera=" + resolucionCamTrasera + ", resolucionCamFrontal=" + resolucionCamFrontal + '}';
    }
    
    
    
}
