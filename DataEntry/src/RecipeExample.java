import java.util.Scanner;

public class RecipeExample {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        // get recipe data
        System.out.println("\n---------- RECIPE DATA FORM ----------");

        // Name
        System.out.print("Enter the recipe name: ");
        var name = input.nextLine();

        // Ingredients
        System.out.print("Enter the recipe ingredients: ");
        var ingredients = input.nextLine();

        // Preparation time
        System.out.print("Enter the recipe preparation time (min): ");
        var time = input.nextLine();
        var convertedTime = Integer.parseInt(time);

        // Difficulty
        System.out.print("Enter the recipe difficulty (Easy, Medium, Hard): ");
        var difficulty = input.nextLine();

        // Show recipe data
        System.out.println("\n---------- RECIPE FINAL DATA ----------");
        System.out.println("Name: " + name);
        System.out.println("Ingredients: " + ingredients);
        System.out.println("Preparation time: " + convertedTime);
        System.out.println("Difficulty: " + difficulty);
    }
}
