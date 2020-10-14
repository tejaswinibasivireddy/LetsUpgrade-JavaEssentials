package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Avenger[] a = new Avenger[5];

        for(int i = 0; i < 5; i++) {
            a[i] = new Avenger();
            a[i].getDetails();
        }

        for(int i = 0; i < 5; i++) {
            System.out.println("Details of Avenger #" + (i+1));
            a[i].displayDetails();
            System.out.println();
        }

    }
}
