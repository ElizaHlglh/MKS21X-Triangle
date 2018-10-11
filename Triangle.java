public class Triangle{

  private Point v1;
  private Point v2;
  private Point v3;

  public Triangle(Point x, Point y, Point z){
    v1 = new Point(x.getX(),x.getY());
    v2 = new Point(y.getX(),y.getY());
    v3 = new Point(z.getX(),z.getY());
  }

  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
    v1 = new Point(x1,y1);
    v2 = new Point(x2,y2);
    v3 = new Point(x3,y3);
  }

  public double getPerimeter(){
    return v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1);
  }

  public Point getVertex(int index){
    if (index == 0) {
      return v1;
    }
    if (index == 1) {
      return v2;
    }
    else {
      return v3;
    }
  }

  public String toString(){
    return "Triangle: A(" + v1.getX() + "," + v1.getY() + ")  B(" + v2.getX() + "," + v2.getY() + ")  C(" + v3.getX() + "," + v3.getY() + ")";
  }

  public void setVertex(int index, Point newP){
    if (index == 0) {
      v1 = new Point(newP.getX(),newP.getY());
    }
    if (index == 1) {
      v2 = new Point(newP.getX(),newP.getY());
    }
    if (index == 2) {
      v3 = new Point(newP.getX(),newP.getY());
    }
  }

}
