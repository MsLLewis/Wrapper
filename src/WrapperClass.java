/**
 * Class demos Wrapper classes
 */
public class WrapperClass {


    public WrapperClass(){

    }


    /**
     *  Java Wrapper classes provide a way to use primitive data types (e.g., int, char, double) as objects. Wrapper
     *     classes are part of the java.lang package and include classes like Integer, Character, Double, etc.
     */

    public void useAutoboxAndUnbox(){
        //Autoboxing
        Integer intObj =  10;

        Double doubleObj =  20.5;

        //Unboxing
        int intValue = intObj;
        double doubleValue = doubleObj;

        //Parsing - Reading in something

        int parseInt = Integer.parseInt("100");
        double parseDouble= Double.parseDouble("50.5");


        System.out.println("Autoboxing: " + intObj + ", " + doubleObj);
        System.out.println("Autoboxing: " + intObj.getClass() + ", " + doubleObj.getClass());
        System.out.println("Unboxing: " + intValue + ", " + doubleValue);

        System.out.println("Parsed Values: " + parseInt + ", " + parseDouble);
    }

    /**
     * The .valueOf() method is the recommended way to create instances/objects of wrapper classes.
     * Auto-boxing is another convenient way to create instances of wrapper classes without explicitly calling a constructor.
     * - Explicitly called to create an `Integer` object from a primitive value.
     * - Uses a caching mechanism for values between `-128` and `127`. For numbers in this range, returns a cached instance instead of creating a new object.
     * - For values outside this range, creates a new `Integer` object.
     */

    public void useValueOf(){
        //777.14

        Integer IntObj = Integer.valueOf(100);

        System.out.println(IntObj);
        System.out.println(IntObj.getClass());

        Double doubleObj = Double.valueOf(777.14);
        System.out.println(doubleObj);
        System.out.println(doubleObj.getClass());


    }

    public void useCharacterWrapper(){
        char ch = 'A';
        Character charObj = ch;  //Autoboxing

        char charPrimitive = charObj;  //Unboxing

        System.out.println(charObj);
        System.out.println(charObj.getClass());

        System.out.println("Primitive char: " + charPrimitive);

       //Additional Character methods
        System.out.println("______________________________________________________________");

        char cha = '9';
        char letter = 'a';


        System.out.println("Is digit: " + Character.isDigit(cha)); // true
        System.out.println("Is letter: " + Character.isLetter(letter)); // true
        System.out.println("Uppercase: " + Character.toUpperCase(letter)); // A
        System.out.println("Uppercase: " + Character.toLowerCase(letter)); // a

        char chA = 'A';
        Character charObj1 = Character.valueOf(chA);
        System.out.println("Character object: " + charObj1); // A
        System.out.println(charObj1.getClass());

        String str = String.valueOf(chA);
        System.out.println("String representation: " + str); // "A"  + 'A'
        System.out.println(str.getClass());

    }

    /**
     * \t – Tab
     * The \t adds spaces between columns, making the text aligned in a tabular format.
     * Inserts a horizontal tab (spaces out the text to the next tab stop).
     */
    public void useEscapeSeq(){
        System.out.println("Name\tAge\tLocation");
        System.out.println("Alice\t25\tAtlanta");
        System.out.println("Jane\t30\tNew York");

        /*
        \b – Backspace
Removes the character immediately before the escape sequence.
The \b backspace removes the last 'o' from "Hello."
         */
        System.out.println("Hello\bWorld");
/*
\n – New Line
        Moves the text after the escape sequence to a new line.
 */
        System.out.println("Hello\nWorld");
        /*  \r – Carriage Return
        Moves the cursor to the beginning of the current line, overwriting the text already printed.
        The \r moves the cursor back to the beginning of the line, overwriting "Hello" with "World."

         */

        System.out.println("Hello\rWorld");

        /*
        \f – Form Feed
Advances the text to the next page or section (commonly used in printers).
The \f adds a form feed break (visual effects depend on the terminal/printer being used).
         */
        System.out.println("Hello\fWorld");

        /**
         * \' – Single Quote
         * Allows a single quote character to appear in the text.
         * The \' enables the inclusion of a single quote within the string.
         */
        System.out.println("It\'s a rainy day in Georgia! ");

        /**
         * \" – Double Quote
         * Allows a double quote character to appear in the text.
         * The \" allows double quotes to be used inside a string.
         */
        System.out.println("She said, \"Hello!\"");

        /**
         * \\ – Backslash
         * Inserts a literal backslash character.
         * The \\ inserts a single backslash into the text.
         */
        System.out.println("Path: C:\\Users\\Smith");
    }

    public void useStrings(){
        //Creating string objects using literals

        String s1 = "abc";

        String s2 = "abc";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());


                              //comparison == compares memory location/reference
        System.out.println(s1 == s2);    	//Output : true

        //Creating string objects using new operator

        String s3 = new String("abc");

        String s4 = new String("abc");

        System.out.println(s3 == s4);    	//Output : false
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

    }

    public void usePopularStringMethods(){
        String str = "Hello World";

        //Finding String Size
        System.out.println("Length: " + str.length());
        System.out.println("Length: " + str.isEmpty());
        System.out.println("Length: " + str.isBlank());

        //String Comparison
        System.out.println("Equals: " + str.equals("Hello World"));
        System.out.println("Equals: " + str.equalsIgnoreCase("hello world"));
        /**
         * int compareTo(String another)
         * Compares strings lexicographically (dictionary order).
         * Returns:
         * 0 if strings are equal.
         * A negative number if the current string is lexicographically smaller.
         * A positive number if it's larger.
         */
        //String str = "Hello World";
        System.out.println("Equals: " + str.compareTo("Hello Worl"));

        System.out.println("Value Of: " + String.valueOf(123)); // "123"
        System.out.println("Starts With: " + str.startsWith("Hello")); // true
        System.out.println("Ends With: " + str.endsWith("World")); // true

        // Finding a Character in a String
        System.out.println("Index Of 'o': " + str.indexOf('o')); // 4
        System.out.println("Last Index Of 'o': " + str.lastIndexOf('o')); // 7
        System.out.println("Contains 'World': " + str.contains("World")); // true





    }
}
