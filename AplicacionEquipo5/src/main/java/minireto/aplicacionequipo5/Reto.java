/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minireto.aplicacionequipo5;
import enums.Dificultad;
import enums.Actividades;
import java.time.LocalDateTime;
/**
 *
 * @author Mario Cuevas
 */
public class Reto {
    private String nomReto;
    private Usuario usuarioCreador;
    private LocalDateTime fechaHora;
    private Actividades tipoActividad;
    private int distancia;
    private Dificultad dificultad;
    private int numWP;
    private WayPoints waypoints[];
    
    //OPCIONALES
    private int desnivelNeg;
    private int desnivelPos;
    private String periodo;  
    private String comentario;

    
    //CONSTRUCTOR PARA LOS OBLIGATORIOS
    public Reto(String nomReto, Usuario nomUsuario, LocalDateTime fechaHora, Actividades tipoActividad, int distancia, Dificultad dificultad, int numWP) {
        
        //Atributos obligatorios
        this.nomReto = nomReto;
        this.usuarioCreador = nomUsuario;
        this.fechaHora = fechaHora;
        this.tipoActividad = tipoActividad;
        this.distancia = distancia;
        this.dificultad = dificultad;
        this.numWP = numWP;
        
        this.waypoints=new WayPoints[this.numWP];
    

        
        /*PASAR AL PRINCIPAL DONDE CONSRUYES EL OBJETO
        
        System.out.println("Quieres introducir desniveles? Y/N");
        char desnivel= t.next().toUpperCase().charAt(0);
        if (desnivel=='Y'){
            System.out.println("desnivel positivo:");
            setDesnivelPos(t.nextInt());
            System.out.println("desnivel negativo:");
            setDesnivelNeg(t.nextInt());
            
        }
        
        System.out.println("Quieres introducir el periodo en el que se realizó? Y/N");
        char p = t.next().toUpperCase().charAt(0);
        if (p=='Y'){
            System.out.println("A continuación introduce el periodo:");
            setPeriodo(t.nextLine());
        }
        
        System.out.println("Quieres introducir un comentario acerca del reto? Y/N");
        char comment = t.next().toUpperCase().charAt(0);
        if (comment=='Y'){
            System.out.println("A continuacion introduce el comentario");
            setComentario(t.nextLine());
        }
        */
    }

    public void setDesnivelNeg(Integer desnivelNeg) {
        this.desnivelNeg = desnivelNeg;
    }

    public void setDesnivelPos(Integer desnivelPos) {
        this.desnivelPos = desnivelPos;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    
    public String getNomReto() {
        return nomReto;
    }
    
    public void agregarWaypoint(WayPoints waypoint, int i) {
        if (i >= 0 && i < waypoints.length) {
            waypoints[i] = waypoint;
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }
    
}
