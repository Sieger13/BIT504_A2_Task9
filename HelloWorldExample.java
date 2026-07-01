package samplePackage;

import java.util.Scanner;

public class HelloWorldExample {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Your Name: ");
        name = sc.nextLine();
        
        System.out.println("Hello! " + name);
        
        sc.close();
    }
}

//first change