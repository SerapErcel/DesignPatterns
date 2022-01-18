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
public abstract class AynaDecorator implements EvEsyalari {

    private EvEsyalari ayna = new Ayna();

    public EvEsyalari getAyna() {
        return ayna;
    }

    public void setAyna(final EvEsyalari ayna) {
        this.ayna = ayna;
    }
}
