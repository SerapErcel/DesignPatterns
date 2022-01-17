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
public class EmployeeIterator implements IIterator<Employee>{
    private EmployeeListAggregate _employeeListAggregate;
    private int _currentIndex;
    
    public EmployeeIterator(EmployeeListAggregate employeeListAggregate) {
        _employeeListAggregate = employeeListAggregate;
        _currentIndex = 0;
    }
    @Override
    public Boolean hasNext() {
        if(_employeeListAggregate.count() > _currentIndex) {
            return true;
        }
        return false;
    }

    @Override
    public Employee getCurrentItem() {
        return _employeeListAggregate.get(_currentIndex++);
    }
    
}
