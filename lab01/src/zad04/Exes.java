package zad04;

public class Exes {
    public static String createPattern(int number) {
        StringBuilder pattern = new StringBuilder();
        for (int i=0; i<number; i++) {
            pattern.append("X".repeat(i+1));
            pattern.append("\n");
        }
        for (int i=0; i<number; i++) {
            pattern.append("X".repeat(number-i));
            pattern.append("\n");
        }
        for (int i=0; i<number; i++) {
            pattern.append(" ".repeat(i)+"X".repeat(number-i));
            pattern.append("\n");
        }
        for (int i=0; i<number; i++) {
            pattern.append(" ".repeat(number-i-1)+"X".repeat(i+1));
            pattern.append("\n");
        }
        return String.valueOf(pattern);
    }

    public static void main(String[] args) {
        System.out.println("Testing for n=3");
        System.out.println(createPattern(3));

        System.out.println("Testing for n=5");
        System.out.println(createPattern(5));
    }
}
