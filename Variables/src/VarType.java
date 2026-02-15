public class VarType {
    public static void main(String[] args) {
        // Defining variable type
        String name1 = "Juan";

        // Inferring variable type using "var" instead of String
        var name2 = "Carlos";
        System.out.println("name1 = " + name1);
        System.out.println("name2 = " + name2);

        // Examples:
        double pi = 3.1416;
        var pi2 = 3.1416;
        System.out.println("pi = " + pi);
        System.out.println("pi2 = " + pi2);

        boolean isCompleted = true;
        var isCompleted2 = false;
        System.out.println("isCompleted = " + isCompleted);
        System.out.println("isCompleted2 = " + isCompleted2);

        char gender = 'M';
        var gender2 = 'M';
        System.out.println("gender = " + gender);
        System.out.println("gender2 = " + gender2);

        // !!!!!!!!!!!!!!!!!
        // WHAT WE CANNOT DO:

        // var price; We should initialize the variable by adding a value when we create it
        //price = 20;

        // var isMarried = false; We can't change the value of the variable is the new value type is different to the type of the initial value
        // isMarried = "Yes";
    }
}
