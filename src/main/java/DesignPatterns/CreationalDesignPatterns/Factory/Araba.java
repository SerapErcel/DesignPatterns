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
public abstract class Araba {
    private String marka = null;
    private String model = null;
    private int beygirGucu = 0;
    
    public Araba(final String marka, final String model, final int beygirGucu){
        setMarka(marka);
        setModel(model);
        setBeygirGucu(beygirGucu);
    }

    public void setMarka(final String marka) {
        this.marka = marka;
    }
    public String getMarka(){
        return marka;
    }

    public void setModel(final String model) {
        this.model = model;
    }
    public String getModel(){
        return model;
    }

    public void setBeygirGucu(final int beygirGucu) {
        this.beygirGucu = beygirGucu;
    }
    public int getBeygirGucu(){
        return beygirGucu;
    }
    
}
