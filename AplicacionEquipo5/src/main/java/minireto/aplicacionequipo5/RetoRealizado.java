/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minireto.aplicacionequipo5;

import java.time.LocalDateTime;

/**
 *
 * @author Mario Cuevas
 */
public class RetoRealizado {
    private Reto reto;
    private LocalDateTime fInicio;
    private LocalDateTime fFinal;
    private int tiempoEnMovimiento;
    private int velMedia;
    private String comentarios;

    public RetoRealizado(Reto reto,LocalDateTime fInicio, LocalDateTime fFinal, int tiempoEnMovimiento,int velMedia) {
        this.reto =reto;
        this.fInicio = fInicio;
        this.fFinal = fFinal;
        this.tiempoEnMovimiento = tiempoEnMovimiento;
        this.velMedia= velMedia;
        
        //AÑADIR EN EL PRINCIPAL PEDIR COMENTARIOS OPCIONALES
    }
    
    
    
    
}
