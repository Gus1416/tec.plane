/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tec.plane;

import com.google.cloud.language.v1.Document;
import com.google.cloud.language.v1.LanguageServiceClient;
import com.google.cloud.language.v1.Sentiment;
import java.io.IOException;
////
/**
 *
 * @author ronye
 */
public class Analyze {
    
    //Métodos
    /*
     *Este método recibe como parámetro un texto, analiza el porcentaje y magnitud del sentimiento encontrado y lo clasifica 
     *entre claramente positivo, positivo, combinado, neutral, negativo y claramente negativo, esto para tener una mejor 
     *interpretación del porcetaje encontrado.
    */
    public static String AnalizarSentimiento(String text) throws IOException{
      
        String sentimiento = null;
        
        LanguageServiceClient language = LanguageServiceClient.create();

           
        Document doc = Document.newBuilder().setContent(text).setType(Document.Type.PLAIN_TEXT).build();
        // Detecta el sentimiento en el texto
        Sentiment sentiment = language.analyzeSentiment(doc).getDocumentSentiment();

        //Imprime la Observación realizada por el pasajero
        sentimiento = "Observación : " + text + "\n";
        
        //Imprime la puntuación y magnitud del sentimiento
        sentimiento += "Sentimento: puntuación = " +  sentiment.getScore() + "magnitud = " + sentiment.getMagnitude() +"\n";
        
        //En esta sección verifica el sentimiento encontrada calculado por el nivel de puntuación encontrado
        if(sentiment.getScore() <= -0.6){
            sentimiento += "Claramente negativa";
        }
        if(sentiment.getScore() < 0.0 && sentiment.getScore() > -0.6){
            sentimiento += "Negativa";

        }
        if(sentiment.getScore() == 0.0){
            sentimiento += "Combinado";

        }
        if(sentiment.getScore() == 0.1){
            sentimiento += "Neutral";

        }
         if(sentiment.getScore() > 0.1 && sentiment.getScore() < 0.6){
            sentimiento += "Positiva";

        }

         if(sentiment.getScore() >= 0.6){
            sentimiento += "Claramente Positiva";

        }
        //Devuelve un String con el texto a analizar, el porcentaje y magnitd del texto, y el sentimiento encontrado.
        
        return sentimiento;
      }

}
