/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minireto.aplicacionequipo5;

import java.util.Date;

/**
 *
 * @author dam120
 */
public class Usuario {
    
    private String email;
    private String nombre;
    private String apellidos;
    private Date fechaNac;
    private String telefono;
    private String genero;
    private String provincia;

    public Usuario(String email, String nombre, String apellidos, Date fechaNac, String telefono, String genero, String provincia) {
        this.email = email;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
        this.telefono = telefono;
        this.genero = genero;
        this.provincia = provincia;
    }

    public Usuario(String email, String nombre, String apellidos, Date fechaNac) {
        this.email = email;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
    }

    public Usuario(String email, String nombre, String apellidos, Date fechaNac, String telefono) {
        this.email = email;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
        this.telefono = telefono;
    }

    public Usuario(String email, String nombre, String apellidos, Date fechaNac, String telefono, String genero) {
        this.email = email;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
        this.telefono = telefono;
        this.genero = genero;
    }
    
    
    
    
    
}
