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
public class Puerta {

    //

    private int num_puerta;

    /**
     * @return the num_puerta
     */
    public int getNum_puerta() {
        return num_puerta;
    }

    /**
     * @param num_puerta the num_puerta to set
     */
    public void setNum_puerta(int num_puerta) {
        this.num_puerta = num_puerta;
    }

    /**
     *
     * @param cant numero de puertas que se desea crear en total
     * @return
     */
    public int[] crear_puertas(int cant) {

        int[] cant_puertas = new int[cant];

        for (int i = 1; i <= cant; i++) {
            cant_puertas[i - 1] = i;
        }

        return cant_puertas;
    }

    public ListaPuertas setear_puertas(int[] cantpuertas, ListaPuertas lista) {
        for (int i = 1; i < cantpuertas.length; i++) {
            Puerta nuevapuerta = new Puerta();
            nuevapuerta.setNum_puerta(cantpuertas[i]);
            lista.insertar(nuevapuerta);         
        }
        return lista;
    }

    
    
      
}
