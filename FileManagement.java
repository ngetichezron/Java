/*
Storing data in variables and arrays poses the following problems:
    Temporary Storage: data is lost when the variable goes out of scope or when the program is terminated.
    It is diffucilt handling large data.

    Such problems can be solved by storing data on secondary devices using the concept of files.

File - Collection of related records stored in a particular area on the disk  
The files store and manage data by the concept of file handling.

Files processing includes:
    Creating files
    Updating files
    Manipulation of data

    Java provides many features in file management like :
    Reading/writing of data can be done at the byte level or character or fields depending upon the requirement.
    It also provides the capability to read/write objects directly.


Streams
Java uses the concept of streams to represent an ordered sequence of data, a path along which 
data flows. Thus, it has a source and a destination.

Streams are classified into two basic types :
Input Stream:     extracts, i.e., reads data from the source file and sends it to the program.
Output Stream:    which takes the data from the program and sends, i.e., writes to the destination.

Stream Classes
They are contained in the java.lang.io package.

They are categorized into two groups.
Byte Stream Classes: provides support for handling I/O operation on bytes.
Character Stream Classes: provides support for managing I/O operations on characters.


Bytes Stream Classes
Designed to provide functionality for creating and manipulating streams and files for reading/writing bytes.

Since streams are unidirectional, there are two kinds of byte stream classes :
Input Stream Classes
Output Stream Classes

Input Stream Classes
They are used to read 8-bit bytes include a superclass known as InputStream. InputStream is an abstract class and defines the methods for input functions such as :


    Method	                        Description
    read( )	                        Reads a byte from the input stream
    read(byte b [ ])	            Reads an array of bytes into b
    read(byte b [ ], int n, int m)	Reads m bytes into b starting from the nth byte of b
    available( )	                Tells the number of bytes available in the input
    skip(n)	                        Skips over n bytes from the input stream
    reset ( )	                    Goes back to the beginning of the stream
    close ( )	                    Closes the input stream

*/



/*

Output Stream Classes
These classes are derived from the base class OutputStream. OutputStream is an abstract class and defines the methods for output functions such as :

    Method	                        Description
    write( )	                    Writes a byte to the output stream
    write(byte b[ ])	            Writes all the bytes in the array b to the output stream
    write(byte b[ ], int n, int m)	Writes m bytes from array b starting from the nth byte
    close( )	                    Closes the output stream
    flush( )	                    Flushes the output stream


Reading/Writing Bytes
Two common subclasses used are FileInputStream and FileOutputStream that handle 8-bit bytes.

FileOutputStream is used for writing bytes to a file as demonstrated below:

// Writing bytes to a file
*/

import java.io.*;

class WriteBytes {
    public static void main(String [] args) {
        bytes cities [] = {'C','A','L','I','F','O','R','N','I','A', '\n', 
        'V','E','G','A','S','\n',
        'R','E','N','O','\n'};


    // Create output file stream
    FileOutputStream outfile = null;
    try {
        // Connect the outfile stream to "city.txt"
        outfile = new FileOutputStream("city.txt");
        // Write data to the stream
        outfile.write(cities);
        outfile.close();
    }
    catch(IOException ioe) {
        System.out.println(ioe);
        System.exit(-1);
    }
    }
}


// FileInputStream is used for reading bytes from a file, as demonstrated below:

// Reading bytes from a file


//import java.io.*;
class ReadBytes {
    public static void main(String [] args) {
        
        // create an input file stream
        FileInputStream infile = null;
        int b;

        try { 
            // Connect the infile stream to required file
            infile = new FileInputStream(args [0]);

            // Read and display
            while( (infile.read()) != -1) {
                System.out.println((char) b);
            }
            infile.close();
        }
        catch(IOException ioe) {
            System.out.println(ioe);
            System.exit(-1);
        }
    }
}

/* 
Character Stream Classes

Two kinds of character stream classes:
1. Reader Stream Classes
    Designed to read characters from the files.
    Class Reader is the base class for all other classes.
    These classes are similar to input stream classes except for their fundamental unit of information, while the reader stream uses characters.
2. Writer Stream Classes
    Performs all output operations on files.
    Writes characters
    The Writer class is an abstract class that is the base class, having methods identical to OutputStream.
Reading/Writing Characters
The two subclasses of Reader and Writer classes for handling characters in files are FileReader and FileWriter.

// Copying characters from one file to another
*/

//import java.io.*;
class CopyCharacters {
    public static void main(String [] args) {
        // Declare and create input and output files
        File inFile = new File("input.dat");
        File outFile = new File ("output.dat");
        FileReader ins = null; // creates file stream ins
        FileWriter outs = null; // creates file steam outs


        try {
            ins = new FileReader(inFile); // opens infile
            outs = new FileWriter(outFile); // opens outfile

            // Read and write
            int ch;
            while((ch = ins.read()) != -1) {
                outs.write(ch);
            }
        }
        catch(IOException e) {
            System.out.println(e);
            System.exit(-1);
        }
        finally {
            try{
                ins.close();
                outs.close();
            }
            catch (IOException e) {}
        }
    }
}