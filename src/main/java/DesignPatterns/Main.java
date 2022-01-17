/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatterns;

import DesignPatterns.CreationalDesignPatterns.Factory.*;
import DesignPatterns.CreationalDesignPatterns.Singleton.Database;

/**
 *
 * @author SERAP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* ------Singleton------
        Database firstInstanceRequest = Database.getInstance();
        Database secondInstanceRequest = Database.getInstance();
         */
        
        ArabaFabrika bmw = new BmwFabrika();
        ArabaFabrika audi = new AudiFabrika();
        
        for (final Araba araba:  bmw.getArabaListesi()) {
            System.out.println(araba.getMarka() + " " + araba.getModel() + " , " 
            + araba.getBeygirGucu());
        }
        for (final Araba araba:  audi.getArabaListesi()) {
            System.out.println(araba.getMarka() + " " + araba.getModel() + " , " 
            + araba.getBeygirGucu());
        }
        
    }

}
