public class SpecialCharacters {
    public static void main(String[] args) {
        var string1 = "Hello World";
        System.out.println("string1 = " + string1);

        // \n -> line jump
        var string2 = "Hello \nWorld";
        System.out.println("string2 = " + string2);
        
        // \t -> tab
        var string3 = "Hello \tWorld";
        System.out.println("string3 = " + string3);

        // Add for example a '
        var string4 = "Hello \' World";
        System.out.println("string4 = " + string4);

        // \\ -> write the '\' character
        var string5 = "Hello \\ World";
        System.out.println("string5 = " + string5);
    }
}
