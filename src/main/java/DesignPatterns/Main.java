/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatterns;

import DesignPatterns.BehavioralDesignPatterns.Interpreter.*;
import DesignPatterns.CreationalDesignPatterns.Factory.*;
import DesignPatterns.CreationalDesignPatterns.Singleton.*;

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
        
        /* ------Factory------
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
        */
        
        Context context = new Context();
        context.formula ="GGML";
        
        JobManager jobManager = new JobManager();
        jobManager.runExpression(context);
        
        System.out.println(context.formula + " :> " + context.totalPoint);
 
 
    }

}
