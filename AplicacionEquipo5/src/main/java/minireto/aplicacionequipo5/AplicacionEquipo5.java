/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package minireto.aplicacionequipo5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DAM119
 */
public class AplicacionEquipo5 {

    private static Usuario[] usuarios = new Usuario[0];
    private static Reto[] retos = new Reto[0];

    public static void main(String[] args) {

        int num = 0;
        do {

            System.out.println("---Menu deporte--\n"
                    + "1.Crear usuarios\n"
                    + "2.Registrar retos\n"
                    + "3.Realizar retos\n"
                    + "4.Valorar retos\n"
                    + "5.Ver un reto con sus waypoints\n"
                    + "6.Ver los retos de un usuario\n"
                    + "7.Ver las valoraciones de un reto\n"
                    + "8.Salir de la aplicacion");
            num = new Scanner(System.in).nextInt();
            switch (num) {

                case 1 -> {
                    usuarios=Arrays.copyOf(usuarios,(int)usuarios.length+1);
                    usuarios[usuarios.length - 1] = new Usuario();
                }
                case 2 -> {
                    Usuario usuario = validarUsuario();
                    if (usuario == null) {
                        System.out.println("Usuario incorrecto");
                    } else {
                        retos=Arrays.copyOf(retos,retos.length+1);
                        retos[retos.length-1]=usuario.crearReto();
                    }
                }
                case 3 -> {
                    Usuario usuario = validarUsuario();
                    Reto reto= null;
                    String nomReto;
                    
                    
                    if (usuario == null) {
                        System.out.println("Usuario incorrecto");
                    } else {
                        reto=validarReto();
                        if(reto==null){
                            System.out.println("nombre del reto incorrecto");
                        }
                        else{
                            usuario.realizaReto(reto);
                        }
                        
                    }

                }
                case 4 -> {
                    Usuario usuario = validarUsuario();
                    Reto reto = null;
                    if (usuario == null) {
                        System.out.println("Usuario incorrecto");
                    } else {
                        reto=validarReto();
                        if(reto==null){
                            System.out.println("nombre del reto incorrecto");
                        }
                        else{
                            usuario.valorarReto(reto);
                        }

                    }

                }
                case 5 -> {
                    Reto reto= validarReto();
                    System.out.println("Reto: "+reto.getNomReto());
                    for (int i = 0; i < reto.getWaypoints().length; i++) {
                        System.out.println(reto.getWaypoints()[i]);
                    }
                    
                }
                case 6 -> {
                    Usuario usuario = validarUsuario();
                    if (usuario == null) {
                        System.out.println("Usuario incorrecto");
                    } else {
                        for (int i = 0; i < usuario.getRetosCreados().length; i++) {
                            System.out.println(usuario.getRetosCreados()[i]);
                        }
                    }
                    

                }
                case 7 -> {
                    Reto reto=validarReto();
                        if(reto==null){
                            System.out.println("nombre del reto incorrecto");
                        }
                        else{
                            for (int i = 0; i < usuarios.length; i++) {
                                for (int j = 0; j < usuarios[i].getRetosValorados().length; j++) {
                                    if(reto.getNomReto().equalsIgnoreCase(usuarios[i].getRetosValorados()[j].getR().getNomReto())){
                                        System.out.println(usuarios[i].getRetosValorados()[j]);
                                    }
                                }
                            }
                        }

                }
                case 8 ->
                    System.out.println("!Hasta la proxima¡");
                default ->
                    System.out.println("Has introduccido un valor erroneo, prueba otra vez");
            }
        } while (num != 8);
    }

    public static Usuario validarUsuario() {
        Usuario a = null;
                    System.out.println("introduce nombre de usuario");
                    String nombre = new Scanner(System.in).next();
                    System.out.println("introduce apellido1 de usuario");
                    String apellido1 = new Scanner(System.in).next();
                    System.out.println("introduce apellido2 de usuario");
                    String apellido2 = new Scanner(System.in).next();
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i].getNombre().equalsIgnoreCase(nombre) && usuarios[i].getApellido1().equalsIgnoreCase(apellido1) && usuarios[i].getApellido2().equalsIgnoreCase(apellido2)) {
                a = usuarios[i];
            }
        }
        return a;
    }

    public static Reto validarReto() {
        Reto a = null;
        String nomReto="";
        System.out.println("---Retos---");
        for (int i = 0; i < retos.length; i++) {
            System.out.println(retos[i].getNomReto());
        }
        System.out.println("Introduce el nombre del reto:");
        nomReto = new Scanner(System.in).nextLine();
        for (int i = 0; i < retos.length; i++) {
            if (nomReto.equalsIgnoreCase(retos[i].getNomReto())) {
                a = retos[i];
            }

        }
        return a;

    }
}
