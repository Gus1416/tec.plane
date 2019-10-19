/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tec.plane;


public class NodoUser {
      ///      ////
     User data;
     NodoUser next;

    public NodoUser() {
        next = null;
        data = null;
    }

    public NodoUser(User num) {
        this.data = num;

    }

    public void setData(User num) {
        this.data = num;
    }

    public User getData() {
        return this.data;
    }

    public NodoUser getNext() {
        return this.next;
    }

    public void setNext(NodoUser next) {
        this.next = next;
    }

}
    
    

