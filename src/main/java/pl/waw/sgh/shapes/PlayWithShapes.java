package pl.waw.sgh.shapes;

public class PlayWithShapes {

    public static void main(String[] args) {
        Rectangle r1=new Rectangle(6, 8);
        System.out.println("R1: " + r1);
        System.out.println("Surface of R1: " + r1.calcSurface());
        System.out.println("Perimeter of R1: " + r1.calcPerimeter());

        Circle c1=new Circle(5);
        System.out.println("C1: " + c1);
        System.out.println("Surface C1: " + c1.calcSurface());

        Triangle t1=new Triangle(8, 4, 6, 4);
        System.out.println("T1: " + t1);
        System.out.println("Surface T1: " + t1.calcSurface());
        System.out.println("Perimeter T1: " + t1.calcPerimeter());

        Square s1=new Square(10);
        System.out.println("S1: " + s1);
        System.out.println("Surface S1: " + s1.calcSurface());
        System.out.println("Perimeter S1: " + s1.calcPerimeter());

        EquilateralTriangle et1=new EquilateralTriangle(6);
        System.out.println("ET1: " + et1);
        System.out.println("Surface ET1: " + et1.calcSurface());
        System.out.println("Perimeter ET1: " + et1.calcPerimeter());
    }
}
