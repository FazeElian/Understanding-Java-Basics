public class Variables {
    public static void main(String[] args) {
        // Primitive variable types
        int age = 17;
        double price = 400.54;
        boolean isAvailable = true;

        // Reference variable types
        char gender;
        gender = 'M';
        String hello = "Hello World";

        // Access to the variables - show it to the console
        System.out.println(age); // Print age variable value

        // Change value of the age variable
        age = 20;
        System.out.println(age); // Print age again

        // Print the value of all the variables
        System.out.println(price);
        System.out.println(isAvailable);
        System.out.println(gender);
        System.out.println(hello);
    }
}