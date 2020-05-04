package pl.waw.sgh.shapes;

public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(double a) {super(a, a, a, (a*Math.sqrt(3))/2);}

    public double calcSurface() {return ((Math.pow(parA, 2))*Math.sqrt(3))/4;}

    public double calcPerimeter() {return 3*parA;}
}
