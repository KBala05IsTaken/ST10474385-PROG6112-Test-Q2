/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.balafamily.st10474385.prog6112.test.q2;

/**
 *
 * @author KhanyisaB
 */
public abstract class clsConsole 
{
    String ConsoleType;
    String Store;
    int TotalSales;
    
    public clsConsole(String ConsoleType, String Store, int TotalSales)
    {
        this.ConsoleType = ConsoleType;
        this.Store = Store;
        this.TotalSales = TotalSales; 
    }
    
    public String getConsoleType()
    {
        return ConsoleType;
    }
    
    public String getStore()
    {
        return Store;
    }
    
    public int getTotalSales()
    {
        return TotalSales;
    }
}
