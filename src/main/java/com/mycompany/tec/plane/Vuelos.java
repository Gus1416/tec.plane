/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tec.plane;

////////
public class Vuelos {
    //
    private int NumeroVuelo;
    private String Origen;
    private String Destino;
    
    private int door;

    /**
     * @return the Numero
     */
    public int getNumeroVuelo() {
        return NumeroVuelo;
    }

    /**
     * @param Numero the Numero to set
     */
    public void setNumeroVuelo(int Numero) {
        this.NumeroVuelo = Numero;
    }

    /**
     * @return the Origen
     */
    public String getOrigen() {
        return Origen;
    }

    /**
     * @param Origen the Origen to set
     */
    public void setOrigen(String Origen) {
        this.Origen = Origen;
    }

    /**
     * @return the Destino
     */
    public String getDestino() {
        return Destino;
    }

    /**
     * @param Destino the Destino to set
     */
    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    /**
     * @return the door
     */
    public int getDoor() {
        return door;
    }

    /**
     * @param door the door to set
     */
    public void setDoor(int door) {
        this.door = door;
    }
    
    
    
    /**
     * 
     * @param cantpuertas es el arreglo con la cantidad de puertas existentes creadas en el metodo 3.1
     * @param datoarr numero que va a asignar a la puerta del vuelo
     * @param flight  el vuelo al cual se le definira la puerta 
     * @return 
     */
    public int generar_Puerta(int [] cantpuertas, int datoarr, Vuelos flight){
        
        if (datoarr > cantpuertas.length){
            System.out.println("El numero de puerta que intenta asignar es mayor al de puertas existentes");
        }
        
        flight.setDoor(cantpuertas[datoarr]);
        
        
        return flight.getDoor();
        
    }
            
    
}
