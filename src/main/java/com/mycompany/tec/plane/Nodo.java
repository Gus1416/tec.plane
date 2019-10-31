package com.mycompany.tec.plane;
///

//Permite almacenar la información de cada puerta en nodos
public class Nodo {
    
    //Atributos
    //Almacena cada dato de puerta
    Puerta data;
    Nodo next;

    //Métodos
    //Costructores
    public Nodo() {
        next = null;
        data = null;
    }

    public Nodo(Puerta num) {
        this.data = num;

    }

    //Setea una puerta
    public void setData(Puerta num) {
        this.data = num;
    }

    //devuelve el dato de la puerta
    public Puerta getData() {
        return this.data;
    }

    //Devuelve la siguiente puerta
    public Nodo getNext() {
        return this.next;
    }
}
