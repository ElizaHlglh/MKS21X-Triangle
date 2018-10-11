public class DriverTriangle{
  public static void main(String[]args){
    Point p1 = new Point(0.0,0.0);
    Point p2 = new Point(3.0,0.0);
    Point p3 = new Point(0.0,4.0);
    Triangle one = new Triangle(p1, p2, p3);
    System.out.println(one);

    System.out.println(one.getPerimeter());

    System.out.println(one.getVertex(1));

    Point test = new Point(5.0,0.0);
    one.setVertex(1, test);
    System.out.println(one.getVertex(1));

    p1 = new Point(p2);
    System.out.println(p1);
    System.out.println(Point.distance(p1,p2));
  }
}
