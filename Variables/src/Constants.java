public class Constants {
    public static void main(String[] args) {
        // We use the word 'final' to declare a variable as a constant
        final var WEEK_DAYS_AMOUNT = 7; // we use CAPITAL LETTERS to define them
        System.out.println("WEEK_DAYS_AMOUNT = " + WEEK_DAYS_AMOUNT);

        // Examples:
        final var PI = Math.PI; // We access to the pi value from the Math library
        System.out.println("PI = " + PI);

        final var WELCOME = "Welcome to: Understanding Java Basics";
        System.out.println("WELCOME = " + WELCOME);
        
        // WHAT WE CANNOT DO:
        // WEEK_DAYS_AMOUNT = 2; // we can't change the value of a constant variable
    }
}
