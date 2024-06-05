/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author usuario
 */

@Entity
public class Duenio implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_duenio;
    private String nombre;
    private String num_movil;

    public Duenio() {
    }

    public Duenio(int id_duenio, String nombre, String num_movil) {
        this.id_duenio = id_duenio;
        this.nombre = nombre;
        this.num_movil = num_movil;
    }

    public int getId_duenio() {
        return id_duenio;
    }

    public void setId_duenio(int id_duenio) {
        this.id_duenio = id_duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNum_movil() {
        return num_movil;
    }

    public void setNum_movil(String num_movil) {
        this.num_movil = num_movil;
    }
    
    
}
