/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.List;

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

    public List<Mascota> cargaMascotas() {
        return controlPersis.cargarMascotas();
    }

    public void borrar(int num_cliente) {
        controlPersis.borrarMascota(num_cliente);
    }

    public Mascota traeMascota(int numClie) {
        return controlPersis.traeMascota(numClie);
    }

    public void editarMascota(Mascota masco, String nomMasco, String raza, 
            String color, String nomDueno, String movDueno, 
            String observ, String alergico, String attEsp) {
        
        masco.setNombre(nomMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setObservaciones(observ);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(attEsp);
        
        this.modMasco(masco);
        
        Duenio dueno = this.buscaDuenio(masco.getUnDuenio().getId_duenio());
        
        dueno.setNombre(nomDueno);
        dueno.setNum_movil(movDueno);
        
        this.modDuenio(dueno);
    }

    private Duenio buscaDuenio(int id_duenio) {
        return controlPersis.buscaDuenio(id_duenio);
    }

    private void modDuenio(Duenio dueno) {
        controlPersis.modDeunio(dueno);
    }

    private void modMasco(Mascota masco) {
        controlPersis.modificarMascota(masco);
    }
}
