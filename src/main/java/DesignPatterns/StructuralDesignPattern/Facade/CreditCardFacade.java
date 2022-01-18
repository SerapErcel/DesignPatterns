/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatterns.StructuralDesignPattern.Facade;

/**
 *
 * @author SERAP
 */
public class CreditCardFacade {

    public void createCreditCart(Customer customer) {
        CreditCardManager creditCardManager = new CreditCardManager();
        BlackListService blackListService = new BlackListService();

        if (blackListService.checkEmployeeIsTheBlackList(customer)) {
            creditCardManager.createCreditCart(customer);
        }
    }
}
