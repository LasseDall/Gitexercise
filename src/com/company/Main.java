package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    Scanner sc = new Scanner(System.in);

    public int aAboutAge(){
        System.out.println("Hvad er din alder?");
        int alder = sc.nextInt();
        return alder;
    }

    public void superduper(){
        System.out.println("Super!");
    }

    public static void main(String[] args) {
	// write your code here
        Main obj = new Main();
        System.out.println("It works!");
        System.out.println("Indtast navn:");
        String navn = obj.sc.nextLine();
        System.out.println("Hej " + navn);
        int alder = obj.aAboutAge();
        System.out.println("Super");
        obj.superduper();
    }
}
