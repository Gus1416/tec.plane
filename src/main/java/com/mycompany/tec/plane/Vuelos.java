/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tec.plane;
////
////////
//Almacena los datos de cada vuelo, 
public class Vuelos {
    //Atributos
    
    //Almacenan los datos del vuelo
    private int NumeroVuelo;
    private String Origen;
    private String Destino;
    
    private int door;

    /**
     * Devuelve el número de vuelo
     */
    public int getNumeroVuelo() {
        return NumeroVuelo;
    }

    /**
     * @setea el número de vuelo
     */
    public void setNumeroVuelo(int Numero) {
        this.NumeroVuelo = Numero;
    }

    /**
     * Devuelve el origen del vuelo
     */
    public String getOrigen() {
        return Origen;
    }

    /**
     * setea el origen del vuelo 
     */
    public void setOrigen(String Origen) {
        this.Origen = Origen;
    }

    /**
     * devuelve el destino del vuelo 
     */
    public String getDestino() {
        return Destino;
    }

    /**
     * setea el destino del vuelo
     */
    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    /**
     * devuelve un número de puerta
     */
    public int getDoor() {
        return door;
    }

    /**
     * setea el número de puerta
     */
    public void setDoor(int door) {
        this.door = door;
    }
    
    
    
    /**
     * 
     * @param cantpuertas es el arreglo con la cantidad de puertas existentes creadas en el metodo 3.1
     * @param datoarr numero que va a asignar a la puerta del vuelo
     * @param flight  el vuelo al cual se le definira la puerta 
     * @return 
     */
    
    //Asigna una puerta a un vuelo especifico
    public int generar_Puerta(int [] cantpuertas, int datoarr, Vuelos flight){
        
        if (datoarr > cantpuertas.length){
            System.out.println("El numero de puerta que intenta asignar es mayor al de puertas existentes");
        }
        
        flight.setDoor(cantpuertas[datoarr]);
        
        
        return flight.getDoor();
        
    }
         
        //Atributos
    
        NodoUser front;
        NodoUser rear;
        int size;

        //Agrega un nuevo pasajero al vuelo
        public void agregaracola(User Data) {
            NodoUser passenger = new NodoUser(Data);

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
        /*
         *Recibe como parámetros un vuelo, prioridad cola a la cual se le van a pasar los pasajeros 
         *según el ordende prioridad y el destino del vuelo
        */
        //Define un orden de prioridad según el plan de lealtad en cada vuelo.
        public Vuelos prioridad_cola(Vuelos colainicial, Vuelos prioridad, String destino) {

            NodoUser temp1 = front;
            prioridad.setDestino(destino);
            
            // Especial
            while (temp1 != null) {
                if (temp1.getData().getPlanLealtad().equalsIgnoreCase("Ingreso Especial")) {
                    prioridad.agregaracola(temp1.getData());
                    temp1 = temp1.getNext();
                } else {
                    temp1 = temp1.getNext();
                }

            }

            NodoUser temp2 = front;
            // Platino
            while (temp2 != null) {
                if (temp2.getData().getPlanLealtad().equalsIgnoreCase("Platino")) {
                    prioridad.agregaracola(temp2.getData());
                    temp2 = temp2.getNext();
                } else {
                    temp2 = temp2.getNext();
                }
            }

            NodoUser temp3 = front;

            // Oro
            while (temp3 != null) {
                if (temp3.getData().getPlanLealtad().equalsIgnoreCase("Oro")) {
                    prioridad.agregaracola(temp3.getData());
                    temp3 = temp3.getNext();
                } else {
                    temp3 = temp3.getNext();
                }

            }

            NodoUser temp4 = front;

            // Economico
            while (temp4 != null) {
                if (temp4.getData().getPlanLealtad().equalsIgnoreCase("Económico")) {
                    prioridad.agregaracola(temp4.getData());
                    temp4 = temp4.getNext();
                } else {
                    temp4 = temp4.getNext();
                }

            }
            
            //Devuelve el vuelo ordenado en el orden de prioridad
            return prioridad;
        }
        
        //Devuelve el tamaño de la cola vuelos
        public int size() {
            return this.size;
        }
        
        //Limpia la cola 
        public void clear() {
            this.front = new NodoUser();
            this.rear = this.front;
            this.size = 0;
        }

        //Devuelve todos los pasajeros con plan de lealtad de ingreso especial
        public String verEspeciales() {
            NodoUser temp = this.front;
            String result = "";
            while (temp != null) {
                if (temp.getData().getPlanLealtad().equals("Ingreso Especial")) {
                    result = result + temp.getData().getNombre() + "\n";
                    temp = temp.getNext();
                } else {
                    temp = temp.getNext();
                }
            }
            return result;
        }
        
        //Devuelve todos los pasajeros con plan de lealtad de platino
        public String verPlatinos() {
            NodoUser temp = this.front;
            String result = "";
            while (temp != null) {
                if (temp.getData().getPlanLealtad().equals("Platino")) {
                    result = result + temp.getData().getNombre() + "\n";
                    temp = temp.getNext();
                } else {
                    temp = temp.getNext();
                }
            }
            return result;
        }
        
        //Devuelve todos los pasajeros con plan de lealtad de oro
        public String verOros() {
            NodoUser temp = this.front;
            String result = "";
            while (temp != null) {
                if (temp.getData().getPlanLealtad().equals("Oro")) {
                    result = result + temp.getData().getNombre() + "\n";
                    temp = temp.getNext();
                } else {
                    temp = temp.getNext();
                }
            }
            return result;
        }

        //Devuelve todos los pasajeros con plan de lealtad de económico
        public String verEconomicos() {
            NodoUser temp = this.front;
            String result = "";
            while (temp != null) {
                if (temp.getData().getPlanLealtad().equals("Económico")) {
                    result = result + temp.getData().getNombre() + "\n";
                    temp = temp.getNext();
                } else {
                    temp = temp.getNext();
                }
            }
            return result;
        }
        
        //Devuelve el nombre de todos los pasajeros de la cola
        public void consultarcola() {
            NodoUser temp = front;

            while (temp != null) {
                System.out.println(temp.getData().getNombre());
                temp = temp.getNext();
            }
        }
        
        //Remueve el primer pasajero de ingreso especial
        public void removeFirstNodeEspecial() {
            if (front == null) {
                System.out.println("Vacio");
            } else {
                NodoUser temp = front;
                if (temp.getData().getPlanLealtad().equalsIgnoreCase("Ingreso Especial")) {
                    front = front.next;
                    temp.next = null;
                } else {
                    //si ya no hay más pasajeros con el plan de lealtad de ingreso especial muestra un mensaje
                    System.out.println(" Ya se atendieron a todos los Usuarios de Ingreso Especial");
                }
            }
        }
        
        //Remueve el primer elemento de la cola
        public void removeFirstNode() {
            if (front == null) {
                System.out.println("Vacio");
            } else {
                NodoUser temp = front;

                front = front.next;
                temp.next = null;
            }
        }
        
        
        //Devuelve el código de asiento de un pasajero
        public CheckIn Codigos(CheckIn codes){
            NodoUser temp = front;
                   
            while(temp != null){
                codes.agregaracola(temp.getData().getAsiento());
                temp= temp.next;
            }
            
            return codes;
            
            
            
        }
        
        //Duelve la cantidad de personas atendidas por plan de lealtad.
        public String SegunPlanLealtad(){
            
            //Almacena la cantidad de persona por plan de lealtad
            int ECO=0;
            int OR= 0;
            int PO=0;
            int EL= 0;
            
            NodoUser temp1= front;
            NodoUser temp2 = front;
            
             while (temp1 != null) {
                if (temp1.getData().getPlanLealtad().equalsIgnoreCase("Ingreso Especial")) {
                    EL++;
                    temp1 = temp1.getNext();
                } else {
                    temp1 = temp1.getNext();
                }

            }

         
            // Platino
            while (temp2 != null) {
                if (temp2.getData().getPlanLealtad().equalsIgnoreCase("Platino")) {
                    PO++;
                    temp2 = temp2.getNext();
                } else {
                    temp2 = temp2.getNext();
                }
            }

            NodoUser temp3 = front;

            // Oro
            while (temp3 != null) {
                if (temp3.getData().getPlanLealtad().equalsIgnoreCase("Oro")) {
                    OR++;
                    temp3 = temp3.getNext();
                } else {
                    temp3 = temp3.getNext();
                }

            }

            NodoUser temp4 = front;

            // Economico
            while (temp4 != null) {
                if (temp4.getData().getPlanLealtad().equalsIgnoreCase("Económico")) {
                    ECO++;
                    temp4 = temp4.getNext();
                } else {
                    temp4 = temp4.getNext();
                }
         
        }
        
        String resultados =  "La cantidad de personas atendidas de Ingreso especial es:" + EL +  " de Platino: " + PO +" de Oro:"  + OR +" de Economico:" + ECO;
           
        //Devuelve la cantidad de personas por cada plan de lealtad
         return resultados;   
        }
        

        @Override
        
        //Devuelve los pasajeros que no han sido atendidos en la cola.
        public String toString() {
            String result = "* Resultado de Cola*\n";
            NodoUser tFront = this.front;
            int tSize = this.size;
            while (tSize != 0) {
                result += tFront.getData().getNombre() + "\n";
                tFront = tFront.getNext();
                tSize--;
            }
            return result;
        }

    }

