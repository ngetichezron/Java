/*
    A class's interface can be fully abstracted from its implementation
    using the "interface" keyword.
    They are similar to class except they lack the instance variables and 
    their methods are declared without any body.
    Several classes can implement an interface.

    Interfaces are used to implement multiple inheritances.
    Variables are public, final and static.
    A class must create a complete set of methods as defined by an interface
    to implement an interface.
    Classes implementing interfaces can define methods of their own.

*/

interface Area {
    final static float pi = 3.14f;
    float compute(float x, float y);
}

class Rectangle implements Area {
    public float compute(float x, float y) {
        return(x*y);
    }
}

class Circle implements Area {
    public float compute(float x, float y) {
        return (pi * x * x);
    }
}

class InterfaceTest {
    public static void main(String [] args) {
        float x = 2.0F;
        float y = 6.0F;

        Rectangle rect = new Rectangle();
        Circle cir = new Circle();

        float result1 = rect.compute(x,y);
        System.out.println("Area of Rectangle = " + result1);

        float result2 = cir.compute(x,y);
        System.out.println("Area of circle = " + result2);
    }
}

