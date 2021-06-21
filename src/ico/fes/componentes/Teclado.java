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
public class Teclado {
    private String Marca;
    private String Modelo;
    private int NumeroTeclas;
    private int Multimedia;

    public Teclado() {
    }

    public Teclado(String Marca, String Modelo, int NumeroTeclas, int Multimedia) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.NumeroTeclas = NumeroTeclas;
        this.Multimedia = Multimedia;
    }

    public int getMultimedia() {
        return Multimedia;
    }

    public void setMultimedia(int Multimedia) {
        this.Multimedia = Multimedia;
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

    public int getNumeroTeclas() {
        return NumeroTeclas;
    }

    public void setNumeroTeclas(int NumeroTeclas) {
        this.NumeroTeclas = NumeroTeclas;
    }

    @Override
    public String toString() {
        return "Teclado{" + "Marca=" + Marca + ", Modelo=" + Modelo + ", NumeroTeclas=" + NumeroTeclas + ", Multimedia=" + Multimedia + '}';
    }
    
    
}
