/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.juntar;

import ico.fes.componentes.Cpu;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;

/**
 *
 * @author karly
 */
public class Computadora {
    private String Marca;
    private String Modelo;
    private Monitor monitor;
    private Cpu cpu;
    private Mouse mouse;
    private Teclado teclado;

    public Computadora() {
    }

    public Computadora(String Marca, String Modelo, Monitor monitor, Cpu cpu, Mouse mouse, Teclado teclado) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.monitor = monitor;
        this.cpu = cpu;
        this.mouse = mouse;
        this.teclado = teclado;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
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

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        return "Computadora{" + "Marca=" + Marca + ", Modelo=" + Modelo + ", monitor=" + monitor + ", cpu=" + cpu + ", mouse=" + mouse + ", teclado=" + teclado + '}';
    }
    
    public void encender(){
        System.out.println("Encendiendo computadora");
    }    
    
    public void apagar(){
        System.out.println("Apagando computadora");
    }
}
