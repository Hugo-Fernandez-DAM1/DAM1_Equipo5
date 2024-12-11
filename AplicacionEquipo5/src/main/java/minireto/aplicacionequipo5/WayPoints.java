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
    
    private int id;
    private Reto reto;
    private int NumeroWaypoint;
    private int distanciaDesdeInicio;
    private String tipo;
    private String nombre;
    private int latitud;
    private int longitud;

    public WayPoints(int id, Reto reto, int NumeroWaypoint, int distanciaInicio, String tipo, String nombre, int latitud, int longitud, String foto) {
        this.id = id;
        this.reto = reto;
        this.NumeroWaypoint = NumeroWaypoint;
        this.distanciaDesdeInicio = distanciaInicio;
        this.tipo = tipo;
        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public int getId() {
        return id;
    }

    public Reto getReto() {
        return reto;
    }

    public int getNumeroWaypoint() {
        return NumeroWaypoint;
    }

    public int getDistanciaInicio() {
        return distanciaInicio;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getLatitud() {
        return latitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public String getFoto() {
        return foto;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setReto(Reto reto) {
        this.reto = reto;
    }

    public void setNumeroWaypoint(int NumeroWaypoint) {
        this.NumeroWaypoint = NumeroWaypoint;
    }

    public void setDistanciaInicio(int distanciaInicio) {
        this.distanciaInicio = distanciaInicio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLatitud(int latitud) {
        this.latitud = latitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
