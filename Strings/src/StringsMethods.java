public class StringsMethods {
    public static void main(String[] args) {
        var string1 = "Hello World";

        // Get length of the string
        var stringLength = string1.length();
        System.out.println("stringLength = " + stringLength);

        // Replace characters
        var newString = string1.replace("World", "Elián!"); // we change "World" for "Elián!"
        System.out.println("newString = " + newString);

        // Convert to capital letters
        var capitalString = string1.toUpperCase();
        System.out.println("capitalString = " + capitalString);
        
        // Convert to lowercase letters
        var lowerCaseString = string1.toLowerCase();
        System.out.println("lowerCaseString = " + lowerCaseString);

        // Remove spaces at the beginning or at the end
        var string2 = "   Elián Ibarra    ";
        System.out.println("string2 (with spaces) = " + string2);
        System.out.println("string2 (without spaces) = " + string2.trim());
    }
}
