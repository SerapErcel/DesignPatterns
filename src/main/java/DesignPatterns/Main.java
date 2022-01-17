/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatterns;

import DesignPatterns.BehavioralDesignPatterns.Interpreter.*;
import DesignPatterns.BehavioralDesignPatterns.Iterator.*;
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

/* ------------Singleton------------
        Database firstInstanceRequest = Database.getInstance();
        Database secondInstanceRequest = Database.getInstance();
*/
 /* ------------Factory------------
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
 /* ------------Interpreter------------
        Context context = new Context();
        context.formula ="GGML";
        
        JobManager jobManager = new JobManager();
        jobManager.runExpression(context);
        
        System.out.println(context.formula + " :> " + context.totalPoint);
 */
 /* ------------Iterator------------
        EmployeeListAggregate employeeListAggregate = new EmployeeListAggregate();
        Employee serap = new Employee(1, "Serap", "Er�el");
        Employee merve = new Employee(2, "Merve", "Bilgin");
        Employee adem = new Employee(3, "Adem", "Atici");

        employeeListAggregate.add(serap);
        employeeListAggregate.add(merve);
        employeeListAggregate.add(adem);
        
        var iterator = employeeListAggregate.createItereator();
        
        while(iterator.hasNext()){
            Employee currentEmployee =iterator.getCurrentItem();
            String message = String.format("%s %s", currentEmployee.firstName, currentEmployee.lastName);
            System.out.println(message);
        }

    }
 */
 
    }
