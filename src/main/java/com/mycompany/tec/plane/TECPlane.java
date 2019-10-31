/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tec.plane;

import java.io.IOException;
import java.util.Random;

import java.util.Arrays;

import java.io.*; 
import java.util.*; 


public class TECPlane {
////
   ////
    public static void main(String[] args) throws IOException {
        
        
        User Pedro = new User();
        User Alex = new User();
        User Maria = new User();
        User Carla = new User();
        User Carlos = new User();
        
        Vuelos cola = new Vuelos();
        Vuelos nueva = new Vuelos();
        
        
        Random random = new Random();
       int posAsiento = random.nextInt(3);
       int numAsiento = random.nextInt(100);
       
       int esperaRandom = random.nextInt(170);
        
        Pedro.setDestiny("Portugal");
        Pedro.setFechaNacimiento("10-09-17");
        Pedro.setNacionalidad("Costarricense");
        Pedro.setNombre("Pedro");
        Pedro.setOrigin("Costa Rica");
        Pedro.setPlanLealtad("Ingreso Especial");
        Pedro.setPasaporte(1717171);
        Pedro.setAsiento(posAsiento, Pedro.getPlanLealtad(), numAsiento);
        Pedro.setTimeEsperaEntrada(esperaRandom);
        
        
        
        
        Alex.setDestiny("Alemania");
        Alex.setFechaNacimiento("18-09-18");
        Alex.setNacionalidad("Costarricense");
        Alex.setNombre("Alex");
        Alex.setOrigin("Costa Rica");
        Alex.setPlanLealtad("Oro");
        Alex.setPasaporte(1919182);
        Alex.setAsiento(posAsiento, Alex.getPlanLealtad(), numAsiento);
        Alex.setTimeEsperaEntrada(esperaRandom);
        
        
       
        Maria.setDestiny("Francia");
        Maria.setFechaNacimiento("11-10-00");
        Maria.setNacionalidad("Costarricense");
        Maria.setNombre("Maria");
        Maria.setOrigin("Costa Rica");
        Maria.setPlanLealtad("Ingreso Especial");
        Maria.setPasaporte(726789);
        Maria.setAsiento(posAsiento, Maria.getPlanLealtad(), numAsiento);
        Maria.setTimeEsperaEntrada(esperaRandom);
        
        
        
        Carla.setDestiny("Belgica");
        Carla.setFechaNacimiento("12-08-00");
        Carla.setNacionalidad("Costarricense");
        Carla.setNombre("Carla");
        Carla.setOrigin("Costa Rica");
        Carla.setPlanLealtad("Platino");
        Carla.setPasaporte(17718);
        Carla.setAsiento(posAsiento, Carla.getPlanLealtad(), numAsiento);
        Carla.setTimeEsperaEntrada(esperaRandom);
        
      
        Carlos.setDestiny("Belgica");
        Carlos.setFechaNacimiento("12-08-00");
        Carlos.setNacionalidad("Costarricense");
        Carlos.setNombre("Carlos");
        Carlos.setOrigin("Costa Rica");
        Carlos.setPlanLealtad("Oro");
        Carlos.setPasaporte(17718);
        Carlos.setAsiento(posAsiento, Carlos.getPlanLealtad(), numAsiento);
        Carlos.setTimeEsperaEntrada(esperaRandom);
        
        
        /// INSERT DATOS A LA COLA NORMAL
        
        
        System.out.println();
        System.out.println("***********Ingreso Inicial a la cola**********");
        System.out.println();
        
        // EN ESTE ORDEN DE PLAN ESTAN INGRESANDO A LA COLA NORMAL
        //cola.agregaracola(Carla); // Economico
        ///cola.agregaracola(Carlos);  //Oro
       //// cola.agregaracola(Alex);   // Oro            // Carla,Carlos,Alex,Maria,Pedro
        //cola.agregaracola(Maria); // Platino
       // cola.agregaracola(Pedro);  //Especial
       
        
        //System.out.println(cola.toString());

        
        System.out.println();
        System.out.println("***********PRIORIDAD**********");
        System.out.println();
        
  

        
        
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
        System.out.println("Resultado de asignacion de vuelos");
        
       
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
       //vuelo1.agregaracola(Carla);
       
       vuelo2.setDestino("Brazil");
       vuelo2.setNumeroVuelo(99);
       vuelo2.setOrigen("Costa Rica");
       //vuelo2.agregaracola(Carlos);
       
       vuelo3.setDestino("Rusia");
       vuelo3.setNumeroVuelo(71);
       vuelo3.setOrigen("Costa Rica");
       vuelo3.agregaracola(Alex);
       vuelo3.agregaracola(Carla);
       vuelo3.agregaracola(Carlos);
       vuelo3.agregaracola(Maria);
       vuelo3.agregaracola(Pedro);
       
       EnvioSMS envio = new EnvioSMS();
       //envio.EnvioDeMensaje(Alex.getAsiento());
       
       
       ListaVuelos listflight = new ListaVuelos();
       ListaVuelos ORDENADISIMA = new ListaVuelos();
       
       listflight.insertar(vuelo1);
       listflight.insertar(vuelo2);
       listflight.insertar(vuelo3);
       
       System.out.println();
       System.out.println();
       System.out.println("AGARRAR COLA DESDE LA LISTA DE VUELOS");
       Vuelos getvuelorandom = listflight.encontrar("Rusia");
       System.out.println(getvuelorandom.toString());
       
       
       Vuelos pri = new Vuelos();
        
       Vuelos ordenado = getvuelorandom.prioridad_cola(getvuelorandom,pri,"Rusia");
       
       ORDENADISIMA.insertar(ordenado);
        System.out.println("LISTA DE VUELOS ORDENADASSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println(ORDENADISIMA.toString());
        ORDENADISIMA.consultarcola();
       
       System.out.println();
       System.out.println();
       System.out.println("*********************************************");
       
       
       
       listflight.setearpuertas_vuelos(listflight, cantPuertas);
       
      
        Salida analizarOpinion = new Salida();
        
        String comentario = "Pésimo servicio";
        
        Random radin = new Random();

        int atencion = radin.nextInt(151);
        
        analizarOpinion.salida_pasajeros(vuelo3, atencion, comentario);
        
        
        System.out.print("Segunda persona: ");
        
        int atencion2 = radin.nextInt(151);
        
        analizarOpinion.salida_pasajeros(vuelo3, atencion2, comentario);
        
        
        
        
        
        
       //-----------------------------------------ADMINISTRACION---------------------------------------------
       
       // Cola actual del vuelo especifico
       
        System.out.println(vuelo3.toString());
       
        // 1
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("VER LAS PUERTAS EXISTETES");
        System.out.println(Arrays.toString(cantPuertas));     
        
        //2
        //-----------------------------------------------------------------------------
        System.out.println("Cantidad de personas en la cola del vuelo 3");     //2.1
        System.out.println(vuelo3.size);
        //--------------------------------------------------------------------------------------------------------------------------------------------------------
        
        //-----------------------------------------------------------------------------
        System.out.println("Siguiente Cliente del Vuelo");     //2.2
        System.out.println(vuelo3.front.next.data.getNombre());
        //-------------------------------------------------------------------------------
        
        //-----------------------------------------------------------------------------
        System.out.println("Codigos de los Asientos del vuelo especifico");     //2.3
        CheckIn codes = new CheckIn();
        CheckIn codigos = vuelo3.Codigos(codes);
        System.out.println("Los codigos de asiento Son: ");
        codigos.consultarcola();
        //-------------------------------------------------------------------------------
        
        
        //3
        //-----------------------------------------------------------------------------
              // SE HACE A NIVEL DE INTERFAZ
        //-------------------------------------------------------------------------------
        //
        
        //4
        //----------------------------------------------------------------------------------------------------------------
        //Se obtienen los tiempos promedio de las variables que se ubican en la clase salida "prom_

        //5
        
        //6
        //---------------------------------------
        // Basicamente es obtener el counteratencion que corresponde a todos los usuarios de todos los vuelos que fueron registrados
        //---------------------------------------
        
        
        //7
        //-----------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("Atencion por puertas");
        // La solapilla es una lista de vuelos y se mete en cada vuelo y obtiene la puerta asignada a cada uno para que 
        // se muestre en pantalla
        
        System.out.println("Puerta del vuelo 3 asignada : " + vuelo3.getDoor());
        
        // Obtener basicamente le hace un:
        
        // Size contiene a toda la gente metida en la cola del vuelo entonces es la misma vara que la gente atendida en la puerta especifica del vuelo
        System.out.println("Cantidad de personas atendidas en la puerta" + vuelo3.getDoor() + "es: " + vuelo3.size);
        //---------------------------------------------------------------------------------------------------------------------------------------------------
        
        //8
        //-----------------------------------------------------------------------------------------------------------------------------------------------
        //---------------------------------------
        // Basicamente es obtener el countersalida (aun falta testearlo a nivel de interfaz ( su buen funcionamiento es un misterio)
        //---------------------------------------
        
        
        
        
        
        
        
        
    }
    
}
