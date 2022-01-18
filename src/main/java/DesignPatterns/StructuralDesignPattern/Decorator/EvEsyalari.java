/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatterns.StructuralDesignPattern.Decorator;

/**
 *
 * @author SERAP
 */
public interface EvEsyalari {

    /*
    Ev e?yalar? �zerine uzmanla?m?? bir firma, bir fabrikadan hammadde halinde
ayna sat?n al?p, bunlar? �e?itli �r�nler haline getirdikten sonra pazarlamaktad?r.
Mevcut Ayna s?n?f?n? kullanarak bir �retim modeli olu?turulacakt?r.
Ayna s?n?f? �zerinde bir de?i?iklik yap?lmas? istenmemektedir. Daha ziyade,
de?i?ik aynal? �r�nleri modellemek i�in yeni s?n?flar?n olu?turulmas? istenmektedir.
Pazarlama firmas? ilk etapta de?i?ik �er�evelere sahip aynalar? piyasaya
s�rmeyi planlad???ndan, program bu ihtiyaca cevap vermelidir.
Pazarlama firmas?n?n ihtiya�lar?n? analiz ettikten sonra, dekorat�r tasar?m
?ablonu ile istenilen modelin olu?turulabilece?i kanaat?na var?l?yor.
Bir ayna nesnesini kullanarak, �er�eveli bir ayna nesnesi olu?turulabilir.
     */
    public void produce();
}
