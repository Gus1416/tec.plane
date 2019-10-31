/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tec.plane;

/**
 *
 * @author ronye
 */
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;



public class EnvioSMS {
    // Find your Account Sid and Token at twilio.com/console
    //Atributos
    /*
     *Estos atributos contienen los tokens de acceso a la cuenta twilio
    */
    public static final String ACCOUNT_SID = "AC7c3c20220b2e7672066995bb16c9d119";
    public static final String AUTH_TOKEN = "88f96b0663c2adb484e85364c520d3cc";

    //Métodos
    /*
     *Este método recibe como parámetros dos Strings, uno contiene el número de teléfono al cuál vamos a enviar un
     *mensaje de texto, el otro contiene el cuerpo del mensaje de texto(código de asiento de la persona).
    */
    public void EnvioDeMensaje(String numero, String mensaje) {
        
        //Inicia una conexión con el API.
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        
        //Crea y envia un mensaje de texto
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber(numero),
                new com.twilio.type.PhoneNumber("+12564879292"),
                mensaje)
            .create();

        System.out.println(message.getSid());
    
    }
}