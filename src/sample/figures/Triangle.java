package sample.figures;

public class Triangle extends Figure {

    public Triangle() {
        super();
    }

    @Override
    public void createDots(Point a, Point b) {
        dots.add(new Point((a.getX() + b.getX()) / 2.0D, a.getY()));
        dots.add(new Point(a.getX(), b.getY()));
        dots.add(new Point(b.getX(), a.getY()));
    }
}
