public class StaticHw {
    // static variable for pi
    static double pi = 3.14;

    // instance variable for radius
    double radius;

    // constructor
    StaticHw(double r) {
        radius = r;
    }

    // method to calculate area
    double area() {
        return pi * radius * radius;
    }

    // main method to run the program
    public static void main(String[] args) {
        StaticHw circle1 = new StaticHw(5.0);
        System.out.println("Radius: " + circle1.radius);
        System.out.println("Area: " + circle1.area());

        StaticHw circle2 = new StaticHw(10.0);
        System.out.println("Radius: " + circle2.radius);
        System.out.println("Area: " + circle2.area());
    }
}

