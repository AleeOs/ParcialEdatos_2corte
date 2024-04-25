/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcial;

/**
 *
 * @author 1061691244
 */
public class Contacto {
    private String Nombre;
    private int Numero_Telefono;

    public Contacto(String Nombre, int Numero_Telefono) {
        this.Nombre = Nombre;
        this.Numero_Telefono = Numero_Telefono;
    }

    public Contacto() {
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setNumero_Telefono(int Numero_Telefono) {
        this.Numero_Telefono = Numero_Telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getNumero_Telefono() {
        return Numero_Telefono;
    }
    }
