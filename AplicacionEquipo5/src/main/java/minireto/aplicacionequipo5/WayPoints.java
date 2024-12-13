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
    
    //atributos de WayPoints
    private Reto reto;
    private int NumeroWaypoint;
    private double distanciaDesdeInicio;
    private String tipo;
  
    private int latitud;
    private int longitud;
    //constructor de WayPoints
    public WayPoints(Reto reto, int numeroWaypoint) {
        System.out.println("Waypoint "+numeroWaypoint+":");
        this.reto = reto;
        this.NumeroWaypoint= numeroWaypoint;
        do{
            System.out.println("Introduce la distancia respecto al inicio (km): ");
        this.distanciaDesdeInicio = new Scanner(System.in).nextDouble();
        if(this.distanciaDesdeInicio>=this.reto.getDistancia()){
            System.out.println("El numero introducido no puede ser igual o mayor a la distancia total");
        }
        }while(this.distanciaDesdeInicio>=this.reto.getDistancia());
        
        System.out.println("Introduce el tipo de wayPoint");
        this.tipo = new Scanner(System.in).nextLine();
        System.out.println("Introduce la latitud");
        this.latitud = new Scanner(System.in).nextInt();
        System.out.println("Introduce la longitud");
        this.longitud = new Scanner(System.in).nextInt();
    }
    // toString de WayPoints
    @Override
    public String toString() {
        return  "Numero del WayPoint: " + this.NumeroWaypoint + "\n"
                + "Distancia desde el inicio en km: " + String.format("%,.02f",this.distanciaDesdeInicio) + "Km" + "\n"
                + "Tipo: " + this.tipo + "\n"
                + "Latitud en grados: " + this.latitud + " grados" + "\n"
                + "Longitud en grados: " + this.longitud + " grados" + "\n";
    }

    

}
