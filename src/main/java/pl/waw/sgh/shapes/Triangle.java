package pl.waw.sgh.shapes;

public class Triangle extends Shape implements PerimeterCalculation{
    public Triangle(double a, double b, double c, double h) {super(a, b, c, h);}

    @Override
    public double calcSurface() {return (parA*parH)/2;}

    @Override
    public double calcPerimeter() {return parA + parB + parC;}
}
