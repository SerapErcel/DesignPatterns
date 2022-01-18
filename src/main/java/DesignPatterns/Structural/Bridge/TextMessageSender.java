/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatterns.Structural.Bridge;

/**
 *
 * @author SERAP
 */
public class TextMessageSender implements IMessageSender {

    @Override
    public void sendMessage(Message message) {
        System.out.println("TextMessageSender: Sending Text Message..");
    }

}
