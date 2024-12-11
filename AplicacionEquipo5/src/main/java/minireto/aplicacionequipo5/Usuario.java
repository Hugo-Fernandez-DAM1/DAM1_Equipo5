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
import java.time.LocalTime;
import java.time.Month;
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
    private String apellido1;
    private String apellido2;
    private LocalDate fechaNac;
    private String telefono;
    private String genero;
    private String provincia;
    private RetoRealizado[] retosRealizados;
    private ValoracionDelReto[] retosValorados;
    private Reto[] retosCreados;



    public Usuario() {
        System.out.println("Inroduce el email:");
        this.email = new Scanner(System.in).next(); 
        System.out.println("Inroduce el nombre:");
        this.nombre = new Scanner(System.in).next();
        System.out.println("Inroduce el apellido1:");
        this.apellido1 = new Scanner(System.in).next();
        System.out.println("Inroduce el apellido2:");
        this.apellido2 = new Scanner(System.in).next();
        System.out.println("Inroduce el ano de nacimiento:");
        int ano = new Scanner(System.in).nextInt();
        System.out.println("Inroduce el mes de nacimiento:");
        int mes = new Scanner(System.in).nextInt();
        System.out.println("Inroduce el dia de nacimiento:");
        int dia = new Scanner(System.in).nextInt();
        this.fechaNac = LocalDate.of(ano,mes,dia);
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
        System.out.print("Numero de Waypoints: ");
        int numWP= new Scanner(System.in).nextInt();

        Arrays.copyOf(this.retosCreados,this.retosCreados.length+1);
        retosCreados[this.retosCreados.length-1]= new Reto(nombre,creador,fechaHora,actividad,distancia,dificultad,numWP);
        realizaReto(retosCreados[this.retosCreados.length-1]);

        retosCreados[this.retosCreados.length-1]= new Reto(nombre,creador,fechaHora,actividad,distancia,dificultad,numWP);

        
        System.out.println("Quieres introducir desniveles? Y/N");
        char desnivel= new Scanner(System.in).next().toUpperCase().charAt(0);
        if (desnivel=='Y'){
            System.out.println("desnivel positivo:");
            retosCreados[this.retosCreados.length-1].setDesnivelPos(new Scanner(System.in).nextInt());
            System.out.println("desnivel negativo:");
            retosCreados[this.retosCreados.length-1].setDesnivelNeg(new Scanner(System.in).nextInt());          
        }
        
        System.out.println("Quieres introducir el periodo en el que se realizó? Y/N");
        char p = new Scanner(System.in).next().toUpperCase().charAt(0);
        if (p=='Y'){
            System.out.println("A continuación introduce el periodo:");
            retosCreados[this.retosCreados.length-1].setPeriodo(new Scanner(System.in).nextLine());
        }
        
        System.out.println("Quieres introducir un comentario acerca del reto? Y/N");
        char comment = new Scanner(System.in).next().toUpperCase().charAt(0);
        if (comment=='Y'){
            System.out.println("A continuacion introduce el comentario");
            retosCreados[this.retosCreados.length-1].setComentario(new Scanner(System.in).nextLine());
        }
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


    public void realizaReto(Reto reto){
        LocalDateTime fInicio=LocalDateTime.now();
        LocalDateTime fFinal=LocalDateTime.now();
        int tiempoMov=0;
        int velMedia=0;
        do{
            System.out.println("introduce la fecha de inicio");
        System.out.println("ano: ");
        int ano= new Scanner(System.in).nextInt();
        System.out.println("mes: ");
        int mes= new Scanner(System.in).nextInt();
        System.out.println("dia: ");
        int dia= new Scanner(System.in).nextInt();
        System.out.println("Introduce la hora de inicio: ");
        System.out.println("Hora: ");
        int hora= new Scanner(System.in).nextInt();
        System.out.println("Minuto: ");
        int min= new Scanner(System.in).nextInt();
        System.out.println("Segundo: ");
        int seg= new Scanner(System.in).nextInt();
        fInicio = formatoFecha(dia,mes,ano,hora,min,seg);
        System.out.println("introduce la fecha final");
        System.out.println("ano: ");
        ano= new Scanner(System.in).nextInt();
        System.out.println("mes: ");
        mes= new Scanner(System.in).nextInt();
        System.out.println("dia: ");
        dia= new Scanner(System.in).nextInt();
        System.out.println("Introduce la hora final: ");
        System.out.println("Hora: ");
        hora= new Scanner(System.in).nextInt();
        System.out.println("Minuto: ");
        min= new Scanner(System.in).nextInt();
        System.out.println("Segundo: ");
        seg= new Scanner(System.in).nextInt();
        fFinal = formatoFecha(dia,mes,ano,hora,min,seg);
        }while(fInicio.isBefore(fFinal));
        while(tiempoMov<=0){
        System.out.println("Tiempo en movimiento (minutos):");
        tiempoMov =  new Scanner(System.in).nextInt();
        if(tiempoMov<=0){
            System.out.println("introduce un numero positivo");
        }
        }
        while(velMedia<=0){
        System.out.println("Velocidad media (Km/h):");
        tiempoMov =  new Scanner(System.in).nextInt();
        if(velMedia<=0){
            System.out.println("introduce un numero positivo");
        }
        }
        Arrays.copyOf(this.retosRealizados,this.retosRealizados.length+1);
        retosRealizados[this.retosRealizados.length-1]= new RetoRealizado(reto,fInicio,fFinal,tiempoMov,velMedia);
        
    }
    public LocalDateTime formatoFecha(){
        
        DateTimeFormatter f =DateTimeFormatter.ofPattern("dd-MM-yyyy a las hh:mm:ss");
        LocalDateTime a =LocalDateTime.parse(String.valueOf(LocalDateTime.now()),f);
        return a;
    }
    public LocalDateTime formatoFecha(int dia,int mes ,int ano,int hora,int min,int seg){
        
        DateTimeFormatter f =DateTimeFormatter.ofPattern("dd-MM-yyyy a las hh:mm:ss");
        LocalDateTime fecha = LocalDateTime.of(seg, min, min, hora, min, seg);
        LocalDateTime a =LocalDateTime.parse(String.valueOf(LocalDateTime.of(seg, min, min, hora, min, seg)),f);
        return a;
    }

    public void valorarReto(Reto reto){
        int valoracion =0;
        while(valoracion<=0){
            System.out.println("Introduce la valoracion del reto(0-5):");
            valoracion= new Scanner(System.in).nextInt();
            if(valoracion<=0){
                System.out.println("numero incorrecto");
            }
        }
        Arrays.copyOf(this.retosValorados,this.retosValorados.length+1);
        retosValorados[this.retosValorados.length-1]= new ValoracionDelReto(reto,valoracion);
    }
    
    
    
    
}
