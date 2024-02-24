package com.skprograming.ex;

import java.util.Scanner;

class atm{
    float balance;
    int pin= 5674;
    public void checkpin (){
        System.out.println("enter the pin");
        Scanner Sc = new Scanner(System.in);
        int enterpin   =Sc.nextInt();
        if (enterpin==pin){
            menu();
        }
        else {
            System.out.println("enter the valid pin");
        }
    }
    public void menu(){
        System.out.println("enter your choice");
        System.out.println("1.check account balance");
        System.out.println("2.money withdraw");
        System.out.println("3.deposite money");
        System.out.println("4.exit");

        Scanner Sc = new Scanner(System.in);
        int opt = Sc.nextInt();

        if (opt == 1){
            checkBalance();
        } else if (opt==2) {
            withdrow();

        } else if (opt==3) {
            deposit();

        }
        else if (opt==4){
           return;
        }
       else {
            System.out.println("enter the vlid choice");
        }
    }
    public void checkBalance(){
        System.out.println( "Balance: " + balance);
        menu();
    }
    public void withdrow(){
        System.out.println("enter amount withdraw");
        Scanner Sc = new Scanner(System.in);
        float ammount = Sc.nextFloat();
        if (ammount>balance){
            System.out.println("insufficient balance");
        }
        else {
            System.out.println("money withdraw successful");
        }
        menu();


    }
    public void deposit(){
        System.out.println("enter the ammount");
        Scanner Sc = new Scanner(System.in);
        float ammount = Sc.nextFloat();
        balance = balance+ balance;
        System.out.println(" money deposit succesfully");
        menu();

            }
}


public class sk2 {
    public static void main(String[] args) {
        atm obj = new atm();
        obj.checkpin();

    }
}
