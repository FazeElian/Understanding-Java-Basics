public class SubStringsSearch {
    public static void main(String[] args) {
        var initialString = "Hello World"; // ["H", "e", "l", "l", "o", " ", "W", "o", "r", "l", "d"]

        // indexOf -> returns the index of the first occurrence of the sub string
        var string2 = initialString.indexOf("H"); // located on the [0] position
        System.out.println("string2 = " + string2); // 0

        // lastIndexOf -> returns the index opf the last occurrence of the sub string
        var string3 = initialString.lastIndexOf("o"); // located on the [4] & [7] position, returns the [7] one
        System.out.println("string3 = " + string3); // 7

        // Sub string not found
        var notFound = initialString.indexOf("Z"); // is not on any of the initial string substrings
        System.out.println("notFound = " + notFound); // returns -1
    }
}
