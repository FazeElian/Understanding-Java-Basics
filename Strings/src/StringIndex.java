public class StringIndex {
    public static void main(String[] args) {
        var string1 = "Hello World";

        // Get the first character from string1
        var index = 0;
        var firstCharacter = string1.charAt(index); // return a character located on the index
        System.out.println("firstCharacter = " + firstCharacter);

        // Get the last character
        index = 9;
        var lastCharacter = string1.charAt(index);
        System.out.println("lastCharacter = " + lastCharacter);
    }
}
