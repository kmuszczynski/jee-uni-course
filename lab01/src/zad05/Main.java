package zad05;

public class Main {
    public static void main( final String[] args ) {
        Author authorTest = new Author("John", "Doe", Gender.MALE);
        System.out.println(authorTest);
        System.out.println();
        Book bookTest = new Book("The Year of Iron Sun", 29.99, authorTest);
        System.out.println(bookTest);
    }
}
