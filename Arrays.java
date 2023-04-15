/* 
    Provides code optimization since we can sort data efficiently and also access it randomly
    Only flaw: - 

    There are two kinds of arrays defined in Java
    1. One - Dimensinal - Elements stored in a single row.
    2. Multi - Dimensional - Elements stored as rows and columns

*/


// Single / One dimensional Array

import java.util.Scanner;

class singleArray {
    public static void main(String args[]) {
        
        System.out.println("Enter the length in the array: ");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] numbers = new int [len];
        System.out.println("Enter the elements in the array: ");
        // int n = 

        for(int i=0; i<len; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("The elements in the array are: ");
        for (int i = 0; i < len; i++); {
            System.out.println(numbers[i] + " ");
        }

        System.out.println();
        System.out.println("The sum of the elements in the array are: ");
        int sum = 0;
        for(int i = 0; i < len; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("Sum of the elements = " + sum);
    }
}

// Multi - Dimensional arrays 

class MatrixArray {
    public static void main(String args[]) {

        int [][] m1 = {{1,2,1},{2,1,1},{1,1,2}};
        int [][] m2 = {{2,2,1},{1,1,1},{2,1,2}};
        int [][] sum = new int [3][3];

        //printing matrix
        System.out.println("The given matrixes are: ");
        for(int a = 0; a < m1.length; a++) {
            for (int b = 0; b < m2.length; b++) {
                System.out.println(m1[a][b] + " ");
            }
            System.out.println();
        }
        System.out.println()
        for(int a = 0; a < m1.length; a++) {
            for(int b = 0; b < m2.length; b++) {
                System.out.println(m2.[a][b] + " ");
            }
            System.out.print();
        }
        
        // Matrix addition
        System.out.println("The sum of the given 2 matrices are: ");
        for(int a = 0; a < m1.length; a++) {
            for(int b = 0; b < m2.length; b++) {
                sum[a][b] = m1[a][b] + m2[a][b];
                System.out.print(sum[a][b] + " ");
            }
            System.out.println()
        }
    }
}


