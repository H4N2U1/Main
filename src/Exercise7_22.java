abstract class Shape {
    Point p;
    Shape() { this(new Point(0,0)); }
    Shape(Point p) { this.p = p; }
    abstract double calcArea();
    Point getPosition() { return p; }
    void setPosition(Point p) { this.p = p; }
}
class Point {
    int x; int y;
    Point() { this(0,0); }
    Point(int x, int y) { this.x=x; this.y=y; }
    public String toString() {
        return "["+x+","+y+"]";
    }
}
class Circle extends  Shape {
    double r;
    final double PI=3.14;
    public Circle(int x) { this.r=x; }
    double calcArea() {
        return PI * r * r;
    }
}
class Rectangle extends Shape {
    double width; double height;
    public Rectangle(int x, int y) {
        this.width=x; this.height=y;
    }
    public  boolean isSquare() {
        if(this.width == this.height)
            return true;
        else
            return false;
    }
    public double calcArea() {
        return width*height;
    }
}
class Exercise7_22 {
    public static void main(String args[]) {
    }
}