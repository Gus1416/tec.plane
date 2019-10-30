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
    // DANGER! This is insecure. See http://twil.io/secure
    public static final String ACCOUNT_SID = "AC0cf576f0803030975ac2d606ab505743";
    public static final String AUTH_TOKEN = "e6388633b9327b4519ab2ea48caf89a6";

    public void EnvioDeMensaje(String numero, String mensaje) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber(numero),
                new com.twilio.type.PhoneNumber("+13082171744"),
                mensaje)
            .create();

        System.out.println(message.getSid());
    
    }
}