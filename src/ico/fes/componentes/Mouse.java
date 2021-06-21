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
public class Mouse {
    private String Marca;
    private String Modelo;
    private String Tipo;

    public Mouse() {
    }

    public Mouse(String Marca, String Modelo, String Tipo) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Tipo = Tipo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
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
        return "Mouse{" + "Marca=" + Marca + ", Modelo=" + Modelo + ", Tipo=" + Tipo + '}';
    }
    
    
}
