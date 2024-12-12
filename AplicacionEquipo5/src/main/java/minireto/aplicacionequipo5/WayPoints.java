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
    private int NumeroWaypoint;
    private double distanciaDesdeInicio;
    private String tipo;
  
    private int latitud;
    private int longitud;

    public WayPoints(Reto reto, int numeroWaypoint) {
        
        this.reto = reto;
        this.NumeroWaypoint= numeroWaypoint;
        System.out.println("Introduce la distancia respecto al inicio: (km)");
        this.distanciaDesdeInicio = new Scanner(System.in).nextDouble();
        System.out.println("Introduce el tipo de wayPoint");
        this.tipo = new Scanner(System.in).nextLine();
        System.out.println("Introduce la latitud");
        this.latitud = new Scanner(System.in).nextInt();
        System.out.println("Introduce la longitud");
        this.longitud = new Scanner(System.in).nextInt();
    }

    @Override
    public String toString() {
        return "WayPoints{" + "NumeroWaypoint=" + NumeroWaypoint + " distanciaDesdeInicio=" + distanciaDesdeInicio + " tipo=" + tipo + " latitud=" + latitud + " longitud=" + longitud + '}';
    }

    

}
