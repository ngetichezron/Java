/* 
    A constructor initializes an object on creation
    Have the same name as the class
    Do not have a return type, not even void.
    Cannot be static, abstract or final.

    Constructors can be: 
    1. Non Parametized / Default constructor - invoked automatically even if not declared.
    2. Parametized constructor - used to initialize the fields of the class with predefined
    values from the user.

*/

// Non- Parametized / Default constructor

class Box {
    double width;
    double height;
    double depth;

    // Constructor for the box --->
    Box() {
        System.out.println("Constructing Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    // Compute and return volume
    double volume() {
        return width * height * depth;
    }
}

class BoxVol {
    public static void main(String [] args) {
        // declare, allocate, and initialize Box objects
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume is: " + vol);

        vol = mybox2.volume();
        System.out.println("Volume is: " + vol);
    }
}




// Parametized Constructor
class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    doulbe volume() {
        return height * width * depth;
    }
}

class BoxVolP {
    public static void main(String [] args) {
        Box mybox1 = new Box(10.00,20.00,15.00);
        Box mybox2 = new Box(3,6,9);
        double vol;
        vol = mybox1.volume();
        System.out.println("volume is: ");

        vol = mybox2.volume();
        System.out.println("Volume is: ");
    }
}J