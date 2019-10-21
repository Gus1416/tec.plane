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

/**
 *
 * @author ronye
 */
public class Analyze {
    
    
    public static String AnalizarSentimiento(String text) throws IOException{
      
        LanguageServiceClient language = LanguageServiceClient.create();

           
        Document doc = Document.newBuilder().setContent(text).setType(Document.Type.PLAIN_TEXT).build();
        // Detecta el sentimiento en el texto
        Sentiment sentiment = language.analyzeSentiment(doc).getDocumentSentiment();

        //Imprime la Observación realizada por el pasajero
        System.out.println( "Observación : " + text );
        
        //Imprime la puntuación y magnitud del sentimiento
        System.out.println( "Sentimento: puntuación = " +  sentiment.getScore() + "Sentimiento: magnitud = " + sentiment.getMagnitude());
        
        //En esta sección verifica el sentimiento encontrada calculado por el nivel de puntuación encontrado
        if(sentiment.getScore() <= -0.6){
            System.out.println("Claramente negativa");
        }
        if(sentiment.getScore() < 0.0 && sentiment.getScore() > -0.6){
            System.out.println("Negativa");

        }
        if(sentiment.getScore() == 0.0){
            System.out.println("Combinado");

        }
        if(sentiment.getScore() == 0.1){
            System.out.println("Neutral");

        }
         if(sentiment.getScore() > 0.1 && sentiment.getScore() < 0.6){
            System.out.println("Positiva");

        }

         if(sentiment.getScore() >= 0.6){
            System.out.println("Claramente Positiva");

        }
        return null;
      }

}
