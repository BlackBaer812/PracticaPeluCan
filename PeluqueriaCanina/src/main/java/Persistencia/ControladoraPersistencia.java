/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Logica.Duenio;
import Logica.Mascota;

/**
 *
 * @author usuario
 */
public class ControladoraPersistencia {
    
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascoJpa = new MascotaJpaController();

    public void guardar(Duenio due, Mascota mas) {
        
        //Creamos en la BBDD el dueño
        duenioJpa.create(due);
        
        //Cremoas en la BBDD la mascota
        mascoJpa.create(mas);
        
    }
    
}
