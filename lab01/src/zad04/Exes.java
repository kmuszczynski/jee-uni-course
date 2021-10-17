package zad04;

public class Exes {
    public static void printExes(int number) {
        for (int i=0; i<number; i++) {
            System.out.println("X".repeat(i+1));
        }
        for (int i=0; i<number; i++) {
            System.out.println("X".repeat(number-i));
        }
        for (int i=0; i<number; i++) {
            System.out.println(" ".repeat(i)+"X".repeat(number-i));
        }
        for (int i=0; i<number; i++) {
            System.out.println(" ".repeat(number-i-1)+"X".repeat(i+1));
        }
    }

    public static void main(String[] args) {
        System.out.println("Testing for n=3");
        printExes(3);

        System.out.println("Testing for n=5");
        printExes(5);
    }
}
