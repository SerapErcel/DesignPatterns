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
public class ArrayListIterator implements Iterator {

    private Oyuncu[] tak?m;
    private int pozisyon;

    ArrayListIterator() {
        setTakim(tak?m);
    }

    public int getPozisyon() {
        return pozisyon;
    }

    public void setPozisyon(final int pozisyon) {
        this.pozisyon = pozisyon;
    }

    public ArrayListIterator(final Oyuncu[] tak?m) {
        setTakim(tak?m);
    }

    public boolean hasNext() {
        if (pozisyon >= getTakim().length || getTakim()[pozisyon]
                == null) {
            return false;
        } else {
            return true;
        }
    }

    public Object next() {
        final Oyuncu oyuncu = getTakim()[pozisyon];
        pozisyon++;
        return oyuncu;
    }

    public Oyuncu[] getTakim() {
        return tak?m;
    }

    public void setTakim(final Oyuncu[] tak?m) {
        this.tak?m = tak?m;
    }
}