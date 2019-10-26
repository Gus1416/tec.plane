package com.mycompany.tec.plane;
///
public class Nodo {

    Puerta data;
    Nodo next;

    public Nodo() {
        next = null;
        data = null;
    }

    public Nodo(Puerta num) {
        this.data = num;

    }

    public void setData(Puerta num) {
        this.data = num;
    }

    public Puerta getData() {
        return this.data;
    }

    public Nodo getNext() {
        return this.next;
    }
}
