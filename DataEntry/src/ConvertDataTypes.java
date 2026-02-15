import java.util.Scanner;

public class ConvertDataTypes {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        // To integer -> Integer.parseInt()
        System.out.print("Enter a integer value: "); // example: 20
        var toInt = Integer.parseInt(input.nextLine());
        System.out.println("Value converted to integer type: " + toInt);

        // To double -> Double.parseDouble()
        System.out.print("\nEnter a double value: "); // example: 1.12
        var toDouble = Double.parseDouble(input.nextLine());
        System.out.println("Value converted to double type: " + toDouble);

        // To float -> Float.parseFloat()
        System.out.print("\nEnter a float value: "); // example: 20.59
        var toFloat = Float.parseFloat(input.nextLine());
        System.out.println("Value converted to float = " + toFloat);

        // To boolean -> Boolean.parseBoolean()
        System.out.print("\nEnter a boolean value: "); // example: true
        var toBoolean = Boolean.parseBoolean(input.nextLine());
        System.out.println("Value converted to boolean = " + toBoolean);

        // To Long -> Long.parseLong()
        System.out.print("\nEnter a long value: "); // example: 54353749345
        var toLong = Long.parseLong(input.nextLine());
        System.out.println("Value converted to long = " + toLong);

        // To Short -> Short.parseShort()
        System.out.print("\nEnter a short value: "); // example: 123
        var toShort = Short.parseShort(input.nextLine());
        System.out.println("Value converted to short = " + toShort);

        // To Byte -> Byte.parseByte()
        System.out.print("\nEnter a byte value: "); // example: 64
        var toByte = Byte.parseByte(input.nextLine());
        System.out.println("Value converted to short = " + toByte);
    }
}
