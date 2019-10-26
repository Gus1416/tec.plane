package com.mycompany.tec.plane;

import java.util.Random;

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

    public String getComentario() {
        return comentario;
    }

    public String setComentario(String comentario) {
        this.comentario = comentario;
        return comentario;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the FechaNacimiento
     */
    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    /**
     * @param FechaNacimiento the FechaNacimiento to set
     */
    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    /**
     * @return the pasaporte
     */
    public int getPasaporte() {
        return pasaporte;
    }

    /**
     * @param pasaporte the pasaporte to set
     */
    public void setPasaporte(int pasaporte) {
        this.pasaporte = pasaporte;
    }

    /**
     * @return the Nacionalidad
     */
    public String getNacionalidad() {
        return Nacionalidad;
    }

    /**
     * @param Nacionalidad the Nacionalidad to set
     */
    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    /**
     * @return the origin
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * @param origin the origin to set
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * @return the destiny
     */
    public String getDestiny() {
        return destiny;
    }

    /**
     * @param destiny the destiny to set
     */
    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    /**
     * @return the planLealtad
     */
    public String getPlanLealtad() {
        return planLealtad;
    }

    /**
     * @param planLealtad the planLealtad to set
     */
    public void setPlanLealtad(String planLealtad) {
        this.planLealtad = planLealtad;
    }

    /**
     * @return the asiento
     */
    public String getAsiento() {
        return asiento;
    }

    /**
     * @param asiento the asiento to set
     */
    Random num = new Random();

    int contador = num.nextInt(100);

    // contador  ,user.getplanlealtad, ref  
    public String setAsiento(int contador, String PlanLealtad, int ref) {

        char pos = 'X';

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

        this.asiento = ident + pos +  contador;
        return this.asiento;
    }

}
