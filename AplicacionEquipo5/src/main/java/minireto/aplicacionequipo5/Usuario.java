/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minireto.aplicacionequipo5;


import java.time.LocalDate;
import java.time.LocalDateTime;


import enums.Actividades;
import enums.Dificultad;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


/**
 *
 * @author dam120
 */
public class Usuario {
    
    private String email;
    private String nombre;
    private String apellidos;
    private LocalDate fechaNac;
    private String telefono;
    private String genero;
    private String provincia;
    private RetoRealizado[] retosRealizados;
    private Reto[] retosCreados;



    public Usuario(String email, String nombre, String apellidos, Date fechaNac) {
        this.email = email;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
        this.retosRealizados= new RetoRealizado[0];
        this.retosCreados = new Reto[0];
    }


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

 public void registrarReto(String nombre,Usuario usuario,LocalDateTime fecha,int tipoActividad,int distancia){
     
 }

    public void crearReto(){
        System.out.print("Nombre del reto: ");
        String nombre= new Scanner(System.in).next();
        Usuario creador= Usuario.this;
        LocalDateTime fechaHora=formatoFecha();
        Actividades actividad=elegirActividad();
        System.out.print("Distancia: ");
        int distancia= new Scanner(System.in).nextInt();
        Dificultad dificultad=elegirDificultad();
        Arrays.copyOf(this.retosCreados,this.retosCreados.length+1);
        retosCreados[this.retosCreados.length-1]= new Reto(nombre,creador,fechaHora,actividad,distancia,dificultad);
        
    }
    public LocalDateTime formatoFecha(){
        
        DateTimeFormatter f =DateTimeFormatter.ofPattern("dd-MM-yyyy a las hh:mm:ss");
        LocalDateTime a =LocalDateTime.parse(String.valueOf(LocalDateTime.now()),f);
        return a;
    }
    public Actividades elegirActividad(){
        Actividades actividad=null;
        int opcion=0;
        do{
            System.out.println("---Elige una actividad---");
        System.out.println("1 - Alpinismo");
        System.out.println("2 - Bicicleta de carretera");
        System.out.println("3 - Bicicleta de montaña");
        System.out.println("4 - Descenso MTB");
        System.out.println("5 - Escalada");
        System.out.println("6 - Esqui de montaña");
        System.out.println("7 - Raquetas de nieve");
        System.out.println("8 - Running");
        System.out.println("9 - Senderismo");
        System.out.println("10 - Trail running");
        opcion = new Scanner(System.in).nextInt();
        switch(opcion){
            case 1 ->{
                actividad= Actividades.ALPINISMO;
            }
            case 2 ->{
                actividad= Actividades.BICICLETA_DE_CARRETERA;
            }
            case 3 ->{
                actividad= Actividades.BICICLETA_DE_MONTAÑA;
            }
            case 4 ->{
                actividad= Actividades.DESCENSO_MTB;
            }
            case 5 ->{
                actividad= Actividades.ESCALADA;
            }
            case 6 ->{
                actividad= Actividades.ESQUI_DE_MONTAÑA;
            }
            case 7 ->{
                actividad= Actividades.RAQUETAS_DE_NIEVE;
            }
            case 8 ->{
                actividad= Actividades.RUNNING;
            }
            case 9 ->{
                actividad= Actividades.SENDERISMO;
            }
            case 10 ->{
                actividad= Actividades.TRAIL_RUNNING;
            }
            default->{
                System.out.println("numero incorrecto");
            }
        }
        }while(opcion<0 && opcion>10);
        return actividad;
    }
    public Dificultad elegirDificultad(){
        Dificultad dificultad=null;
        int opcion=0;
        do{
        System.out.println("---Elige una dificultad---");
        System.out.println("1 - Facil");
        System.out.println("2 - Normal");
        System.out.println("3 - Dificil");
        System.out.println("4 - Muy dificil");
        System.out.println("5 - Extrema");
        
        opcion = new Scanner(System.in).nextInt();
        switch(opcion){
            case 1 ->{
                dificultad= Dificultad.FACIL;
            }
            case 2 ->{
                dificultad= Dificultad.NORMAL;
            }
            case 3 ->{
                dificultad= Dificultad.DIFICIL;
            }
            case 4 ->{
                dificultad= Dificultad.MUY_DIFICIL;
            }
            case 5 ->{
                 dificultad= Dificultad.EXTREMA;
            }
            default->{
                System.out.println("numero incorrecto");
            }
        }
        }while(opcion<0 && opcion>5);
        return dificultad;
    }


    public void realizaReto(){
        
    }

    
    
    
    
}
