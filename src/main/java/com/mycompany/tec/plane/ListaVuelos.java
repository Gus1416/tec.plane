/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tec.plane;

import java.util.Random;

//Esta clase permite almacenar cada vuelo en una estructura de lista enlazada simple
public class ListaVuelos {
    ////////////
     public class Nodo{
         
            //Atributos
         
            Vuelos data;
            Nodo next;
            
            //Métodos

            public Nodo(){
                next=null;
                data= null;
            }

            public Nodo(Vuelos num){
                this.data= num;
                
            }
            
            //Setea la información de un vuelo.
            public void setData(Vuelos num){
                this.data= num;
            } 
            
            //Obtiene el dato con la información de un vuelo.
            public Vuelos getData(){
                return this.data;
            }
            
            public Nodo getNext() {
			return this.next;
		}
        }
        
        //Atributos
        public Nodo head;
        public Nodo tail;
        public Nodo current;
        public int size;
        
        
        //Métodos
        //Duelve el tamaño de la ListaVuelos
        public int getsize(){
            return this.size;
        }
  
        
        
        /**
         * 
         * @param num es l vuelo que desea insertar a la lista de vuelos
         */
        
        //Inserta un vuelo a la Lista
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
        
        //Accede a la lista vuelos y devuelve el código de los pasajeros de un vuelo específico.
        public Vuelos listafinal(Vuelos ultima){
            
            Nodo tempo = head;
            while( tempo != null){
                NodoUser beg = tempo.data.front;
                while(beg != null){
                    User DATA = beg.data;
                    ultima.agregaracola(DATA);   
                    beg = beg.next;
                }
                tempo = tempo.next;
            }
            
            return ultima;
          
        }
        
        //Recibe como prámetro en String con el nombre del vuelo, busca si el vuelo existe y lo devuelve el dato del tipo Vuelos. 
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
         * @param list    lista de vuelos a los cuales se les asigna las puertas respectivas siempre y cuando se encuentren dentro de la cantidad de puertas existentes
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
        
       //Obtiene y devuelve el dato destino de cada vuelo existente.
       public void consultarcola() {
            Nodo temp = head;

            while (temp != null) {
                System.out.println(temp.getData().getDestino());
                temp = temp.getNext();
            }
        }
        
     @Override
     //Duelve los vuelos existentes
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
