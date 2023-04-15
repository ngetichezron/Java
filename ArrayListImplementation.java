// Using the methods of array list class

import java.util.*;

class Num {
    public static void main(String [] args) {
        ArrayList num = new ArrayList ();
        num.add(9);
        num.add(12);
        num.add(10);
        num.add(16);
        num.add(6);
        num.add(8);
        num.add(56);

        // printing array list
        System.out.println("Elements : ");
        num.forEach((s) -> System.out.println(s));

        //getting size
        System.out.println("Size of array list is: ");
        num.size();

        //retrieving specific element
        int n = (Integer) num.get(2);
        System.out.println(n);

        //removing an element
        num.remove(4);

        //printing array list
        System.out.println("Elements : ");
        num.forEach((s) -> System.out.println(s));
    }
}


// LINKED LIST IMPLEMENTATION

//import java.util.Scanner;
class LinkedList {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        List list = new List();
        System.out.println("Enter the number of elements you want to enter in the LL : ");
        int num_elements = s.nextInt();
        int x;
        
        for (int i = 0; i <= num_elements; i++) {
            System.out.println("Enter the element : ");
            x = s.nextInt();
            list.insert(x);
        }
        System.out.println(">>>>> LINKED LIST AFTER INSERTION IS : ");
        list.print();
        int size = list.count();
        System.out.println(">>>>> SIZE OF LL => " + size);

        System.out.println("Enter the node to be inserted in the middle: ");
        int mid_element = s.nextInt();
        list.insertMiddle(mid_element);
        System.out.println(">>>>> LL AFTER INSERTING THE NEW ELEMENT IN THE MIDDLE ");
        list.print();
    }
}

