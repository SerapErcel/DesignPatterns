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
    Ev e?yalar? üzerine uzmanla?m?? bir firma, bir fabrikadan hammadde halinde
ayna sat?n al?p, bunlar? çe?itli ürünler haline getirdikten sonra pazarlamaktad?r.
Mevcut Ayna s?n?f?n? kullanarak bir üretim modeli olu?turulacakt?r.
Ayna s?n?f? üzerinde bir de?i?iklik yap?lmas? istenmemektedir. Daha ziyade,
de?i?ik aynal? ürünleri modellemek için yeni s?n?flar?n olu?turulmas? istenmektedir.
Pazarlama firmas? ilk etapta de?i?ik çerçevelere sahip aynalar? piyasaya
sürmeyi planlad???ndan, program bu ihtiyaca cevap vermelidir.
Pazarlama firmas?n?n ihtiyaçlar?n? analiz ettikten sonra, dekoratör tasar?m
?ablonu ile istenilen modelin olu?turulabilece?i kanaat?na var?l?yor.
Bir ayna nesnesini kullanarak, çerçeveli bir ayna nesnesi olu?turulabilir.
     */
    public void produce();
}
