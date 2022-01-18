/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatterns;

import DesignPatterns.StructuralDesignPattern.Decorator.*;
import DesignPatterns.StructuralDesignPattern.Facade.*;
import DesignPatterns.StructuralDesignPattern.Proxy.*;

/*
import DesignPatterns.BehavioralDesignPatterns.Interpreter.*;
import DesignPatterns.BehavioralDesignPatterns.Iterator.EmployeeExample.*;
import DesignPatterns.BehavioralDesignPatterns.Iterator.FootballExample.*;
import DesignPatterns.CreationalDesignPatterns.Factory.*;
import DesignPatterns.CreationalDesignPatterns.Singleton.*;
 */
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
 /* ------------Iterator/Employee------------
        EmployeeListAggregate employeeListAggregate = new EmployeeListAggregate();
        Employee serap = new Employee(1, "Serap", "Erçel");
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

         */
 /* ------------Iterator/Football------------
        final EfesPilsen efesPilsen = new EfesPilsen();
        Iterator it = efesPilsen.getIterator();
        while (it.hasNext()) {
            final Oyuncu oyuncu = (Oyuncu) it.next();
            System.out.println(oyuncu.getIsim());
        }
        final FenerBahce fenerBahce = new FenerBahce();
        it = fenerBahce.getIterator();
        while (it.hasNext()) {
            final Oyuncu oyuncu = (Oyuncu) it.next();
            System.out.println(oyuncu.getIsim());
        }  
         */
 /* ------------Adapter------------
  final Musteri musteri = new Musteri("102","aç?klama","Atatürk Mah. Gazi Sok. No:123", "Sancaktepe","?stanbul","Türkiye");
  final MusteriFaturaAdresiAdaptoru adaptor =new MusteriFaturaAdresiAdaptoru(musteri);
  final IAdres adres = adaptor;
  System.out.println("Adres:" + adres.alAcikAdres());
    System.out.println("Semt:" + adres.alSemt());
  System.out.println("?ehir:" + adres.alSehir());
  System.out.println("Ülke:" + adres.alUlke());
         */
 /* ------------Adapter------------
        IMessageSender textMessageSender = new TextMessageSender();
        Message textMessage = new TextMessage(textMessageSender);
        textMessage.send();

        IMessageSender emailMessageSender = new EmailMessageSender();
        Message emailMessage = new TextMessage(emailMessageSender);
        emailMessage.send();
         */
 /* ------------Facade------------
         Customer serap =new Customer("Serap","Erçel");
         CreditCardFacade creditCardFacade =new CreditCardFacade();
         creditCardFacade.createCreditCart(serap);
         */
 /* ------------Proxy------------
        Person Serap = new Person("11111111111", "Elaz??/Keban xxx-yyy-zzz");
        AuthenticatableMaskOrderProxy orderableMask = new AuthenticatableMaskOrderProxy();
        orderableMask.createOrder(Serap);
         */
 /* ------------Decorator------------

        final EvEsyalari ayna = new CerceveliAyna();
        ayna.produce();
         */
    }
}
