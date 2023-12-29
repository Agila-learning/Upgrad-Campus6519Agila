//Problem Statement..... We have to calculate the area of a rectangle, a square and a circle. 
//Create an class 'Shape' with three methods namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each. 
//The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is its radius. 
//Now create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle respectively.
// Create an object of class 'Area' and call all the three methods

public class Shape {
    
    public double RectangleArea(double length, double breadth) {
        return length * breadth;
    }

    public double SquareArea(double side) {
        return side * side;
    } 

    public double CircleArea(double radius) {
        double pi = 3.14;
        return pi * radius * radius;
    }

    static class Area {
        public double RectangleArea(double length, double breadth) {
            return length * breadth;
        }

        public double SquareArea(double side) {
            return side * side;
        }

        public double CircleArea(double radius) {
            double pi = 3.14;
            return pi * radius * radius;
        }
    }

    public static void main(String[] args) {
        Area a = new Area();
        System.out.println("Area of rectangle is: " + a.RectangleArea(10, 40));
        System.out.println("Area of Square is: " + a.SquareArea(33));
        System.out.println("Area of Circle is: " + a.CircleArea(26));
    }
}
