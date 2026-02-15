public class StringsComparison {
    public static void main(String[] args) {
        // strings pool
        // both of the strings are aiming to the same string object -> "Java"
        var string1 = "Java";
        var string2 = "Java";

        // Strings comparison - reference
        System.out.print("Is the string1 === string2?: ");
        System.out.println(string1 == string2); // compare the reference that the strings are aiming to

        // However if we want to create a new space in memory, a different string object we:
        var string3 = new String("Java");

        // Strings comparison - reference
        System.out.print("Is the string1 === string3?: ");
        System.out.println(string1 == string3); // false

        System.out.print("Is the string2 === string3?: ");
        System.out.println(string2 == string3); // false

        // Compare content of the string
        System.out.print("Is the content of the string1 equal to the content of the string3?: ");
        System.out.println(string1.equals(string3)); // we use the equals method, the parameter is the another string to compare

        System.out.print("Is the content of the string2 equal to the content of the string3?: ");
        System.out.println(string2.equals(string3));
    }
}
