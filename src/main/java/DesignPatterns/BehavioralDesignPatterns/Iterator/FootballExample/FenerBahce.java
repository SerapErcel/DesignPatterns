/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatterns.BehavioralDesignPatterns.Iterator.FootballExample;

/**
 *
 * @author SERAP
 */
/* Fenerbahce Ülker Basketbol Tak?m?*/
public class FenerBahce implements Takim {

    private Oyuncu[] tak?m = new Oyuncu[5];

    public FenerBahce() {
        tak?m[0] = new Oyuncu("Ismail", 4);
        tak?m[1] = new Oyuncu("Willie", 5);
        tak?m[2] = new Oyuncu("Semih", 9);
        tak?m[3] = new Oyuncu("Ibrahim", 10);
        tak?m[4] = new Oyuncu("Serhat", 33);
    }

    public Oyuncu[] getTakim() {
        return tak?m;
    }

    public void setTakim(final Oyuncu[] tak?m) {
        this.tak?m = tak?m;
    }

    @Override
    public Iterator getIterator() {
        return new ArrayIterator(getTakim());
    }
}
