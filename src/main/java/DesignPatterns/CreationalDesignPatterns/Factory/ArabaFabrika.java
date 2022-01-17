/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatterns.CreationalDesignPatterns.Factory;

import java.util.ArrayList;

/**
 *
 * @author SERAP
 */
public abstract class ArabaFabrika {
    /*
    Bir araba fabrikas?n?n üretti?i de?i?ik modeldeki arabalar?n içinde
     yer ald??? liste.
    */
    private ArrayList<Araba> arabaListesi = new ArrayList<Araba>();
    /*
    Alt s?n?flarda bir fabrikan?n (nesnenin) olu?turulmas? ile beraber,
    createAuto() metodu i?leme girer, yani fabrika araba üretimine ba?lam?? olur
    */
    public ArabaFabrika() {
        createAuto();
    }
    
    /*
    Alt s?n?flar taraf?ndan implemente edilir. Belirli bir marka ve modelin
    olu?turulmas?nda kullan?l?r.
    */
    public abstract void createAuto();
    
    public ArrayList<Araba> getArabaListesi() {
        return arabaListesi;
    }
    
    public void setArabaListesi(final ArrayList<Araba> arabaListesi) {
        this.arabaListesi = arabaListesi;
    }
}
