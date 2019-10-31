/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tec.plane;

//Almacena los códigos de asiento en una cola
public class CheckIn {
///////
    //Atributos
    NodoCodigos front;
    NodoCodigos rear;
    int size;
    
   //Métodos
    
    //Agrega un nuevo pasajero un nuevo código de asiento a la cola
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

    
    
   
    
    //Devuelve el tamaño de la cola
    public int size() {
        return this.size;
    }


    
    
 //Consulta los códigos que hay en dicha cola   
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
    
    //Devuelve los pasajeros que no han sido atendidos
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
