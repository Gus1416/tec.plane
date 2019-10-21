/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tec.plane;

import java.io.IOException;
import java.util.Random;

public class Salida {
    
Random radin = new Random();

int atencion = radin.nextInt(151);

String Comentario = "Pésimo servicio";

public void salida_pasajeros(CheckIn cola, int atencion, String Comentario) throws IOException{
    
    String coment = Comentario;
            
    String comentario = cola.front.getData().setComentario(coment);
    
    Analyze analizarOpinion = new Analyze();

    cola.consultarcola();
    
    System.out.println("Atendiendo a: " + cola.front.getData().getNombre());
    
    System.out.println("Con el plan de lealtad: " + cola.front.getData().getPlanLealtad());
    
    System.out.println("Con un tiempo de atención de: " + atencion);
    
    analizarOpinion.AnalizarSentimiento(comentario);
    
    cola.removeFirstNode();
    
    cola.consultarcola();
    
    
}
    
}
