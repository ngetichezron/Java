import javax.swing.event.SwingPropertyChangeSupport;

/* 
    Exception - error / abnormality caused by a run-time error in the program
    If not caught and handled properly, interpreter will display an error message.
    To avoid this and make the program continue, we should catch the exceptions.
    This is the -- exception handling.


    Common Java Exceptions:
     
    Exception Type	Cause of Exception
    ArithmeticException	            caused by math errors
    ArrayIndexOutOfBoundException	caused by bad array indexes
    ArrayStoreException	            caused when a program tries to store the wrong data type in an array
    FileNotFoundException	        caused by an attempt to access a nonexistent file
    IOException                  	caused by general I/O failures.
    NullPointerException	        caused by referencing a null object.
    NumberFormatException	        caused when a conversion between strings and number fails.
    OutOfMemoryException	        caused when there is not enough memory to allocate
    StringIndexOutOfBoundException	caused when a program attempts to access a non-existent character position in a string.


    Exceptions in Java can be of two types:

    # Checked Exceptions
    - Handled explicitly in the code itself with the help of try - catch block.
    - Extended from java.lang.Exception class

    # Unchecked Exceptions
    - Not necessarily handled in the program code; instead, JVM handles such exceptions
    - Extended from java.lang.RuntimeException class


    TRY AND CATCH
    Try keyword is used to preface a block of code that is likely to cause and error condition and throw an exception.
    Catch keyword defines a catch block that catches the exception thrown by the try block and handles it properly

    A code can have more than one catch statement in the catch block; when an exception in the try block is generated, multiple
    catch statements are treated like cases in a switch statement.

*/


class Error { 
    public static void main(String[] args) {
        int a [] = ;
        int b = 5;

        try {
            int x = a[2]/b - a[1];             
        }
        catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(ArrayIndexError);
        }
        catch (ArrayStoreException e) {
            System.out.println("Wrong Data type");
        }

        int y = a[1]/a[0];
        System.out.println("y = " + y);
    }
}

/* 
    FINALLY

    Used to handle exceptions that are not caught by any previous catch statements
    A final block is guaranteed to execute, regardless of whether or not an exception is thrown.

    We can edit the above program and add the following final block.
*/

finally {
    int y = a[1]/a[0];
    System.out.println("y = " + y);
}


/* 
    Throwing Your Own Exception

    Own exceptions can be defined using the throw keyword.
*/

import java.lang.Exception;

 class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
 }

 class TestMyException {
    public static void main(String[] aStrings) {
        int x = 5, y = 1000;

        try {
            float z = (float) x / (float) y;
            if(z < 0.01) { 
                throw new MyException("Number is too small");
            }
        }
        catch(MyException e) {
            System.out.println("Caught my exception");
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("I am always here");
        }
    }
 }












































