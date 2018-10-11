public class Point{

  private double x;
  private double y;

  public Point(double X, double Y){
    x = X;
    y = Y;
  }

  public Point(Point p){
    x = p.x;
    y = p.y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  public double distanceTo(Point p){
    return Math.sqrt(Math.pow(this.x- p.x, 2) + Math.pow(this.y-p.y, 2));
  }

  public static double distance(Point p1, Point p2){
    return Math.sqrt(Math.pow(p1.x-p2.x, 2) + Math.pow(p1.y-p2.y, 2));
  }

  public String toString(){
    return "Point: (" + x + "," + y + ")";
  }
}
