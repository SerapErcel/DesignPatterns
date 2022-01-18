/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatterns.StructuralDesignPattern.Facade;

/**
 *
 * @author SERAP
 */

/*
Senaryo olarak bir bankan?n m�?terilerine kredi kart? verdiklerini, bu kredi kart?
verme i?lemlerinden �nce ise kendi i? kurallar?n? uygulad???n? kabul edelim.
Kodun kalabal?k olmamas? i�in temel olarak m�?teriye kredi kart? vermeden
�nce kara listede olup olmad??? kontrol ediliyor olsun.
*/
public class Customer {

    public String firstName;
    public String lastName;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
