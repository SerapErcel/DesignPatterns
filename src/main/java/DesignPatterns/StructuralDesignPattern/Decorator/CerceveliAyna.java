/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatterns.StructuralDesignPattern.Decorator;

/**
 *
 * @author SERAP
 */
public class CerceveliAyna extends AynaDecorator {

    @Override
    public void produce() {
        getAyna().produce();
        addBorder();
    }

    public void addBorder() {
        System.out.println("Aynaya Çerçeve eklendi.");
    }

}
