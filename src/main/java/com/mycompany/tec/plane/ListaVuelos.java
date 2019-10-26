/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tec.plane;

import java.util.Random;
public class ListaVuelos {
    ////////////
     public class Nodo{
            
            Vuelos data;
            Nodo next;

            public Nodo(){
                next=null;
                data= null;
            }

            public Nodo(Vuelos num){
                this.data= num;
                
            }
  
            public void setData(Vuelos num){
                this.data= num;
            } 
            
            public Vuelos getData(){
                return this.data;
            }
            public Nodo getNext() {
			return this.next;
		}
        }
        
        
        public Nodo head;
        public Nodo tail;
        public Nodo current;
        public int size;
        
        
        
        public int getsize(){
            return this.size;
        }
  
        
        
        /**
         * 
         * @param num es l vuelo que desea insertar a la lista de vuelos
         */
        public void insertar(Vuelos num){
            Nodo temp = new Nodo(num);
            if (head == null){
                head= temp;
                tail= temp;
                size++;
            }
            else{
                tail.next= temp;
                tail= temp;
                size++;
            } 
        }
        
        /**
         * 
         * @param num el vuelo que se desea encontrar
         * @return 
         */
       /* public boolean encontrar(Vuelos num){
            Nodo temp = this.head;
            
            while(temp != null){
         
                
                if(temp.getData() == num){
                    //System.out.println(temp.getData());
                    return true;   
                }
                else{
                    temp=temp.getNext();
                }
            }
            return false;
           
        }*/
        
        public Vuelos encontrar(String destino){
            Nodo temp = this.head;
            
            while(temp != null){
         
                
                if(temp.getData().getDestino().equalsIgnoreCase(destino)){
                    
                    return temp.getData();   
                }
                else{
                    temp=temp.getNext();
                }
            }
            return null;
           
        }
        /**
         * 
         * @param list    lista de vuelos a los cuales se le asignaran las puertas respectivas siempre y cuando se encuentren dentro de la cantidad de puertas existentes
         * @param arrpuertas   arreglo con la cantidad de puertas existentes creados en la funcion 3.1
         */
        public void setearpuertas_vuelos(ListaVuelos list,int [] arrpuertas){
              
            Nodo temp= head;
            int A=0;
            while(A < list.size){
                Random rnd= new Random();                       // generar numero aleatorio dentro del rango del array 
                int numrandom=  rnd.nextInt(arrpuertas.length);             
                
                
                temp.getData().generar_Puerta(arrpuertas, numrandom, temp.getData());  // setarle a cada vuelo la puerta respectiva dentro de las existentes 
                temp= temp.next;
                A++;
            }
            
            Nodo print= head;
            while(print != null){    // consultar cada vuelo con cada puerta respectiva
                System.out.println("El numero de puerta del vuelo: " + print.getData().getNumeroVuelo() + " es: " + print.getData().getDoor());
                print= print.next;
            }

        }
        
       public void consultarcola() {
            Nodo temp = head;

            while (temp != null) {
                System.out.println(temp.getData().getDestino());
                temp = temp.getNext();
            }
        }
        
     @Override
    public String toString() {
            Nodo currentNode = this.head.getNext();

            StringBuffer result = new StringBuffer();

    for (int i = 0; currentNode != null; i++) 
            {
            if (i > 0) 
                    {
                    result.append(",");
            }
            String element = currentNode.getData().getDestino();

            result.append(element == null ? "" : element);
            currentNode = currentNode.getNext();
    }
    return result.toString();
    }
        
        
        
    
}
