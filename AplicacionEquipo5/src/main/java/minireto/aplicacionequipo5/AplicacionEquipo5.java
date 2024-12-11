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
private static Usuario[] usuarios=new Usuario[0];
private static Reto[] retos=new Reto[0];
    public static void main(String[] args) {

        
        int num=0;
         do{
             
             System.out.println("---Menu deporte--\n"
                     + "1.Crear usuarios\n"
                     + "2.Registrar retos\n"
                     + "3.Realizar retos\n"
                     + "4.Valorar retos\n"
                     + "5.Ver un reto con sus waypoints\n"
                     + "6.Ver los retos de un usuario\n"
                     + "7.Ver las valoraciones de un reto\n"
                     + "8.Salir de la aplicacion");   
             switch(num){
                 
                 case 1-> {
                     Arrays.copyOf(usuarios,usuarios.length+1);
                     usuarios[usuarios.length-1]= new Usuario();
                 }
                 case 2-> {
                     Usuario usuario=null;
                     
                     System.out.println("introduce nombre de usuario");
                     String nombre = new Scanner(System.in).next();
                     System.out.println("introduce apellido1 de usuario");
                     String apellido1 = new Scanner(System.in).next();
                     System.out.println("introduce apellido2 de usuario");
                     String apellido2 = new Scanner(System.in).next();
                     validarUsuario(nombre,apellido1,apellido2);
                     if(usuario==null){
                         System.out.println("Usuario incorrecto");
                     }
                     else{
                         usuario.crearReto();
                     }   
                 }
                 case 3-> {
                     for (int i = 0; i < 10; i++) {
                         
                     }
                 }
                 case 4-> {
                     
                 }
                 case 5-> {
                     
                 }
                 case 6-> {
                     
                 }                
                 case 7-> {
                     
                 }
                 case 8-> System.out.println("!Hasta la proxima¡");              
                 default-> System.out.println("Has introduccido un valor erroneo, prueba otra vez");
             }           
         }while(num!=8);       
    }
    public static Usuario validarUsuario(String nombre,String apellido1,String apellido2){
        Usuario a= null;
        for (int i = 0; i < usuarios.length; i++) {
            if(usuarios[i].getNombre().equalsIgnoreCase(nombre) && usuarios[i].getApellido1().equalsIgnoreCase(apellido1) && usuarios[i].getApellido2().equalsIgnoreCase(apellido2)){
                a = usuarios[i];
            }
        }
        return a;
    }
}
