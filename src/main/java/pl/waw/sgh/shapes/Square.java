package pl.waw.sgh.shapes;

public class Square extends Rectangle {

    public Square(double a) {super(a, a);}

    public double calcSurface() {return Math.pow(parA, 2);}

    public double calcPerimeter() {return 4*parA;}
}
