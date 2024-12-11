/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minireto.aplicacionequipo5;

/**
 *
 * @author DAM105
 */
public class Perfil {
    
    private String nombre,apellidos;
    private double totalKilometros;
    private int totalRetosRealizados,totalRetosCreados;
    private RetoRealizado[] retosRealizado;

    public Perfil(String nombre, String apellidos, double totalKilometros, int totalRetosRealizados, int totalRetosCreados, RetoRealizado[] retosRealizado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.totalKilometros = totalKilometros;
        this.totalRetosRealizados = totalRetosRealizados;
        this.totalRetosCreados = totalRetosCreados;
        this.retosRealizado = new RetoRealizado[0];
    }
        //EN EL MAIN SE HARIA EL METODO VER PERFIL DEL USUARIO CON SUS ESTADISTICAS
    
}