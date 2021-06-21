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
public class Monitor {
    private String Marca;
    private String Modelo;
    private int Pulgadas;

    public Monitor() {
    }

    public Monitor(String Marca, String Modelo, int Pulgadas) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Pulgadas = Pulgadas;
    }

    public int getPulgadas() {
        return Pulgadas;
    }

    public void setPulgadas(int Pulgadas) {
        this.Pulgadas = Pulgadas;
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
        return "Monitor{" + "Marca=" + Marca + ", Modelo=" + Modelo + ", Pulgadas=" + Pulgadas + '}';
    }
    
    
}
