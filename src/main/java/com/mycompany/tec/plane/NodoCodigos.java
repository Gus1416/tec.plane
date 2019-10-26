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
public class NodoCodigos {
    
    ////
    String data;
    NodoCodigos next;

    

    public NodoCodigos (String num) {
        this.data = num;

    }

    public void setData(String num) {
        this.data = num;
    }

    public String getData() {
        return this.data;
    }

    public NodoCodigos getNext() {
        return this.next;
    }
    
    public void setNext(NodoCodigos next) {
        this.next = next;
    }
    
}
    

