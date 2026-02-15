public class Strings {
    public static void main(String[] args) {
        // Basic syntax
        var string1 = "Hello";
        System.out.println("string1 = " + string1);

        // Object syntax - formal one
        var string2 = new String("World"); // create a string object
        System.out.println("string2 = " + string2);

        // Creates a new string on memory from string1 & string2 concatenation
        var string3 = string1 + " " + string2;
        System.out.println("string3 = " + string3);

        // Text block string - multiline
        var string4 = """
        This is a
        multiline text
        """;
        System.out.println("string4 = " + string4);
    }
}
