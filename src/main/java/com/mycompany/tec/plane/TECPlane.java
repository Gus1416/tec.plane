/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tec.plane;

import java.io.IOException;
import java.util.Random;


public class TECPlane {
////
   ////
    public static void main(String[] args) throws IOException {
        
        
        User Pedro = new User();
        User Alex = new User();
        User Maria = new User();
        User Carla = new User();
        User Carlos = new User();
        
        CheckIn cola = new CheckIn();
        CheckIn nueva = new CheckIn();
        
        
        
        Pedro.setDestiny("Portugal");
        Pedro.setFechaNacimiento("10-09-17");
        Pedro.setNacionalidad("Costarricense");
        Pedro.setNombre("Pedro");
        Pedro.setOrigin("Costa Rica");
        Pedro.setPlanLealtad("Ingreso Especial");
        Pedro.setPasaporte(1717171);
        
        
        
        
        Alex.setDestiny("Alemania");
        Alex.setFechaNacimiento("18-09-18");
        Alex.setNacionalidad("Costarricense");
        Alex.setNombre("Alex");
        Alex.setOrigin("Costa Rica");
        Alex.setPlanLealtad("Oro");
        Alex.setPasaporte(1919182);
        
        
       
        Maria.setDestiny("Francia");
        Maria.setFechaNacimiento("11-10-00");
        Maria.setNacionalidad("Costarricense");
        Maria.setNombre("Maria");
        Maria.setOrigin("Costa Rica");
        Maria.setPlanLealtad("Ingreso Especial");
        Maria.setPasaporte(726789);
        
        
        
        Carla.setDestiny("Belgica");
        Carla.setFechaNacimiento("12-08-00");
        Carla.setNacionalidad("Costarricense");
        Carla.setNombre("Carla");
        Carla.setOrigin("Costa Rica");
        Carla.setPlanLealtad("Platinol");
        Carla.setPasaporte(17718);
        
      
        Carlos.setDestiny("Belgica");
        Carlos.setFechaNacimiento("12-08-00");
        Carlos.setNacionalidad("Costarricense");
        Carlos.setNombre("Carlos");
        Carlos.setOrigin("Costa Rica");
        Carlos.setPlanLealtad("Oro");
        Carlos.setPasaporte(17718);
        
        
        /// INSERT DATOS A LA COLA NORMAL
        
        
        System.out.println();
        System.out.println("***********Ingreso Inicial a la cola**********");
        System.out.println();
        
        // EN ESTE ORDEN DE PLAN ESTAN INGRESANDO A LA COLA NORMAL
        cola.agregaracola(Carla); // Economico
        cola.agregaracola(Carlos);  //Oro
        cola.agregaracola(Alex);   // Oro            // Carla,Carlos,Alex,Maria,Pedro
        cola.agregaracola(Maria); // Platino
        cola.agregaracola(Pedro);  //Especial
       
        
        System.out.println(cola.toString());

        
        System.out.println();
        System.out.println("***********PRIORIDAD**********");
        System.out.println();
        
  
        System.out.println(cola.prioridad_cola(cola, nueva).toString());
        CheckIn  orden = cola.prioridad_cola(cola, nueva);
        
        
        /*System.out.println();
        System.out.println("QUITAR EL PRIMERO");
        orden.removeFirstNode();
        orden.consultarcola();
        //System.out.println(orden.toString());
        System.out.println(" quitar segundo");
        orden.removeFirstNode();
        orden.consultarcola();
*/
        //System.out.println(orden.toString());
        
        System.out.println();
        System.out.println("Rsultado de asignacion de vuelos");
        
       
        // FUNCION    3.1 ???????
        
       // Para poder montarle el arreglo con la cantidad de puertas elegida por el usuario a nivel de interfaz 
       Puerta door = new Puerta();
       int []cantPuertas= door.crear_puertas(7);
        
       // vuelo al que se le asignaran todas la pichas de la vaca 
       
       Vuelos vuelo1 = new Vuelos();
       Vuelos vuelo2 = new Vuelos();
       Vuelos vuelo3 = new Vuelos();
       
        
       // Le seteo todos los datos al vuelo  
       vuelo1.setDestino("Holanda");
       vuelo1.setNumeroVuelo(17);
       vuelo1.setOrigen("Costa Rica");
       
       vuelo2.setDestino("Brazil");
       vuelo2.setNumeroVuelo(99);
       vuelo2.setOrigen("Costa Rica");
       
       vuelo3.setDestino("Rusia");
       vuelo3.setNumeroVuelo(71);
       vuelo3.setOrigen("Costa Rica");
       
       
       ListaVuelos listflight = new ListaVuelos();
       
       listflight.insertar(vuelo1);
       listflight.insertar(vuelo2);
       listflight.insertar(vuelo3);
       
       
       
       listflight.setearpuertas_vuelos(listflight, cantPuertas);
       
      
        Salida analizarOpinion = new Salida();
        
        String comentario = "Pésimo servicio";
        
        Random radin = new Random();

        int atencion = radin.nextInt(151);
        
        analizarOpinion.salida_pasajeros(orden, atencion, comentario);
        
        System.out.print("Segunda persona");
        
        analizarOpinion.salida_pasajeros(orden, atencion, comentario);
        
        
        
        
    }
    
}
