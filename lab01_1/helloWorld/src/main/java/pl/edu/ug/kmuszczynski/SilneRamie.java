package pl.edu.ug.kmuszczynski;

import java.util.ArrayList;
import java.util.Scanner;

public class SilneRamie {
    public static boolean isStrong(int number) {
        int sum = 0;
        int memory = number;
        ArrayList<Integer> listOfDigits = new ArrayList<Integer>();
        do{
            listOfDigits.add(number % 10);
            number /= 10;
        } while (number > 0);
        int exponent = listOfDigits.size();
        for (int digit : listOfDigits) {
            sum += (int)Math.pow(digit, exponent);
        }
        return sum == memory;
    }
    
    public static void main( final String[] args ) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter an int");

        int number = myObj.nextInt();  // Read user input
        System.out.println(number + ".isStrong = " + isStrong(number));  // Output user input
    }
}
