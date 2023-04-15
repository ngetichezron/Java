// Types of Inheritance in Java

class A {
    int i, j;
    void showij() {
        System.out.println("i and j: " + i + " " + j);
    }
}

// Create a subclass by extending A:

class B extends A {
    int k;
    void showk() {
        System.out.println("k: " + k);
    }
    void sum() {
        System.out.println("i + j + k: " + (i + j + k));
    }
}

class SimpleInheritance {
    public static void main(String [] args) {
        A objA = new A();
        B objB = new B();
        
        // The superclass may be used by itself
        objA.i = 10;
        objA.j = 20;
        System.out.println("Contents of objA: ");
        objA.showij();
        System.out.println();

        /* The subclass can access all public members of 
        the superclass */

        objB.i = 7;
        objB.j = 8;
        objB.k = 9;
        System.out.println("Contents of objB: ");
        objB.showij();
        objB.showk();
        System.out.println("Sum of i, j and k in objB is : ");
        objB.sum();

    }
}

/*
    Limitations in inheritance
    Subclass cannot derive private members of the superclass
    Subclass cannot inherit constructors
    There can be one only one superclass to a subclass

    Single inheritance - child class inherits properties & behaviour from a single parent class
    Multi-level inheritance - child class inherits properties from its parent class, which is in
                              is in turn a child class to another parent class.
    Multiple inheritance - This is when a child class has two parent class.
                            This concept is achieved by using interfaces in Java.
    Hierachical inheritance - When a parent class has two child classes inheriting its properties.
    
*/