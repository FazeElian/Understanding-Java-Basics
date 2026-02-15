public class Types {
    public static void main(String[] args) {
        // Integers type (by default their value is 0):
        System.out.println("- Integer Types:");
        byte byteType = 127; // can save at most 8 bits
        System.out.println("byteType = " + byteType); // concatenate

        short shortType = 32767; // can save at most 16 bits
        System.out.println("shortType = " + shortType);

        int intType = 2147483142; // can save at most 32 bits
        System.out.println("intType = " + intType);
        
        long longType = 987654321; // can save at most 64 bits
        //longType = 9876543213424123L; // With a "L" at the end we indicate that is a long type (this when the number is over the 64 bits)
        System.out.println("longType = " + longType);

        // Float type (by default their value is 0.0):
        System.out.println("");
        System.out.println("- Float Types:");
        float floatType = 3.1416F; // With a "F" at the end we indicate that is float type, can save at most 32 bits
        // If we don't indicate the type with a "F" java will understand that variable as a double type one
        System.out.println("floatType = " + floatType);

        double doubleType = 3.234234234D; // can save at most 64 bits, we can also indicate the type with a "D" (optional)
        System.out.println("doubleType = " + doubleType);

        // Character (by default their value is ('\u0000'), in Unicode)
        char charType = 'A'; // Characters that belong to characters game: Unicode
        System.out.println("charType = " + charType);
        charType = 65; // 65 is the number equivalent to 'A' on Unicode

        // Boolean (by default their value is false)
        boolean booleanType = false;
        System.out.println("booleanType = " + booleanType);

        // Object or reference Types:
        System.out.println();
        System.out.println("- Object - reference type:");

        String name = null; // There is no value
        System.out.println("name = " + name);
        name = "Elián Ibarra";
        System.out.println("name = " + name);
    }
}
