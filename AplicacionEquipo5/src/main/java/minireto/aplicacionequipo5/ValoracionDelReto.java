/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minireto.aplicacionequipo5;

/**
 *
 * @author user
 */
public class ValoracionDelReto {
    
    private int valoracion;
    private Usuario valorador;
    private Reto r;

    public ValoracionDelReto(Reto reto,int valoracion,Usuario valorador) {
        this.valoracion = valoracion;
        this.r = reto;
        this.valorador=valorador;
    }

    public Reto getR() {
        return r;
    }
    //toString de ValoraciónDelReto
    @Override
    public String toString() {
        return "Usuario: " + this.valorador.getNombre() + this.valorador.getApellido1() + this.valorador.getApellido2() + "\n"
                + "Valoración: " + this.valoracion;
    }
    
}

    

