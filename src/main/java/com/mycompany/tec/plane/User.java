package com.mycompany.tec.plane;

import java.util.Random;

//Esta clase almacena los datos de cada psajero.
public class User {
//////////
    private String Nombre;
    private String FechaNacimiento;
    private int pasaporte;
    private String Nacionalidad;
    private String origin;
    private String destiny;
    private String planLealtad;
    private String asiento;
    private String comentario;
    private int timeEsperaEntrada;
    private int prioridad;

    public User(int prioridad){
        this.Nombre = null;
        this.FechaNacimiento = null;
        this.Nacionalidad = null;
        this.asiento = null;
        this.comentario = null;
        this.contador = 0;
        this.destiny = null;
        this.origin = null;
        this.pasaporte = 0;
        this.planLealtad = null;
        this.timeEsperaEntrada = 0;
        this.prioridad = prioridad;
        
    }
        public User(){
        this.Nombre = null;
        this.FechaNacimiento = null;
        this.Nacionalidad = null;
        this.asiento = null;
        this.comentario = null;
        this.contador = 0;
        this.destiny = null;
        this.origin = null;
        this.pasaporte = 0;
        this.planLealtad = null;
        this.timeEsperaEntrada = 0;
        this.prioridad = 0;
        
    }
    //Obtiene la prioridad de cada pasajero
    public int getPrioridad(){
        return prioridad;
    }
    
    public void setPrioridad(int prioridad){
        this.prioridad = prioridad;
    }
    
    //Obtiene el comentario de cada persona
    public String getComentario() {
        return comentario;
    }

    public String setComentario(String comentario) {
        this.comentario = comentario;
        return comentario;
    }

    /**
     * Devuelve el nombre de cada pasajero
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Setea el nombre del pasajero
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * devuelve la fecha de nacimiento del pasajero
     */
    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    /**
     * setea la fecha de nacimiento de cada pasajero
     */
    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    /**
     *  Devuelve el número de pasaporte
     */
    public int getPasaporte() {
        return pasaporte;
    }

    /**
     * setea el número de pasaporte del pasajero
     */
    public void setPasaporte(int pasaporte) {
        this.pasaporte = pasaporte;
    }

    /**
     *Devuelve la nacionalidad
     */
    public String getNacionalidad() {
        return Nacionalidad;
    }

    /**
     * setea la nacionalidad del pasajero
     */
    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    /**
     * devuelve el lugar de origen del pasajero
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * setea el lugar de origen del pasajero
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * devuelve el destino del pasajero
     */
    public String getDestiny() {
        return destiny;
    }

    /**
     * setea el destino del pasajero
     */
    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    /**
     * devuelve el plan de lealtad del pasajero
     */
    public String getPlanLealtad() {
        return planLealtad;
    }

    /**
     * setea el plan de lealtad del pasajero
     */
    public void setPlanLealtad(String planLealtad) {
        this.planLealtad = planLealtad;
    }

    /**
     * devuelve el asiento del pasajero
     */
    public String getAsiento() {
        return asiento;
    }

    //Obtiene el tiempo de espera en la atención de entrada por pasajero
    public int getTimeEsperaEntrada() {
        return timeEsperaEntrada;
    }
    
    //Devuelve el tiempo de espera en la atención de entrada al avión.
    public void setTimeEsperaEntrada(int timeEsperaEntrada) {
        this.timeEsperaEntrada = timeEsperaEntrada;
    }
    
    

    Random num = new Random();

    int contador = num.nextInt(100);

    /*
     *Recibe como parametro un número random del 0, 99, el plan de lealtad de un pasajero y ref que contiene una posición especifica del asiento.
     *setea y devuelve el código de asiento del pasajero
    */
    public String setAsiento(int contador, String PlanLealtad, int ref) {

        char pos = 'X';
        
        //Define la posición del asiento V, C o P(ventana, centro, pasillo).
        if (ref == 0) {
            pos = 'V';
        }

        if (ref == 1) {
            pos = 'C';
        }

        if (ref == 2) {
            pos = 'P';
        }

        String ident = "Unknown";
        
        //Define un código pequeño por plan de lealtad
        if (PlanLealtad.equalsIgnoreCase("Ingreso Especial")) {
            ident = "IE";
        }
        if (PlanLealtad.equalsIgnoreCase("Oro")) {
            ident = "OR";
        }
        if (PlanLealtad.equalsIgnoreCase("Platino")) {
            ident = "PL";
        }
        if (PlanLealtad.equalsIgnoreCase("Económico")) {
            ident = "EC";
        }
        //Setea el número de asiento formado por el código de plande lealtad, posición del asiento y número de asiento.
        this.asiento = ident + pos +  contador;
        
        //Devuelve el código de asiento
        return this.asiento;
    }

}
