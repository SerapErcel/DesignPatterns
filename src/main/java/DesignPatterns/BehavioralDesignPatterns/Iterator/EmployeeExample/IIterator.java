/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatterns.BehavioralDesignPatterns.Iterator.EmployeeExample;

/**
 *
 * @author SERAP
 */
interface IIterator<T> {
    Boolean hasNext();
    T getCurrentItem();
}
