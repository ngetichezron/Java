/**
 * 
 * @author
 * @version
 * @since
 * @param
 * @return
 * @deprecated
 * @see
 * 
 */

 import java.util.ArrayList;
 import java.util.Scanner;

import javax.swing.plaf.TreeUI;

import java.security.*;


public class LearnJava{
    public static void main(String[] args) {


        System.out.println("Hello, World!"); // print  lines
        System.out.println(
            "Integer: " + 10 + 
            "Double: " + 3.14 + 
            "Boolean: " + true
        );

        System.out.print("Hello"); // print without a new line
        System.out.print("world!");


       // System.out.printf("pi = %.5", Math.Pi); // for easy formatted printing.
        
        

        // For input, first >>> import java.util.scanner;
        // Use Scanner to read input.
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        byte numByte = scanner.nextByte();
        int numInt = scanner.nextInt();
        float numFloat = scanner.nextFloat();
        double numDouble = scanner.nextDouble();
        boolean bool = scanner.nextBoolean();



//---------------------------------------- SOME EXAMPLES -----------------------------------------------------------------------
        
        int x, y, z;
        System.out.println("Enter two integers to calculate their sum:");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = x + y;
        System.out.println("Sum of the entered integers = " + z);



        import java.util.Scanner;
        class Cirlce {
            double r, dia, peri, area;
            System.out.println("Enter the radious of the circle: ");
            Scanner s = new Scanner (System.in);
            r = s.nextDouble();
            dia = 2 * r;
            peri = 2 * Math.PI * r;
            area - math.PI * r * r;
            System.out.printf("The diameter of the circle is: %.2f \n", dia);
            System.out.printf("the perimeter of the circle is: %.2f \n", peri);
            System.out.printf("The area of the circle is: %.2f \n", area);
        }


        class EvenOdd {
            int x, y;
            Scanner sc = new Scanner (System.in);
            System.out.println("Enter the values x and y respectively: ");
            x = sc.nextInt();
            y = sc.nextInt();
            System.out.println("**** EVEN NUMBERS BETWEEN THE GIVEN RANGES X AND Y ARE **** >>>");
            int count = x;
            while (count <= y) {
                if (count % 2 == 0) {
                    System.out.println(count);
                }
                count ++;
            }
        }


        class Prime {
            double num;
            int n;
            boolean isPrime = true;
            Scanner c = new Scanner (System.in);
            System.out.println("Enter the number to check: ");
            num = c.nextDouble();
            n = (int) Math.sqrt(num);
            for(int i = 2; i <= n; i++) {
                if(num % i == 0) {
                    isPrime = false;
                } else {
                    isPrime = true;
                }

                if (isPrime) {
                    System.out.println("**** NUMBER IS PRIME !!!!! ****");
                } else {
                    System.out.println("**** NUMBER IS NOT PRIME !!!!! ****");
                }
            }
        }



            class Palindrome {
                int num, reverse = 0, mode;
                Scanner cs = new Scanner (System.in)
                System.out.println("Enter a number to check for Palindrome");
                num = cs.nextInt();
                int number = num;
                while(num != 0) {
                    // System.out.println("Number entering = " + num);
                    mode = num % 10;
                    //System.out.println("Mode = + mode");
                    reverse = (reverse * 10) + mode;
                    //System.out.println(" reverse = + " + reverse);
                    num = num / 10;
                    //System.out.println("new num = " + num);
                }
                //System.out.println("reverse out = " + reverse);
                if (reverse == number) {
                    System.out.println("**** IS A PALINDROME !!!!");
                } else {
                    System.out.println("**** IS NOT A PALINDROME !!!!");
                }
            }



            class Tristars {
                for (int j = 0; i < 5; i++) {
                    for(int j = 0; j < i; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println();
                }
                System.out.println();
            }       

                
//-------------------------------------------------------------------------------------------------------------------------------





        int fooInt;
        int fooInt1, fooINt2, fooInt3;

        int barInt = 1;
        int barInt1, barInt2, barInt3;
        barInt1 = barInt2 = barInt3 = 1;

        byte fooByte = 100; // 127(256)
        int unsignedIntLessThan256 = 0xff & fooByte   // Interpret a byte s an unsigned integer

        int signedInt = (int) fooByte; // Contrasts a cast that can be negative.

        short fooShort = 10000;  // 32 000
        int bazInt = 1;   // 2, 000, 000, 000, 000
        long fooLong = 100000L // 9, 000, 000, 000, 000, 000, 000
                                // Without L, it is treated as integer by default.

         /* Byte           (Signed. Can have positive and negative values.
            Short           No unsigned variants  
            Int             Char, however is 64 bit unsigned.)
            Long
        */ 


        float fooFloat = 234.5f; // Single Precision
                                 // f/F can be used. Else it is treated as a double.
                                 // 2^-149 <= float <= (2-2^-23) * 2^127


        double fooDouble = 123.4; // Double precision. 2^-1074 <= x <= (2-2^-52) * 2^1023
        boolean fooBoolean = true;
        boolean barBoolean = false;
        char fooChar = 'A';        // Single 16-bit Unicode character.

        final int HOURS_I_WORK_PER_WEEK = 9001; // final varibles can't be reassigned but can be initialized later.
        final double E;
        E = 2.71828; // now initialization :)


        String fooString = "My String Is Here!"

        // String building.....
        // #1 Using + operator 
        String plusConcatenated = "Strings can " + "be concatenated." + "via + operator.";
        System.out.println(plusConcatenated);

        // # Using StringBuilder. (efficient fully constructed String is not required.)
        StringBuilder builderConcatenated = new StringBuilder();
        builderConcatenated.append("You");
        builderConcatenated.append("can use");
        builderConcatenated.append("the StringBuilder class.");

        StringBuilder stringBuilder = new StringBuilder();
        String inefficienString = "";
        for (int i = 0; i < 10; i++) {
            stringBuilder.append(i).append("");
            inefficienString += i + " ";
        }
        System.out.println(inefficienString);
        System.out.println(stringBuilder.toString());

        // # With String formatter.
        String.format("%s may prefer %s.", "Or you ", "String.format()"); //----> Fast and readable.


        //---------------------------------------------------------------------------------

        int[] intArray = new int [10];  // format1
        int barArray[] = new int [20];  // format2
        String stringArray[] = new String[1];
        boolean boolArray[] = new boolean[1000];


        int y[] = {9000, 1000, 1337};
        String names[] = {"Bob", "John", "Fred", "Juan Pedro"};
        boolean bools[] = {true, false, false};

        System.out.println("intArray @ 0:" + intArray[0]);   // Accessing an element :) Arrays are zero indexed and mutable.
        
            /* other datatypes worth checking out  >>>>>>
            ArrayLists
            LinkedLists    
            Maps 
            HashMaps
            TreeMap
            */


        
            int i1 = 1, i2 = 2;
    
    // Arithmetics
    System.out.println("1+2 = " + (i1 + i2)); // => 3
    System.out.println("2-1 = " + (i2 - i1)); // => 1
    System.out.println("2*1 = " + (i2 * i1)); // => 2
    System.out.println("1/2 = " + (i1 / i2)); // => 0 (int/int returns int)
    System.out.println("1/2.0 = " + (i1 / (double)i2)); // => 0.5
         // (int/int returns int. 1/2 returns 0 yet you know very well that the answer is o.5!)
    
    
    // Modulo ( the remainder after division.)
    System.out.println("11%3 = "+(11 % 3)); // => 2

    // Comparison operators
    System.out.println("3 == 2? " + (3 == 2)); // => false
    System.out.println("3 != 2? " + (3 != 2)); // => true
    System.out.println("3 > 2? " + (3 > 2)); // => true
    System.out.println("3 < 2? " + (3 < 2)); // => false
    System.out.println("2 <= 2? " + (2 <= 2)); // => true
    System.out.println("2 >= 2? " + (2 >= 2)); // => true

    

        // Boolean operators
    System.out.println("3 > 2 && 2 > 3? " + ((3 > 2) && (2 > 3))); // => false
    System.out.println("3 > 2 || 2 > 3? " + ((3 > 2) || (2 > 3))); // => true
    System.out.println("!(3 == 2)? " + (!(3 == 2))); // => true

    /*
     && logical and => If both of operands are non zero, it returns true.
     || logical or => If any of the operands are non zero,returns true.
     ! logical not => Reverses the condition of its operand. If it is true, then it returns false.
    */


      // Bitwise operators!
    /*
    ~      Unary bitwise complement
    <<     Signed left shift
    >>     Signed/Arithmetic right shift
    >>>    Unsigned/Logical right shift
    &      Bitwise AND
    ^      Bitwise exclusive OR
    |      Bitwise inclusive OR
    */

    System.out.println("\n->Inc/Dec-rementation");
    // The ++ and -- operators increment and decrement by 1 respectively.
    // If they are placed before the variable, they increment then return;
    // after the variable they return then increment.
    System.out.println(i++); // i = 1, prints 0 (post-increment)
    System.out.println(++i); // i = 2, prints 2 (pre-increment)
    System.out.println(i--); // i = 1, prints 2 (post-decrement)
    System.out.println(--i); // i = 0, prints 0 (pre-decrement) 
    
    

    int j = 10;
    if (j == 10){
        System.out.println("I get printed");
    } else if (j > 10){
        System.out.println("I don't get printed");
    } else {
        System.out.println("I also don't.");
    }


    int fooWhile = 0;
    while (fooWhile < 100){
        System.out.println(fooWhile);
        fooWhile++;
    }
    System.out.println("foowhile Value: " + fooWhile);



    int fooDoWhile = 0;

    do {
        System.out.println(fooDoWhile);
        fooDoWhile++;
    } while (fooDoWhile < 100);
    System.out.println("fooDoWhile value: " + fooDoWhile);



    for (int fooFor = 0; fooFor < 10; fooFor++){
        System.out.println("fooFor");
    }
    System.out.println("fooFor value: " + fooFor);
    


    // Nested for loop with Exit label

    outer:
    for (int i = 0; i < 10; i++){
        for (int j = 0; j < 10; j++){
        if (i == 5 && j == 5){
                break outer; //breaks out of outer loop insted of only the inner one.
            }
        }
    }



    int fooList[] = {1,2,3,4,5,6,7,8,9};
    for (int bar : fooList) {
        System.out.println(bar);
    }
    // object type(bar) must match the element type of the iterable(fooList)
    // for each bar in the fooList




    int month = 3;
    String monthString;
    switch (month){
        case 1: monthString = "January";
                break;
        case 2: monthString = "February";
                break;
        case 3: monthString = "March";
                break;
        default: monthString = "Some other month";
                break;
    }
    System.out.println("Switch Case Result: " + monthString);


    /* switch works with the byte,short, char, and int data types.
       Also works with enumerated types (Enum Types), the String class, and a few special classes  that wrap up the primitive types: (Character, Byte, Short, and Integer.)
       String data type can also be used, but starting java 7 and above.
       Not adding "break" at end any particular case ends up in executing the very next case(given it satisfies the condition provided) as well.
    */
































    }
}
