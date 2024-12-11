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
public class retoRealizado {
    private LocalDateTime fInicio;
    private LocalDateTime fFinal;
    private int tiempoEnMovimientoMinutos;
    private String comentarios;

    public retoRealizado(LocalDateTime fInicio, LocalDateTime fFinal, int tiempoEnMovimiento) {
        this.fInicio = fInicio;
        this.fFinal = fFinal;
        this.tiempoEnMovimientoMinutos = tiempoEnMovimiento;
        
        //AÑADIR EN EL PRINCIPAL PEDIR COMENTARIOS OPCIONALES
    }
    
    
    
    
}
