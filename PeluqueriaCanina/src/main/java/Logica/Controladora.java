/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Persistencia.ControladoraPersistencia;

/**
 *
 * @author usuario
 */
public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nomMasco, String raza, String color, 
            String nomDueno, String movDueno, String observ, 
            String alergico, String attEsp) {
        
        Duenio due = new Duenio();
        
        due.setNombre(nomDueno);
        due.setNum_movil(movDueno);
        
        Mascota mas = new Mascota();
        mas.setNombre(nomMasco);
        mas.setRaza(raza);
        mas.setColor(color);
        mas.setAlergico(alergico);
        mas.setAtencion_especial(attEsp);
        mas.setObservaciones(observ);
        mas.setUnDuenio(due);
        
        controlPersis.guardar(due,mas);
        
    }
    
}
