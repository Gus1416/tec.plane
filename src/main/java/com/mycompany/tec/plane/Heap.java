
package com.mycompany.tec.plane;

import java.util.Arrays;

public class Heap {

    private User[] Heap;
    private int size;
    private int maxsize;
 
    private static final int FRONT = 1;
 
    public Heap(int maxsize)
    {
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new User[this.maxsize + 1];
        Heap[0] = new User(Integer.MAX_VALUE);
    }
 
    private int parent(int pos)
    {
        return pos / 2;
    }
 
    private int leftChild(int pos)
    {
        return (2 * pos);
    }
 
    private int rightChild(int pos)
    {
        return (2 * pos) + 1;
    }
 
    private boolean isLeaf(int pos)
    {
        if (pos >=  (size / 2)  &&  pos <= size)
        {
            return true;
        }
        return false;
    }
 
    private void swap(int fpos,int spos)
    {
        User tmp;
        tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    }
 
    private void maxHeapify(int pos)
    {
        if (!isLeaf(pos))
        { 
            if ( Heap[pos].getPrioridad() < Heap[leftChild(pos)].getPrioridad()  || Heap[pos].getPrioridad() < Heap[rightChild(pos)].getPrioridad())
            {
                if (Heap[leftChild(pos)].getPrioridad() > Heap[rightChild(pos)].getPrioridad())
                {
                    swap(pos, leftChild(pos));
                    maxHeapify(leftChild(pos));
                }else
                {
                    swap(pos, rightChild(pos));
                    maxHeapify(rightChild(pos));
                }
            }
        }
    }
 
    public void insert(User user)
    {
        Heap[++size] = user;
        int current = size;
 
        while(Heap[current].getPrioridad() > Heap[parent(current)].getPrioridad())
        {
            swap(current,parent(current));
            current = parent(current);
        }	
    }

    public void maxHeap()
    {
        for (int pos = (size / 2); pos >= 1; pos--)
        {
            maxHeapify(pos);
        }
    }
 
    public User remove()
    {
        User popped = Heap[FRONT];
        Heap[FRONT] = Heap[size--]; 
        maxHeapify(FRONT);
        return popped;
    }
    
    public void recorrer(Vuelos lista){
        int contador = 1;
        while (contador <= this.size){
            User user = remove();
            lista.agregaracola(user);
            contador++;
        }
    }
 
    public void ver(){
        System.out.println(Arrays.toString(Heap));
    }
}
