package pl.edu.ug.kmuszczynski;

import java.util.Scanner;

public class WiekWLatach {
    public static void przeliczWiek(int wiekWSekundach) {
        double ziemskieLata = wiekWSekundach / 31557600.0;
        System.out.println("Ziemia: " + ziemskieLata);
        System.out.println("Merkury: " + ziemskieLata / 0.24);
        System.out.println("Wenus: " + ziemskieLata / 0.61);
        System.out.println("Mars: " + ziemskieLata / 1.9);
        System.out.println("Jowisz: " + ziemskieLata / 12);
        System.out.println("Saturn: " + ziemskieLata / 29);
        System.out.println("Uran: " + ziemskieLata / 84);
        System.out.println("Neptun: " + ziemskieLata / 164);
    }

    public static void main( final String[] args ) {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("Please enter a positive number!");
            while (!sc.hasNextInt()) {
                System.out.println("That's not a number!");
                sc.next(); // this is important!
            }
            number = sc.nextInt();
        } while (number <= 0);
        System.out.println();  // Output user input
        przeliczWiek(number);
    }
}
