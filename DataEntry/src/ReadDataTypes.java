import java.util.Scanner;

public class ReadDataTypes {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        // Integer type
        System.out.print("Enter your age: "); // example: 21
        var age = input.nextInt(); // read int value
        System.out.println("You are " + age + " years old.");

        // Double type
        System.out.print("\nEnter your height (meters): "); // example: 1,78
        var height = input.nextDouble(); // read double value
        System.out.println("String converted to double: " + height + " m.");

        // Consume line jump character (this should be after a nextInt, nextDouble, or another data reading for specific data types
        input.nextLine();

        // String type
        System.out.print("\nEnter your name: "); // example: Charles
        var name = input.nextLine();
        System.out.println("Hello " + name + "!");
    }
}
