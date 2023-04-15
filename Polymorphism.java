/*
    Polymorphism - ability to take more than one form.
    Allows creating clean and readable code.
    *method overloading*, *method overriding*

*/

// Method overriding
/*
    When a method in the child class has the same name and type
    as a method in the parent class
    Method in the child class is said to override the method in the parent class

*/

class ParentMath {
    void area() {
        int a = 2;
        System.out.println("Area of a square with side two = %d %n", a * a);
        System.out.println();
    }
}

class ChildMath extends ParentMath {
    void area() {
        int a = 4;
        System.out.println("Area of a square with side 4 = %d %n", a * a);
    }

    public static void main(String [] args) {
        ChildMath obj = new ChildMath();
        obj.area();
    }
}


// Method overloading
/*
    Two or more methods in the same class sharing the same name, different args declaration.
    Referred to as overloaded, the process is called overloading.
    Three ways to overload a method:
    1. Change no. of parameters
    2. Change the datatype of the parameters.
    3. Change the sequence of the data type of parameters i.e
        add(int, float)
        add(float, int)

*/