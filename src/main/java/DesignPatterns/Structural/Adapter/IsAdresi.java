/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatterns.Structural.Adapter;

/**
 *
 * @author SERAP
 */
public class IsAdresi implements IAdres {

    @Override
    public String alAcikAdres() {
        return "Tasar?m Mah. Desenleri Sokak No:23";
    }

    @Override
    public String alSemt() {
        return "Be?ikta?";
    }

    @Override
    public String alSehir() {
        return "?stanbul";
    }

    @Override
    public String alUlke() {
        return "Türkiye";
    }

}
