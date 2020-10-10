package com.Day1;

public class Main {

    public static void main(String[] args) {
        employee e1 = new employee();
        employee e2 = new employee();
        e1.name = "Tom";
        e2.name = "Jerry";
        e1.age = 23;
        e2.age = 25;
        e1.city = "Austin";
        e2.city = "Dallas";

        e1.display();
        e2.display();
    }
}
