/*
    Superclass only defines a generalized form shared by all of its subclasses
    leaving it to its subclas to implement its methods.
    
*/


abstract class A {
    abstract void callme();
    // Concrete methods are still allowed in abstract class.
    void callmetoo() {
        System.out.println("This is a concrete method ");
    }
}

class B extends A {
    void callme() {
        System.out.println("B's implementation of callme.");
    }
}

class Abstract {
    public static void main(String args[]) {
        B b = new B();
        b.callme();
        b.callmetoo();
    }
}



