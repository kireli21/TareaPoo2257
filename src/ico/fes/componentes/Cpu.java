/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes;

/**
 *
 * @author karly
 */
public class Cpu {
    private String Marca;
    private String Modelo;
    private int Velocidad;

    public Cpu() {
    }

    public Cpu(String Marca, String Modelo, int Velocidad) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Velocidad = Velocidad;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    @Override
    public String toString() {
        return "Cpu{" + "Marca=" + Marca + ", Modelo=" + Modelo + ", Velocidad=" + Velocidad + '}';
    }
    
    
}
