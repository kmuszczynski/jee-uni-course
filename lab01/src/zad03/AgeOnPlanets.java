package zad03;

public class AgeOnPlanets {
    public static void main(String[] args) {
        System.out.println("Testing for 1 000 000 and 10 000 000 seconds");
        int numberOne = 1000000000;
        int numberTwo = 100000000;
        double secondsInYearOnEarth = 31557600;

        System.out.println("1 000 000 000 seconds:");
        for (Planet p : Planet.values()) {
            System.out.printf("Your age on %s is %.2f Earth years%n", p, numberOne/secondsInYearOnEarth/p.getOrbitRatio());
        }

        System.out.println("100 000 000 seconds:");
        for (Planet p : Planet.values()) {
            System.out.printf("Your age on %s is %.2f Earth years%n", p, numberTwo/secondsInYearOnEarth/p.getOrbitRatio());
        }
    }
}
