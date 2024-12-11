/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minireto.aplicacionequipo5;

/**
 *
 * @author DAM119
 */
public class WayPoints {
    
    
    private Reto reto;
    private int NumeroWaypoint;
    private int distanciaDesdeInicio;
    private String tipo;
    private String nombre;
    private int latitud;
    private int longitud;

    public WayPoints(int id, Reto reto, int NumeroWaypoint, int distanciaInicio, String tipo, String nombre, int latitud, int longitud, String foto) {
        
        this.reto = reto;
        this.NumeroWaypoint = NumeroWaypoint;
        this.distanciaDesdeInicio = distanciaInicio;
        this.tipo = tipo;
        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    

}
