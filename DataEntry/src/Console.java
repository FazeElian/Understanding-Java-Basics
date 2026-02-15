import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        var input = new Scanner(System.in); // read data using input variable as a Scanner library object
        System.out.print("Enter your name: "); // indication for the user of the info we are asking for

        var name = input.nextLine(); // read value entered by the user
        System.out.println("Hello " + name + "!"); // say hi to the username
    }
}
