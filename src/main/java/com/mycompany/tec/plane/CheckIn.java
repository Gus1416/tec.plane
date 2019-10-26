/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tec.plane;

public class CheckIn {
///////
    NodoCodigos front;
    NodoCodigos rear;
    int size;
    
   //
    public void agregaracola(String Data) {
        NodoCodigos passenger = new NodoCodigos(Data);

        if (front == null) {
            front = passenger;
            rear = front;
            size++;
        } else {
            rear.setNext(passenger);
            rear = passenger;
            size++;
        }
    }

    
    
   
    

    public int size() {
        return this.size;
    }


    
    
    
public void consultarcola(){
            NodoCodigos temp = front;
            int A=1;
            while(temp!= null){
                System.out.println(temp.getData());
                temp= temp.getNext();
                A++;    
            }   
        }
        
        





    @Override
    public String toString() {
        String result = "** Resultado de Cola**\n";
        NodoCodigos tFront = this.front;
        int tSize = this.size;
        while (tSize != 0) {
            result += tFront.getData() + "\n";
            tFront = tFront.getNext();
            tSize--;
        }
        return result;
    }

}
