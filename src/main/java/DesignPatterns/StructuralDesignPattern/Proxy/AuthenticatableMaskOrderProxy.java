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
public class AuthenticatableMaskOrderProxy implements IOrderableMask {

    private IOrderableMask _orderMask;

    public AuthenticatableMaskOrderProxy() {
        _orderMask = new MaskOrder();
    }

    @Override
    public void createOrder(Person person) {
        Boolean isValid = checkPersonIsValid(person);
        if (isValid) {
            _orderMask.createOrder(person);
        }
    }

    private Boolean checkPersonIsValid(Person person) {
        return person.tc.length() == 11 && person.address != "";
    }

}
