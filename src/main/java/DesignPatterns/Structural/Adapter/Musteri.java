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
public class Musteri {

    private final String numara;
    private final String aciklama;
    private final String acikAdres;
    private final String semt;
    private final String sehir;
    private final String ulke;

    public Musteri(final String numara, final String aciklama, final String acikAdres, final String semt, final String sehir, final String ulke) {
        this.numara = numara;
        this.aciklama = aciklama;
        this.acikAdres = acikAdres;
        this.semt = semt;
        this.sehir = sehir;
        this.ulke = ulke;
    }

    public String alNumara() {
        return numara;
    }

    public String alAciklama() {
        return aciklama;
    }

    public String alAcikAdres() {
        return acikAdres;
    }

    public String alSemt() {
        return semt;
    }

    public String alSehir() {
        return sehir;
    }

    public String alUlke() {
        return ulke;
    }

}
