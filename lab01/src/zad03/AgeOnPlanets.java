package zad03;

public class AgeOnPlanets {
    public static double ageOnPlanet(Planet planet, int number) {
        double secondsInYearOnEarth = 31557600;
        return number/secondsInYearOnEarth/ planet.getOrbitRatio();
    }

    public static void main(String[] args) {
        int numberOne = 1000000000;
        int numberTwo = 100000000;
        System.out.printf("Testing for %d and %d seconds\n", numberOne, numberTwo);


        System.out.printf("%d seconds:\n", numberOne);
        for (Planet p : Planet.values()) {
            System.out.printf("Your age on %s is %.2f Earth years\n", p, ageOnPlanet(p, numberOne));
        }

        System.out.printf("%d seconds:\n", numberTwo);
        for (Planet p : Planet.values()) {
            System.out.printf("Your age on %s is %.2f Earth years\n", p, ageOnPlanet(p, numberTwo));
        }
    }
}
