/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tec.plane;
//////////

/**
 *
 * @author Sebastian
 */
//Permite almacenar la información de cada puerta, crear un arreglo con una cantidad de puertas 
//definida y también poseea un método que recibe como parámetros un arreglo con las puertas creadas
//y una nueva lista que permite cambiar el número de puertes existentes.

public class Puerta {

    //Almacena el número de puerta

    private int num_puerta;

    /**
     * Devuelve el número de puerta
     */
    public int getNum_puerta() {
        return num_puerta;
    }

    /**
     * setea el número de puerta
     */
    public void setNum_puerta(int num_puerta) {
        this.num_puerta = num_puerta;
    }

    /**
     *
     * @param cant numero de puertas que se desea crear en total
     * @return
     */
    
    //Recibe un parametro de tipo entero con el número de puertas que se desea 
    //crear en total y genera un arreglo con dicha cantidad de puertas.
    public int[] crear_puertas(int cant) {

        int[] cant_puertas = new int[cant];

        for (int i = 1; i <= cant; i++) {
            cant_puertas[i - 1] = i;
        }

        return cant_puertas;
    }

    //Este método es utilizado para configurar el número de puertas existentes
    public ListaPuertas setear_puertas(int[] cantpuertas, ListaPuertas lista) {
        for (int i = 1; i < cantpuertas.length; i++) {
            Puerta nuevapuerta = new Puerta();
            nuevapuerta.setNum_puerta(cantpuertas[i]);
            lista.insertar(nuevapuerta);         
        }
        //Devuelve la lista de puertes configurada
        return lista;
    }

    
    
      
}
