package com.gits.service;

import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@MessageDriven(name = "MessageService")
public class MessageService implements MessageListener {

    public void onMessage(Message message) {
        try {
            TextMessage msg = (TextMessage) message;
            System.out.println("MDB: " + msg.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }

}