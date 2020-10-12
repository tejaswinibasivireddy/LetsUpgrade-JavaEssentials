package com.Day3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        String name;
        int dob,mob,yob,monsal,annusal;
        float tax;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Name of Employee: ");
        name=sc.next();
        System.out.print("Enter Date of Birth: ");
        dob=sc.nextInt();
        System.out.print("Enter Month of Birth: ");
        mob=sc.nextInt();
        System.out.print("Enter Year of Birth: ");
        yob=sc.nextInt();
        System.out.print("Enter Monthly salary: ");
        monsal=sc.nextInt();
        annusal=monsal*12;
        System.out.println("Annual Salary: "+annusal);
        if(annusal==500000){
            tax=annusal*0.20f;
            System.out.println("You have to pay tax amount of "+tax+" Rs.");
        }
        else if(annusal<500000 && annusal>=400000){
            tax=annusal*0.15f;
            System.out.println("You have to pay tax amount of "+tax+" Rs.");
        }
        else if(annusal<400000 && annusal>=300000){
            tax=annusal*0.10f;
            System.out.println("You have to pay tax amount of "+tax+" Rs.");
        }
        else if(annusal<300000 && annusal>=200000){
            tax=annusal*0.05f;
            System.out.println("You have to pay tax amount of "+tax+" Rs.");
        }
        else{
            System.out.println("You dont have to pay.");
        }
    }
}