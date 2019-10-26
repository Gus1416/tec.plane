  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tec.plane;
///
import java.io.IOException;
import java.util.Random;

public class Salida {
    
float prom_time_salida;
///////////
float prom_time_espe;

float prom_time_plat;

float prom_time_oro;

float prom_time_eco;
///////////
int cantpeoplesalida;
///////////
int cantEspe;

int cantPlat;

int cantOro;

int cantEco;
///////////
int timeSalida;
///////////
int timeSalidaEsp;

int timeSalidaPlat;

int timeSalidaOro;

int timeSalidaEco;



Random radin = new Random();

int atencion = radin.nextInt(151);

String Comentario = "Pésimo servicio";

public String salida_pasajeros(Vuelos cola, int atencion, String Comentario) throws IOException{
    
    String coment = Comentario;
            
    String comentario = cola.front.getData().setComentario(coment);
    
    Analyze analizarOpinion = new Analyze();

    cola.consultarcola();
    
    String atendiendo = "Atendiendo a: " + cola.front.getData().getNombre();
    
    if(cola.front.getData().getPlanLealtad().equals("Ingreso Especial")){
        
        cantEspe +=1;
        timeSalidaEsp += atencion + cola.front.getData().getTimeEsperaEntrada();
        prom_time_espe =  timeSalidaEsp / cantEspe;
        
        cantpeoplesalida +=1;
        timeSalida += atencion;
        prom_time_salida = timeSalida / cantpeoplesalida;

    }
    
    if(cola.front.getData().getPlanLealtad().equals("Platino")){
        
        cantPlat +=1;
        timeSalidaPlat += atencion  + cola.front.getData().getTimeEsperaEntrada();
        prom_time_plat =  timeSalidaPlat / cantPlat;
        
        cantpeoplesalida +=1;
        timeSalida += atencion;
        prom_time_salida = timeSalida / cantpeoplesalida;

    }
    
    if(cola.front.getData().getPlanLealtad().equals("Oro")){
        
        cantOro +=1;
        timeSalidaOro += atencion  + cola.front.getData().getTimeEsperaEntrada();
        prom_time_oro =  timeSalidaOro / cantOro;
        
        cantpeoplesalida +=1;
        timeSalida += atencion;
        prom_time_salida = timeSalida / cantpeoplesalida;

    }
    
        
    if(cola.front.getData().getPlanLealtad().equals("Económico")){
        
        cantEco +=1;
        timeSalidaEco += atencion  + cola.front.getData().getTimeEsperaEntrada();
        prom_time_eco =  timeSalidaEco / cantEco;
        
        cantpeoplesalida +=1;
        timeSalida += atencion;
        prom_time_salida = timeSalida / cantpeoplesalida;

    }
    
    System.out.println("cantidad total de personas atendidas: " + cantpeoplesalida + ", Cant Espe: " + cantEspe + ", Cant Plat: " + cantPlat + ", Cant Oro: " + cantOro + ", Cant Eco: " + cantEco);
    System.out.println("Nuevo tiempo de espera: " + atencion);
    System.out.println("tiempo total de personas en salida: " + timeSalida + ", time espe: " + timeSalidaEsp + ", time plat: " + timeSalidaPlat + ", time oro: " + timeSalidaOro + ", time eco: " + timeSalidaEco );
    System.out.println("Promedio de espera: " + prom_time_salida + ", prom wait spe: " + prom_time_espe + ", prom wait plat: " + prom_time_plat + ", prom wait oro: "+ prom_time_oro + ", prom wait eco: " + prom_time_eco);
    
    
    String plan = "Con el plan de lealtad: " + cola.front.getData().getPlanLealtad();
    
    String tiemp = "Con un tiempo de atención de: " + atencion;
    
    String resultado;
    resultado = analizarOpinion.AnalizarSentimiento(comentario);
    
    cola.removeFirstNode();
    
    cola.consultarcola();
    
    System.out.println(resultado);
    return atendiendo + "\n" + plan + "\n" + tiemp + "\n" + resultado + "\n" + "*******************************************" + "\n";
    
}
    
}
