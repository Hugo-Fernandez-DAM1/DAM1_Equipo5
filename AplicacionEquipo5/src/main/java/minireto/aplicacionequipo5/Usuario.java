/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minireto.aplicacionequipo5;

import java.time.LocalDate;
import java.time.LocalDateTime;


/**
 *
 * @author dam120
 */
public class Usuario {
    
    private String email;
    private String nombre;
    private String apellidos;
    private LocalDate fechaNac;
    private String telefono;
    private String genero;
    private String provincia;


    public Usuario(String email, String nombre, String apellidos, Date fechaNac) {
        this.email = email;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

 public void registrarReto(String nombre,Usuario usuario,LocalDateTime fecha,int tipoActividad,int distancia){
     
 }
    
    
    
    
}
