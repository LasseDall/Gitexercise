package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("It works!");
        System.out.println("Indtast navn:");
        String navn = sc.nextLine();
        System.out.println("Hej " + navn);
    }
}
