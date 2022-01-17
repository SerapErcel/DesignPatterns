/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatterns.BehavioralDesignPatterns.Interpreter;

/**
 *
 * @author SERAP
 */
public class TeamLeadExpression implements IJobExpression
{
    @Override
    public void interpret(Context context) {
        if (context.formula.contains("L")) {
            context.totalPoint += 7000;
        }
    }
    
}
