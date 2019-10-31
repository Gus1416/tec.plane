package com.mycompany.tec.plane;

//Esta clase permite almacenar puertas en una estructura de lista enlazada simple
public class ListaPuertas {
    
///Atributos
    
    public Nodo head;
    public Nodo tail;
    public Nodo current;
    public int size;

///Métodos
    //Obtiene el tamaño de la ListaPuertas
    public int getsize() {
        return this.size;
    }

    /**
     *
     * @param num es l vuelo que desea insertar a la lista de vuelos
     */
    
    //Recibe como parámetro un vuelo que se desea insertar a la lista
    public void insertar(Puerta num) {
        Nodo temp = new Nodo(num);
        if (head == null) {
            head = temp;
            tail = temp;
            size++;
        } else {
            tail.next = temp;
            tail = temp;
            size++;
        }
    }

    @Override
    //Duelve la ListaPuertas existentes
    public String toString() {
        Nodo currentNode = this.head.getNext();

        StringBuffer result = new StringBuffer();

        for (int i = 0; currentNode != null; i++) {
            if (i > 0) {
                result.append(",");
            }
            Puerta element = currentNode.getData();

            result.append(element == null ? "" : element);
            currentNode = currentNode.getNext();
        }
        return result.toString();
    }

}
