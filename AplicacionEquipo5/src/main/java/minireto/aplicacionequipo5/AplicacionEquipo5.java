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
        char p;
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
                    + "8.Salir de la aplicacion\n"
                    + "Elige una opcion: ");
            num = new Scanner(System.in).nextInt();
            switch (num) {
                //crear usuario
                case 1 -> {
                    usuarios = Arrays.copyOf(usuarios, (int) usuarios.length + 1);
                    usuarios[usuarios.length - 1] = new Usuario();

                    System.out.println("¿Quieres introducir tu numero de telefono? Y/N");
                    p = new Scanner(System.in).next().toUpperCase().charAt(0);
                    if (p == 'Y') {
                        System.out.println("A continuación introduce el numero de telefono:");
                        usuarios[usuarios.length - 1].setTelefono(new Scanner(System.in).nextLine());
                    }
                    System.out.println("¿Quieres introducir tu genero? Y/N");
                    p = new Scanner(System.in).next().toUpperCase().charAt(0);
                    if (p == 'Y') {
                        System.out.println("A continuación introduce tu genero:");
                        usuarios[usuarios.length - 1].setGenero(new Scanner(System.in).nextLine());
                    }
                    System.out.println("¿Quieres introducir tu provincia? Y/N");
                    p = new Scanner(System.in).next().toUpperCase().charAt(0);
                    if (p == 'Y') {
                        System.out.println("A continuación introduce tu provincia:");
                        usuarios[usuarios.length - 1].setProvincia(new Scanner(System.in).nextLine());
                    }
                    System.out.println("Usuario creado");

                }
                //crear un reto
                case 2 -> {
                    if (usuarios.length == 0) {
                        System.out.println("No hay usuarios creados");
                    } else {
                        Usuario usuario = validarUsuario();
                        if (usuario == null) {
                            System.out.println("Usuario incorrecto");
                        } else {
                            retos = Arrays.copyOf(retos, retos.length + 1);
                            retos[retos.length - 1] = usuario.crearReto();
                            System.out.println("¿Quieres introducir desniveles? Y/N");
                            p = new Scanner(System.in).next().toUpperCase().charAt(0);
                            if (p == 'Y') {
                                System.out.println("desnivel positivo:");
                                retos[retos.length - 1].setDesnivelPos(new Scanner(System.in).nextInt());
                                System.out.println("desnivel negativo:");
                                retos[retos.length - 1].setDesnivelNeg(new Scanner(System.in).nextInt());
                            }
                            System.out.println("¿Quieres introducir el periodo en el que se realizó? Y/N");
                            p = new Scanner(System.in).next().toUpperCase().charAt(0);
                            if (p == 'Y') {
                                System.out.println("A continuación introduce el periodo:");
                                retos[retos.length - 1].setPeriodo(new Scanner(System.in).nextLine());
                            }

                            System.out.println("¿Quieres introducir un comentario acerca del reto? Y/N");
                            p = new Scanner(System.in).next().toUpperCase().charAt(0);
                            if (p == 'Y') {
                                System.out.println("A continuacion introduce el comentario");
                                retos[retos.length - 1].setComentario(new Scanner(System.in).nextLine());
                            }
                            System.out.println("reto registrado con exito");
                            usuario.realizaReto(retos[retos.length - 1]);
                            System.out.println("¿Quieres introducir un comentario acerca del reto? Y/N");
                            p = new Scanner(System.in).next().toUpperCase().charAt(0);
                            if (p == 'Y') {
                                System.out.println("A continuacion introduce el comentario");
                                usuario.getRetosRealizados()[usuario.getRetosRealizados().length - 1].setComentarios(new Scanner(System.in).nextLine());
                            }
                            System.out.println("reto realizado con exito");

                        }
                    }

                }

                //realizar un reto
                case 3 -> {
                    if (retos.length == 0) {
                        System.out.println("No hay retos creados");
                    } else {
                        Usuario usuario = validarUsuario();
                        Reto reto = null;

                        if (usuario == null) {
                            System.out.println("Usuario incorrecto");
                        } else {
                            reto = elegirReto();
                            if (reto == null) {
                                System.out.println("nombre del reto incorrecto");
                            } else {
                                usuario.realizaReto(reto);
                                System.out.println("¿Quieres introducir un comentario acerca del reto? Y/N");
                                p = new Scanner(System.in).next().toUpperCase().charAt(0);
                                if (p == 'Y') {
                                    System.out.println("A continuacion introduce el comentario");
                                    usuario.getRetosRealizados()[usuario.getRetosRealizados().length - 1].setComentarios(new Scanner(System.in).nextLine());
                                }
                                System.out.println("reto realizado con exito");
                            }

                        }

                    }

                }
                //valorar un reto
                case 4 -> {
                    if (retos.length == 0) {
                        System.out.println("No hay retos creados");
                    } else {
                        Usuario usuario = validarUsuario();
                        Reto reto = null;
                        if (usuario == null) {
                            System.out.println("Usuario incorrecto");
                        } else {
                            reto = elegirReto();
                            if (reto == null) {
                                System.out.println("nombre del reto incorrecto");
                            } else {
                                usuario.valorarReto(reto);
                                System.out.println("valoracion enviada");
                            }

                        }
                    }

                }
                //ver los waypoints de un reto
                case 5 -> {
                    if (retos.length == 0) {
                        System.out.println("No hay retos creados");
                    } else {
                        Reto reto = elegirReto();
                        System.out.println("Reto: " + reto.getNomReto());
                        for (int i = 0; i < reto.getWaypoints().length; i++) {
                            System.out.println(reto.getWaypoints()[i]);
                        }
                    }

                }
                //ver los retos que ha creado un usuario
                case 6 -> {
                    if (usuarios.length == 0) {
                        System.out.println("No hay usuarios creados");
                    } else if (retos.length == 0) {
                        System.out.println("No hay retos creados");
                    } else {
                        Usuario usuario = validarUsuario();
                        if (usuario == null) {
                            System.out.println("Usuario incorrecto");
                        } else {
                            for (int i = 0; i < usuario.getRetosCreados().length; i++) {
                                System.out.println(usuario.getRetosCreados()[i].getNomReto());
                            }
                        }

                    }
                }
                //ver las valoraciones de un reto
                case 7 -> {
                    if (usuarios.length == 0) {
                        System.out.println("No hay usuarios creados");
                    } else if (retos.length == 0) {
                        System.out.println("No hay retos creados");
                    } else if (validarValoraciones()) {
                        System.out.println("No hay valoraciones ");
                    } else {
                        Reto reto = elegirReto();
                        if (reto == null) {
                            System.out.println("nombre del reto incorrecto");
                        } else {
                            for (int i = 0; i < usuarios.length; i++) {
                                for (int j = 0; j < usuarios[i].getRetosValorados().length; j++) {
                                    if (reto.getNomReto().equalsIgnoreCase(usuarios[i].getRetosValorados()[j].getR().getNomReto())) {
                                        System.out.println(usuarios[i].getRetosValorados()[j]);
                                    }
                                }
                            }
                        }
                    }

                }
                //salir
                case 8 ->
                    System.out.println("!Hasta la proxima¡");
                default ->
                    System.out.println("Has introduccido un valor erroneo, prueba otra vez");
            }
        } while (num != 8);
    }

    //método para buscar y validar usuario
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

    //método para buscar y validar un reto
    public static Reto elegirReto() {
        Reto a = null;
        String nomReto = "";
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

    public static boolean validarReto(String nombreReto) {

        boolean repetido = false;
        for (int i = 0; i < retos.length && !repetido; i++) {
            if (retos[i] != null && retos[i].getNomReto().equals(nombreReto)) {
                repetido = true;
            }
        }
        return repetido;
    }

    public static Usuario validarUsuario(String nombre, String apellido1, String apellido2) {
        Usuario a = null;

        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i] != null && usuarios[i].getNombre().equalsIgnoreCase(nombre) && usuarios[i].getApellido1().equalsIgnoreCase(apellido1) && usuarios[i].getApellido2().equalsIgnoreCase(apellido2)) {
                a = usuarios[i];
            }
        }
        return a;
    }
//metodo que te dice si hay valoraciones
    public static boolean validarValoraciones() {
        boolean vacio = true;
        for (int i = 0; i < usuarios.length && vacio; i++) {
            if (usuarios[i].getRetosValorados() != null) {
                vacio = false;
            }
        }
        return vacio;
    }
}
