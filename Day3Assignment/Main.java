package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        float m1;
        float m2;
        float m3;
        float m4;
        float m5;
        float percentage;
        char grade;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m1 marks");
        m1 = sc.nextInt();

        System.out.println("Enter m2 marks");
        m2 = sc.nextInt();

        System.out.println("Enter m3 marks");
        m3 = sc.nextInt();

        System.out.println("Enter m4 marks");
        m4 = sc.nextInt();

        System.out.println("Enter m5 marks");
        m5 = sc.nextInt();

        sc.nextLine();

       percentage = ((m1 + m2 + m3 + m4 + m5) / 500)*100;

       if(percentage>=80&&percentage<=99){
           grade = 'A';
       }
       else if(percentage>=60&&percentage<=79){
            grade = 'B';
       }
       else if(percentage>=50&&percentage<=59){
            grade = 'C';
       }
       else{
            grade = 'D';
       }

        System.out.println(percentage);
        System.out.println(grade);
    }
}
