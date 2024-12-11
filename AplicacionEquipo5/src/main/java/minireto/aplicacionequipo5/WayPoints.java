/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minireto.aplicacionequipo5;

import java.util.Scanner;

/**
 *
 * @author DAM119
 */
public class WayPoints {
    
    private Reto reto;
    private int numeroWaypoint;
    private int distanciaInicio;
    private String tipo;
    private String nombre;
    private int latitud;
    private int longitud;
    private String foto;

    public WayPoints(Reto reto, int numeroWayPoint) {
        Scanner sc = new Scanner(System.in);
        this.reto = reto;
        this.numeroWaypoint = numeroWayPoint;
        System.out.print("Introduce la distancia de inicio: ");
        this.distanciaInicio = sc.nextInt();
        System.out.print("Introduce el tipo: ");
        this.tipo = sc.next();
        System.out.print("Introduce el nombre: ");
        this.nombre = sc.next();
        System.out.print("Introduce la latitud: ");
        this.latitud = sc.nextInt();
        System.out.print("Introduce la longitud");
        this.longitud = sc.nextInt();
        System.out.print("Introduce la URL de la foto: ");
        this.foto = sc.next();
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
    
    
    
    @Override
    public String toString() {
        return  + "Reto: " + this.reto + "\n"
                + "Número del WayPoint: " + this.NumeroWaypoint + "\n"
                + "Distancia de inicio: " + this.distanciaInicio + "\n"
                + "Tipo: " + this.tipo + "\n"
                + "Nombre: " + this.nombre + "\n"
                + "Latitud: " + this.latitud + "\n"
                + "Longitud: " + this.longitud + "\n"
                + "Foto (URL): " + this.foto;
    }
}
