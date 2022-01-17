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
public class AudiFabrika extends ArabaFabrika {

    /*
    ArabaFabrika s?n?f?nda yer alan createAuto() metodu Audi
    alts?n?f?nda implemente edilir. Bu metot Audi markas?na ait A4 ve R8
    model arabalar? üretmek için kullan?l?r.
     */
    @Override
    public void createAuto() {
        getArabaListesi().add(new A4(120));
        getArabaListesi().add(new R8(350));
    }

}
