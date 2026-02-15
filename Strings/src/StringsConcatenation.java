public class StringsConcatenation {
    public static void main(String[] args) {
        // Using "+"
        var string1 = "Hello";
        var string2 = "World";

        var string3 = string1 + string2;
        System.out.println("string concatenated using '+' = " + string3);

        // Using concat() method
        var string4 = string1.concat(" ").concat(string2);
        System.out.println("string concatenated using concat() = " + string4);

        // StringBuilder -> can be mutable
        var stringsConstructor = new StringBuilder();
        stringsConstructor.append(string1); // add string
        stringsConstructor.append(" ");
        stringsConstructor.append(string2); // we can keep adding strings

        var result = stringsConstructor.toString(); // final result after appends

        System.out.println("string concatenated using StringBuilder() object = " + result);

        // StringBuffer -> when a lot of processes are been executed at the same time
        var stringBuffer = new StringBuffer();

        // we can append a new string from the previous one directly
        stringBuffer.append(string1).append(" ").append(string2).toString();
        System.out.println("string concatenated using StringBuffer() object = " + stringBuffer);

        // Join method -> join 1 or more strings
        var res = String.join("_", string1, string2);
        System.out.println("string concatenated using join() method = " + res);
    }
}
