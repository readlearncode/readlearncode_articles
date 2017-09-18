package com.readlearncode.string;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class FormatString {

    public static void main(String... args) {

        String output;

        // replace one placeholder
        output = String.format("Hello %s", "Alex");
        System.out.println(output);

        // replace multiple placeholders of different types
        output = String.format("The %s costs $%f", "Bag", 12.99f);
        System.out.println(output);

        // format number to two-decimal places
        output = String.format("The %s costs $%.2f", "Bag", 12.99f);
        System.out.println(output);

        // add comma number separator
        output = String.format("The %s costs $%,.2f", "Car", 54999.99f);
        System.out.println(output);

        // Enclose a negative numbers with parenthesis
        output = String.format("Absolute zero is %(.2f degrees Celsius", -273.15f);
        System.out.println(output);

        // Positive/negative numbers
        output = String.format("Temperature of the Sun %,+d K", 5778);
        System.out.println(output);
        output = String.format("Temperature of Jupiter %,+d K", -145);
        System.out.println(output);

        // A padded number
        output = String.format("A padded number %010d", 42);
        System.out.println(output);

        // A left-justified number
        output = String.format("A left-justified number <%-10d>", 42);
        System.out.println(output);

        // Octal numbers
        output = String.format("An octal number %o", 100);
        System.out.println(output);
        output = String.format("An octal number %#o", 100);
        System.out.println(output);

        // Hexadecimal numbers
        output = String.format("An hex number %x", 100);
        System.out.println(output);
        output = String.format("An hex number %#x", 100);
        System.out.println(output);

        // Multiple String arguments of multiple types
        output = String.format("The %1s has %2d moons", "Saturn", 53);
        System.out.println(output);

        // Specify a width
        output = String.format("Fun with <%10s>", "Java");
        System.out.println(output);

        // Specify a left justification with width
        output = String.format("Fun with <%-10s>", "Java");
        System.out.println(output);

        // Truncate the maximum number of characters
        output = String.format("Fun with <%.1s>", "Java");
        System.out.println(output);



    }

}