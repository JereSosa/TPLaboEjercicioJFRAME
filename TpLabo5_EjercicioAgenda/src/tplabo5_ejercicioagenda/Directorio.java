/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tplabo5_ejercicioagenda;

import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Esquina del Vidrio
 */
public class Directorio {
    private TreeMap<Long, Contactos> contactos;

    public Directorio(TreeMap<Long, Contactos> contactos) {
        this.contactos = contactos;
    }
    
    public void agregarContacto(long telefono, Contactos contacto){
        contactos.put(telefono, contacto);
    }
    
    public Contactos buscarContacto(long telefono){
        return contactos.get(telefono);
    }
    
    public Set<Long> buscarTelefono(String apellido){
        
    }
}
