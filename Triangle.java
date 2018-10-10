public class Triangle{
  private Point v1;
  private Point v2;
  private Point v3;

  public Triangle(Point x, Point y, Point z){
    v1 = new Point x;
    v2 = new Point y;
    v3 = new Point z;
  }

  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
    v1 = Point(x1,y1);
    v2 = Point(x2,y2);
    v3 = Point(x3,y3);
  }

  public double getPerimeter(){
    side1 = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
    side2 = Math.sqrt(Math.pow(x2-x3, 2) + Math.pow(y2-y3, 2));
    side3 = Math.sqrt(Math.pow(x1-x3, 2) + Math.pow(y1-y3, 2));
    return side1 + side2 + side3;
  }

  public Point getVertex(int index){
    if (index == 0) {
      return v1;
    }
    if (index == 1) {
      return v2;
    }
    if (index == 2) {
      return v3;
    }
  }

  public String toString(){
    return "Triangle: A(" + v1.x + "," + v1.y + ")  B(" + v2.x + "," + v2.y + ")  C(" + v3.x + "," + v3.y + ")";
  }

  public void setVertex(int index, Point newP){
    if (index == 0) {
      v1 = new newP;
    }
    if (index == 1) {
      v2 = new newP;
    }
    if (index == 2) {
      v3 = new newP;
    }
  }
}
