/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tec.plane;

///Esta clase permite almacenar la información de cada pasajero en Nodos
public class NodoUser {
      ///      ////
    
    //Atributos
     User data;
     NodoUser next;

     //Métodos
     //Constructores
    public NodoUser() {
        next = null;
        data = null;
    }

    public NodoUser(User num) {
        this.data = num;

    }
    
    //setea el usuario
    public void setData(User num) {
        this.data = num;
    }
    
    //Devuelve el user, que contiene la información del pasajero
    public User getData() {
        return this.data;
    }

    //Devuelve el siguiente Usuario
    public NodoUser getNext() {
        return this.next;
    }
    //Setea el siguiente nodo
    public void setNext(NodoUser next) {
        this.next = next;
    }

}
    
    

