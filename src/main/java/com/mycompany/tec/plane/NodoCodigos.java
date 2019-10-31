/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tec.plane;

/**
 *
 * @author Sebastian
 */

//Esta clase permite almacenar los codigos de asiento de los pasajeros en nodos
public class NodoCodigos {
    
    ////Atributos
    //Almacena cada código de asiento
    String data;
    NodoCodigos next;

    
    //Métodos
    //Contructor
    public NodoCodigos (String num) {
        this.data = num;

    }
    
    //setea el código de asiento
    public void setData(String num) {
        this.data = num;
    }
    
    //Devuelve el código de asiento
    public String getData() {
        return this.data;
    }
    
    //Devuelve el siguiente código de asiento
    public NodoCodigos getNext() {
        return this.next;
    }
    
    //Setea el siguiente código
    public void setNext(NodoCodigos next) {
        this.next = next;
    }
    
}
    

