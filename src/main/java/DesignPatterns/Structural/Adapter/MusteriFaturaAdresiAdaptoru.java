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
public class MusteriFaturaAdresiAdaptoru implements IAdres {

    private final Musteri musteri;

    public MusteriFaturaAdresiAdaptoru(final Musteri musteri) {
        this.musteri = musteri;
    }

    @Override
    public String alAcikAdres() {
        return musteri.alAcikAdres();
    }

    @Override
    public String alSemt() {
        return musteri.alSemt();
    }

    @Override
    public String alSehir() {
        return musteri.alSehir();
    }

    @Override
    public String alUlke() {
        return musteri.alUlke();
    }

}
