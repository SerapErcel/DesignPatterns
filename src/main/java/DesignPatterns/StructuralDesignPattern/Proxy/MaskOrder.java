/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatterns.StructuralDesignPattern.Proxy;

/**
 *
 * @author SERAP
 */
public class MaskOrder implements IOrderableMask {

    @Override
    public void createOrder(Person person) {
        System.out.println("Order created to " + person.address);
    }

}
