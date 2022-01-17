/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatterns.BehavioralDesignPatterns.Iterator.EmployeeExample;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SERAP
 */
public class EmployeeListAggregate implements IEmployeeAggregate{
    private List<Employee> _employees;
    
    public EmployeeListAggregate() {
        _employees = new ArrayList();
    }
    
    public void add(Employee employee) {
        _employees.add(employee);
    }
    
    public int count() {
        return  _employees.size();
    }
    
    public Employee get(int index) {
        return _employees.get(index);
    }
    @Override
    public IIterator<Employee> createItereator() {
       return new EmployeeIterator(this);
    }
    
}
