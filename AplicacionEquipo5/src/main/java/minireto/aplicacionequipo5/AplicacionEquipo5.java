/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package minireto.aplicacionequipo5;

/**
 *
 * @author DAM119
 */
public class AplicacionEquipo5 {

    public static void main(String[] args) {

        
        int num=0;
         do{
             
             System.out.println("1.Crear usuarios\n"
                     + "2.Registrar usuarios\n"
                     + "3.Realizar retos\n"
                     + "4.Valorar retos\n"
                     + "5.Ver un reto con sus waypoints\n"
                     + "6.Ver los retos de un usuario\n"
                     + "7.Ver las valoraciones de un reto\n"
                     + "8.Salir de la aplicacion");   
             switch(num){
                 
                 case 1-> { // Hay que añadir 3 metodos más opcionales y habria que cambiar el sout de arriba 
                     
                 }
                 case 2-> {
                     
                 }
                 case 3-> {
                     
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
}
