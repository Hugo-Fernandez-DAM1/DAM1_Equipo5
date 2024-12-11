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
    private Reto r;

    public ValoracionDelReto(int valoracion, Reto r) {
        this.valoracion = valoracion;
        this.r = r;
    }

    public int getValoracion() {
        return valoracion;
    }

    public Reto getR() {
        return r;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public void setR(Reto r) {
        this.r = r;
    }
    
    public int valoracion(int v) {
        return 0; //se sigue en clase, necesito ver el code
    }
}
