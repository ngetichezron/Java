class Shape {
    void area() {
        System.out.println("Area of the following shapes are: ");
    }
}

class Square extends Shape {
    void area(int length) {
        int area = length * length;
        System.out.println("Area of square: " + area);
    }
}

class Rectangle extends Shape {
    void area (int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Circle extends Shape {
    void area(int breadth) {
        float area = 3.14f * breadth * breadth;
        System.out.println("Area of circle: " + area);
    }
}

class InheritanceOverload {
    public static void main(String [] args) {
        int length = 5;
        int breadth = 7;

        // Creating objects of respective child classes.
        Shape s = new Shape();
        Square sq = new Square();
        Rectangle rect = new Rectangle();
        Circle cir = new Circle();

        // Calling the area methods of all child classes to get the area  of different objects.
        s.area();
        sq.area(length);
        rect.area(length, breadth);
        cir.area(breadth);

    }
}
