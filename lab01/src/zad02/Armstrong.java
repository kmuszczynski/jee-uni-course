package zad02;

import java.util.ArrayList;

public class Armstrong {
    public static boolean isArmstrong(int number) {
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
        int[] knownArmstrongNumbers = new int[]{0, 1, 153, 370, 407};
        int[] nonArmstrongNumbers = new int[]{10, 100, 23, 372, 409};
        int len = knownArmstrongNumbers.length;

        for(int i=0; i<len; i++) {
            System.out.println("Testing for known Armstrong number: "+knownArmstrongNumbers[i]);
            System.out.println("isArmstrong? "+isArmstrong(knownArmstrongNumbers[i]));
            System.out.println("Testing for known non-Armstrong number: "+nonArmstrongNumbers[i]);
            System.out.println("isArmstrong? "+isArmstrong(nonArmstrongNumbers[i]));
        }
    }
}
