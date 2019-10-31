  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tec.plane;
///
import java.io.IOException;
import java.util.Random;

/*
 *Esta clase permite atender a cada una de las personas en la cola Salida, y generar los tiempos de espera totales y por plan de lealtad
*/
public class Salida {

//Atributos   
static float prom_time_salida;//Almacena el tiempo promedio de espera en la atencción de salida
///////////

//Almacena el tiempo promedio de espera por plan de lealtad 
static float prom_time_espe;

static float prom_time_plat;

static float prom_time_oro;

static float prom_time_eco;
///////////

//Almacena la cantidad total de personas atendidas en la cola de salida
static int cantpeoplesalida;
///////////

//Almacena la cantidad de personas atedidas por pla de lealtad en la  cola de salida.
static int cantEspe;

static int cantPlat;

static int cantOro;

static int cantEco;
///////////

//Almacena el tiempo total de espera es la cola de salida 
static int timeSalida;
///////////


//Almacena el tiempo total por plan de lealtad de espera en la cola de salida
static int timeSalidaEsp;

static int timeSalidaPlat;

static int timeSalidaOro;

static int timeSalidaEco;



Random radin = new Random();

//Genera un entero random de atención
int atencion = radin.nextInt(151);

String Comentario = "Pésimo servicio";

/*
 * recibe como parámetros un vuelo, un entero con el tiempo de atencion y el un String con el comentario a analizar.
*/
public String salida_pasajeros(Vuelos cola, int atencion, String Comentario) throws IOException{
    
    String coment = Comentario;
            
    String comentario = cola.front.getData().setComentario(coment);
    
    Analyze analizarOpinion = new Analyze();

    cola.consultarcola();
    
    //Obtiene al pasajero que se esta atendiendo.
    String atendiendo = "Atendiendo a: " + cola.front.getData().getNombre();
    
    /*Verifica en cual plan de lealtad se encuentra el pasajero.
     *Suma 1 a la cantidad total de personas atendidas en general y también al plan de lealtad en que se encuentra.
     *Suma el tiempo de espera general y el tiempo de espera al plan de lealtdad.
     *Obtiene y almacena el promedio de espera general y por plan de lealtad.
    */
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
    
    //Le pasa el parámetro comentario al método AnalizarSentimiento de la clase Analyze para obtener el sentimiento
    //encontrado, su porcentaje y magnitud.
    resultado = analizarOpinion.AnalizarSentimiento(comentario);
    
    cola.removeFirstNode();
    
    cola.consultarcola();
    
    System.out.println(resultado);
    
    //Devuelve un String que contiene el nombre del pasajero atendido, plan de lealtad, tiempo de espera por pasajero y resultado del analisis del sentimiento.
    return atendiendo + "\n" + plan + "\n" + tiemp + "\n" + resultado + "\n" + "*******************************************" + "\n";
    
}
    
}
