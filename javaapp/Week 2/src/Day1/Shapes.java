package Day2;

public class Shapes {
    public void area(Circle circle)
    {
        System.out.println("Are of circle is " + circle.radius*circle.radius);
    };
    public void area(Rectangle rectangle){
        System.out.println("Area of rectangle" + rectangle.length*rectangle.breadth);
    };
    public void area(Square square){
        System.out.println("Area of square " + square.length*square.length*square.length*square.length);
    };
}

class Circle{
        int radius;
}
class Rectangle{
    int length;
    int breadth;
}

class Square{
    int length;
}

class Main{
    public static void main(String[] args) {
        Shapes s = new Shapes();
        Circle c1 = new Circle();
        c1.radius = 10;
        s.area(c1);

        Rectangle r = new Rectangle();
        r.length=5;
        r.breadth = 5;
        s.area(r);


        Square sq = new Square();
        sq.length=7;
        s.area(sq);
    }
}

