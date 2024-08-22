package com.java.strings;

import java.util.Date;

public class PrettyPrintingStrings_03 {

    /**
     * Specifier List
     * The following table shows the format specifiers:
     * Format Specifier	        Conversion Applied
     *      %a %A	        Floating-point hexadecimal
     *      %b %B	        Boolean
     *        %c	        Character
     *        %d	        Decimal integer
     *      %h %H	        Hash code of the argument
     *      %e %E	        Scientific notation
     *        %f	        Decimal floating-point
     *      %g %G	        Uses %e or %f, whichever is shorter
     *        %o	        Octal integer
     *        %n	        Inserts a newline character
     *      %s %S	        String
     *      %t %T	        Time and date
     *      %x %X	        Integer hexadecimal
     *        %%	        Inserts a % sign
     *
     * If the argument doesn't match the type-checks, an IllegalFormatException is thrown.
     */

    public static void main(String[] args) {

        float a = 3.123112f;
        System.out.printf("Formatted number %.2f",a);

        System.out.println();

        System.out.printf("Pie value: %.3f",Math.PI);

        System.out.println();

        System.out.printf("Hello %s I am your friend %s", "indu", "Cool");

        System.out.println();

        System.out.printf("%s gap filler %d %f", "Astring", 10, 12.3);

        System.out.println();

//        System.out.printf("%t", new Date());    // it will throw 'UnknownFormatConversionException'

        //%n and %% format specifiers escape sequences. The %n inserts a newline. The %% inserts a percent sign.
        System.out.printf("line%nline %d%% complete", 88);

    }
}
