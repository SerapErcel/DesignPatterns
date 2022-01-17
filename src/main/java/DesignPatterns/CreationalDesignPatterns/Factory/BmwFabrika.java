/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatterns.CreationalDesignPatterns.Factory;

/**
 *
 * @author SERAP
 */
public class BmwFabrika extends ArabaFabrika{

    /*
    ArabaFabrika s?n?f?nda yer alan createAuto() metodu BmwFabrika
    alts?n?f?nda implemente edilir. Bu metot Bmw markas?na ait Z4
    model arabay? üretmek için kullan?l?r.
    */
    @Override
    public void createAuto() {
        getArabaListesi().add(new Z4(140));
    }
    
}
