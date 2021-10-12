package pl.edu.ug.kmuszczynski;

import java.util.Scanner;

public class Iksy {
    public static void drukujIksy(int liczba) {
        for (int i=0; i<liczba; i++) {
            System.out.println("X".repeat(i+1));
        }
        for (int i=0; i<liczba; i++) {
            System.out.println("X".repeat(liczba-i));
        }
        for (int i=0; i<liczba; i++) {
            System.out.println(" ".repeat(i)+"X".repeat(liczba-i));
        }
        for (int i=0; i<liczba; i++) {
            System.out.println(" ".repeat(liczba-i-1)+"X".repeat(i+1));
        }
    }

    public static void main( final String[] args ) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter an int");

        int number = myObj.nextInt();  // Read user input
        System.out.println();  // Output user input
        drukujIksy(number);
    }
}
