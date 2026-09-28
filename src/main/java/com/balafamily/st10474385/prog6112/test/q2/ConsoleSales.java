/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.balafamily.st10474385.prog6112.test.q2;

/**
 *
 * @author KhanyisaB
 */
public class ConsoleSales extends clsConsole
{
    public ConsoleSales(String ConsoleType, String Store, int TotalSales)
    {
        super(ConsoleType, Store, TotalSales);
    }
    
    public void PrintAccidentReport()
    {
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("************************************");        
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE: " + getStore());
        System.out.println("TOTAL SALES: " + getTotalSales());
    }
}
