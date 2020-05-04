package pl.waw.sgh.shapes;

public class Rectangle extends Shape implements PerimeterCalculation {

    public Rectangle(double a, double b) {super(a, b, 0, 0);}

    public double calcSurface() {return this.parA*parB;}

    @Override
    public double calcPerimeter() {return 2*parA + 2*parB;}
}
