/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minireto.aplicacionequipo5;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ValoracionDelReto {
    
    private int valoracion;
    private Reto r;
    private Usuario u;

    public ValoracionDelReto(Reto r, Usuario u) {
        Scanner sc = new Scanner(System.in);
        this.r = r;
        this.u = u;
        System.out.print("Introduce la valoración (1 - 5): ");
        this.valoracion = sc.nextInt();
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

    public Usuario getU() {
        return u;
    }

    public void setU(Usuario u) {
        this.u = u;
    }
    
    @Override
    public String toString() {
        return "Usuario: " + this.u + "\n"
                + "Reto: " + this.r + "\n"
                + "Valoración: " + this.valoracion;
    }
}
