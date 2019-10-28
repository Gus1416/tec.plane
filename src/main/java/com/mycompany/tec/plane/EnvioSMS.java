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
    public static final String ACCOUNT_SID = "ACaed7fc7e3e8a915c1d230dfd1ed5f671";
    public static final String AUTH_TOKEN = "937754e66dc95a3e0113e70dc1664049";

    public void EnvioDeMensaje(String numero, String mensaje) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber(numero),
                new com.twilio.type.PhoneNumber("+12016437228"),
                mensaje)
            .create();

        System.out.println(message.getSid());
    
    }
}