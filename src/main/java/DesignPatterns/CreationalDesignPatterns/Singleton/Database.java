/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatterns.CreationalDesignPatterns.Singleton;

/**
 *
 * @author SERAP
 */
public class Database {
    private static Database database;
    private Database(){
        System.out.println("Database olustu!");
    }
    public static Database getInstance(){
        if (database == null){
            database = new Database();
        }
        return database;
    }
}
