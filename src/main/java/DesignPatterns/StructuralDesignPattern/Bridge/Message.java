/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatterns.StructuralDesignPattern.Bridge;

/**
 *
 * @author SERAP
 */
public abstract class Message {
    final IMessageSender messageSender;
    public Message(IMessageSender messageSender){
        this.messageSender = messageSender;
    }
    public abstract void send();
    
}
