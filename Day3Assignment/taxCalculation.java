package com.company;
import java.util.Scanner;

public class taxCalculation {
    public static void main(String[] args){
        String name;
        int dateOfBirth;
        int monthOfBirth;
        int yearOfBirth;
        int age;
        int msalary;
        int annualsal;
        float tax;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee name");
        name = sc.next();

        System.out.println("Enter date of birth");
        dateOfBirth = sc.nextInt();

        System.out.println("Enter month of birth");
        monthOfBirth = sc.nextInt();

        System.out.println("Enter year of birth");
        yearOfBirth = sc.nextInt();

        age = 2020-yearOfBirth;

        System.out.println("Enter monthly salary");
        msalary = sc.nextInt();
        annualsal = msalary*12;

        sc.nextLine();

        if(annualsal>=500000){
            tax = 0.2f * annualsal;
        }
        else if(annualsal>=400000){
            tax = 0.15f*annualsal;
        }
        else if(annualsal>=300000){
            tax = 0.1f* annualsal;
        }
        else if(annualsal>=200000){
            tax = 0.05f * annualsal;
        }
        else{
            tax = 0f;
        }

        System.out.println(name);
        System.out.println(age);
        System.out.println(annualsal);
        System.out.println(tax);
    }

}
