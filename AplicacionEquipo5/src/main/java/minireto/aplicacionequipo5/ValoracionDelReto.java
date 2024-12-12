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
    //atributos de ValoracionDelReto
    private int valoracion;
    private Usuario valorador;
    private Reto r;
    //constructor de ValoracionDelReto
    public ValoracionDelReto(Reto reto,int valoracion,Usuario valorador) {
        this.valoracion = valoracion;
        this.r = reto;
        this.valorador=valorador;
    }
    //getter del reto
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

    

