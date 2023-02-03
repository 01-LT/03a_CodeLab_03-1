package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        MA_Accounting acc1=new MA_Accounting("Wilkonson", "Jack", 1984);
        MA_Accounting acc2=new MA_Accounting("Hepburn", "Audrey", 1948);
        
        pollAccounting(acc1);
        pollAccounting(acc2);

    }

    private static void pollAccounting(MA_Accounting ma) {
        output(ma.doYourWork("#firstName"));
    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}


