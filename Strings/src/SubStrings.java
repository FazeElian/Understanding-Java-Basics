public class SubStrings {
    public static void main(String[] args) {
        var initialString = "Hello World"; // ["H", "e", "l", "l", "o", " ", "W", "o", "r", "l", "d"]

        var hello = initialString.substring(0, 5); // Hello
        var world = initialString.substring(6, 11); // World

        System.out.println("hello = " + hello);
        System.out.println("world = " + world);
    }
}
