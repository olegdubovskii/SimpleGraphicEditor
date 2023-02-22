package sample.figures;


public class Rectangle extends Figure {


    public Rectangle() {
        super();
    }

    @Override
    public void createDots(Point a, Point b) {
        dots.add(a);
        dots.add(new Point(b.getX(), a.getY()));
        dots.add(b);
        dots.add(new Point(a.getX(), b.getY()));
    }
}






