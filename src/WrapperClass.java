import java.util.Scanner;
import java.util.StringJoiner;

/**
 * Class demos Wrapper classes
 */
public class WrapperClass {


    public WrapperClass() {

    }


    /**
     * Java Wrapper classes provide a way to use primitive data types (e.g., int, char, double) as objects. Wrapper
     * classes are part of the java.lang package and include classes like Integer, Character, Double, etc.
     */

    public void useAutoboxAndUnbox() {
        //Autoboxing
        Integer intObj = 10;

        Double doubleObj = 20.5;

        //Unboxing
        int intValue = intObj;
        double doubleValue = doubleObj;

        //Parsing - Reading in something

        int parseInt = Integer.parseInt("100");
        double parseDouble = Double.parseDouble("50.5");


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

    public void useValueOf() {
        //777.14

        Integer IntObj = Integer.valueOf(100);

        System.out.println(IntObj);
        System.out.println(IntObj.getClass());

        Double doubleObj = Double.valueOf(777.14);
        System.out.println(doubleObj);
        System.out.println(doubleObj.getClass());


    }

    public void useCharacterWrapper() {
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
    public void useEscapeSeq() {
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

    public void useStrings() {
        //Creating string objects using literals

        String s1 = "abc";

        String s2 = "abc";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());


        //comparison == compares memory location/reference
        System.out.println(s1 == s2);        //Output : true

        //Creating string objects using new operator

        String s3 = new String("abc");

        String s4 = new String("abc");

        System.out.println(s3 == s4);        //Output : false
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

    }

    public void usePopularStringMethods() {
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

    public void useMoreStringMethods() {
        String str = "  Hello World  ";
        // Extracting a char or substring
        //Returns the character at the specified index.
        System.out.println("Character at index 4: " + str.charAt(4));

        //Extracts a substring starting at start (inclusive) and ending at end (exclusive).
        System.out.println("Substring (2, 8): " + str.substring(2, 8));

        System.out.println("To Lower Case: " + str.toLowerCase());
        System.out.println("To Lower Case: " + str.toUpperCase());

        //Concatenates the given string to the end of the current string.
        System.out.println("Concatenation: " + str.concat("!!!"));

        //Removes leading and trailing whitespace characters (e.g., spaces, tabs).
        System.out.println("Trim: " + str.trim());

        //Removes leading and trailing whitespace, including Unicode spaces.
        System.out.println("Strip (JDK 11): " + str.strip());

        //Checks if the string matches the specified regular expression.
        System.out.println("Matches regex '.*World.*': " + str.matches(".*World.*"));

        //Replaces all occurrences of the specified character with another character.
        System.out.println("Replace 'o' with 'X': " + str.replace('o', 'X'));

        //Replaces all substrings matching the given regular expression with the replacement.
        System.out.println("Replace all whitespaces with '_': " + str.replaceAll("\\s", "_"));

        //Splits the string into an array of substrings using the specified regular expression as a delimiter.
        String str2 = "Java Python\tC++ Ruby";

        String[] parts = str2.split("\\s+"); // Split using whitespace as a delimiter
        System.out.println("Split result:");
        //Enhanced for loop - can use with arrays and no index
        for (String part : parts) {
            System.out.println(part); // Outputs each word
        }

    }

    public void useScanner(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter First  name: ");
        String firstName = input.nextLine();

        System.out.println("Enter Last name: ");
        String lastName = input.nextLine();

        System.out.println("Welcome " + firstName + " " + lastName);

    }

    public void convertStringToNumber(){
        // String to primitive using parsing methods
        String intString = "42";
        System.out.println("Result: " + intString + 10);
      //  System.out.println("int result: " + num);
        int intValue = Integer.parseInt(intString);
        System.out.println("Primitive int: " + intValue);
        int num = intValue + 10;
        System.out.println("int result: " + num);

        String doubleString = "3.14";
        double doubleValue = Double.parseDouble(doubleString);
        System.out.println("Primitive double: " + doubleValue);

        // String to wrapper object using valueOf methods
        Float intWrapper = Float.valueOf(intString);
        System.out.println("Integer wrapper: " + intWrapper);
        System.out.println("Integer wrapper: " + intWrapper.getClass());
    }

    public void convertNumberToString(){
        // Convert primitive numbers to String
        int intValue = 42;
        String intString = Integer.toString(intValue);
        System.out.println("String from int: " + intString);
        System.out.println("Integer wrapper: " + intString.getClass());

        // Convert wrapper objects to String
        Integer intWrapper = 123;
        System.out.println("Integer wrapper: " + intWrapper.getClass());

        String intWrapperString = intWrapper.toString();
        System.out.println("String from Integer wrapper: " + intWrapperString);
        System.out.println("Integer wrapper: " + intWrapperString.getClass());
    }

    public void useStringBuffer(){
        StringBuffer sb1 = new StringBuffer();  //capacity 16 default
        System.out.println("Default capacity:  " + sb1.capacity());

        StringBuffer sb2 = new StringBuffer(10);
        System.out.println("Default capacity:  " + sb2.capacity());

        StringBuffer sb3 = new StringBuffer("Hello World");
        System.out.println("Default capacity:  " + sb3.capacity());

        //Append
        sb3.append(" and have a great day");
        System.out.println("After append: " + sb3);

        //Insert
        sb3.insert(23, "Beautiful ");
        System.out.println("After insert: " + sb3);

        //Replace
        sb3.replace(23, 32, "Amazing");
        System.out.println("After insert: " + sb3);

        //Reverse
        sb3.reverse();
        System.out.println("After insert: " + sb3);
        sb3.reverse();
        System.out.println("After insert: " + sb3);

        //Length
        System.out.println("Length: " + sb3.length());

        // Capacity
        System.out.println("Capacity: " + sb3.capacity());

        //Modifying and ensure capacity
        sb3.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(50): " + sb3.capacity());

    }

    public void useStringJoiner(){
        //Create StringJoiner using a delimiter
        StringJoiner joiner = new StringJoiner(",");
        //Adding elements
        joiner.add("Java");
        joiner.add("Python");
        joiner.add("C++");

        System.out.println("Joined String: " + joiner);

        // Using StringJoiner with a prefix and suffix
        StringJoiner fancyJoiner = new StringJoiner(",",      "[[[[",       "]");
        fancyJoiner.add("Java");
        fancyJoiner.add("Python");
        fancyJoiner.add("C++");

        System.out.println("Fancy Joined String: " + fancyJoiner);


    }

    public void useFormatingToConsole(){
        // System.out.format() Formats and directly prints to the console.
        System.out.format("System.out.format: Name: %s, Age: %d, Salary: %.2f%n","Alice",30,150000.345);

       // Works the same as System.out.format, shorthand for formatted printing.
        System.out.printf("System.out.format: Name: %s, Age: %d, Salary: %.2f%n","Bob",35,150000.345);

        //Returns a formatted string instead of printing directly.
        String formattedString = String.format("String.format: Name: %s, Age: %d, Salary: %.2f", "Charlie", 40, 60000.33);
        System.out.println(formattedString);

    }

    public void useMathClass(){

//        int a = 10, b = -20;
//        System.out.println(Math.abs(a)); // 10
//        System.out.println(Math.abs(b)); // 20
//        System.out.println(Math.max(a, b)); // 10
//        System.out.println(Math.min(a, b)); // -20
//
//        System.out.println(Math.exp(1));
//        System.out.println(Math.log(2.71));
//        System.out.println(Math.pow(2,3));
//        System.out.println(Math.sqrt(4));
//        System.out.println(Math.sqrt(10.5));

        double d = 83.67;
        System.out.println(Math.ceil(d));  // return double & rounded up to its nearest integer
        System.out.println(Math.floor(d)); // return double and rounded down to its nearest integer
        System.out.println(Math.rint(d)); // return double but find the closest integers for these double numbers
        //Math.round() It is used to round of the decimal numbers to the nearest value.
        System.out.println(Math.round(d));  // 84;
        double a = 1.878;
        System.out.println(Math.round(a));  // 2
        // value equals to 5 after decimal
        double b = 1.5;
        System.out.println(Math.round(b));  // 2
        // value less than 5 after decimal
        double c = 1.34;
        System.out.println(Math.round(c));  // 1

        //Math.random() method
        // generate integer number b/w 1 to 100
        int n1 = (int) (Math.random()*100);
        int n2 = (int) (Math.random()*100);

        // display generated integer numbers
        System.out.println(n1);
        System.out.println(n2);

    }

}
