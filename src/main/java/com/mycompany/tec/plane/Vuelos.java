/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tec.plane;
////
////////
public class Vuelos {
    //
    private int NumeroVuelo;
    private String Origen;
    private String Destino;
    
    private int door;

    /**
     * @return the Numero
     */
    public int getNumeroVuelo() {
        return NumeroVuelo;
    }

    /**
     * @param Numero the Numero to set
     */
    public void setNumeroVuelo(int Numero) {
        this.NumeroVuelo = Numero;
    }

    /**
     * @return the Origen
     */
    public String getOrigen() {
        return Origen;
    }

    /**
     * @param Origen the Origen to set
     */
    public void setOrigen(String Origen) {
        this.Origen = Origen;
    }

    /**
     * @return the Destino
     */
    public String getDestino() {
        return Destino;
    }

    /**
     * @param Destino the Destino to set
     */
    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    /**
     * @return the door
     */
    public int getDoor() {
        return door;
    }

    /**
     * @param door the door to set
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
    public int generar_Puerta(int [] cantpuertas, int datoarr, Vuelos flight){
        
        if (datoarr > cantpuertas.length){
            System.out.println("El numero de puerta que intenta asignar es mayor al de puertas existentes");
        }
        
        flight.setDoor(cantpuertas[datoarr]);
        
        
        return flight.getDoor();
        
    }
            
            NodoUser front;
        NodoUser rear;
        int size;

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

            return prioridad;
        }

        public int size() {
            return this.size;
        }

        public void clear() {
            this.front = new NodoUser();
            this.rear = this.front;
            this.size = 0;
        }

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

        public void consultarcola() {
            NodoUser temp = front;

            while (temp != null) {
                System.out.println(temp.getData().getNombre());
                temp = temp.getNext();
            }
        }

        public void removeFirstNodeEspecial() {
            if (front == null) {
                System.out.println("Vacio");
            } else {
                NodoUser temp = front;
                if (temp.getData().getPlanLealtad().equalsIgnoreCase("Ingreso Especial")) {
                    front = front.next;
                    temp.next = null;
                } else {
                    System.out.println(" Ya se atendieron a todos los Usuarios de Ingreso Especial");
                }
            }
        }

        public void removeFirstNode() {
            if (front == null) {
                System.out.println("Vacio");
            } else {
                NodoUser temp = front;

                front = front.next;
                temp.next = null;
            }
        }
        
        
        
        public CheckIn Codigos(CheckIn codes){
            NodoUser temp = front;
                   
            while(temp != null){
                codes.agregaracola(temp.getData().getAsiento());
                temp= temp.next;
            }
            
            return codes;
            
            
            
        }
        
        
        

        @Override
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

