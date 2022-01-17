/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatterns.BehavioralDesignPatterns.Iterator.FootballExample;

import java.util.ArrayList;

/**
 *
 * @author SERAP
 */
/* Efes Pilsen Basketbol Tak?m? */
public class EfesPilsen implements Takim {

    private ArrayList<Oyuncu> tak?m;

    public EfesPilsen() {
        tak?m = new ArrayList();
        tak?m.add(new Oyuncu("Drew", 4));
        tak?m.add(new Oyuncu("Ender", 6));
        tak?m.add(new Oyuncu("Cenk", 7));
        tak?m.add(new Oyuncu("Kerem", 12));
        tak?m.add(new Oyuncu("Loren", 15));
    }

    public ArrayList<Oyuncu> getTakim() {
        return tak?m;
    }

    public void setTakim(final ArrayList<Oyuncu> tak?m) {
        this.tak?m = tak?m;
    }
/*
    @Override
    public Iterator getIterator() {
        return new ArrayListIterator(getTakim());
    }*/

    @Override
    public Iterator getIterator() {
        return new ArrayListIterator();
    }
}
