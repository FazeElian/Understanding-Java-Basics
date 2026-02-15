import java.util.Scanner;

public class EmployeesSystemExample {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        // Get employee data
        System.out.println("\n---------- EMPLOYEE DATA FORM ----------");

        // Name
        System.out.print("Enter the employee name: ");
        var name = input.nextLine();

        // Age
        System.out.print("Enter the employee age: ");
        var age = input.nextLine();
        var convertedAge = Integer.parseInt(age);

        // Salary
        System.out.print("Enter the employee salary: ");
        var salary = input.nextLine();
        var convertedSalary = Double.parseDouble(salary);

        // Is a department boss?
        System.out.print("Enter if the employee is a department boss (true/false): ");
        var isADepartmentBoss = input.nextLine();
        var isADepartmentBossConverted = Boolean.parseBoolean(isADepartmentBoss);

        // Show employee data
        System.out.println("\n---------- EMPLOYEE FINAL DATA ----------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + convertedAge);
        System.out.println("Salary: " + convertedSalary);
        System.out.println("¿Is a department boss?: " + isADepartmentBossConverted);
    }
}
