package sample.figures;

public class Trapezium extends Figure {

    public Trapezium() {
        super();
    }

    @Override
    public void createDots(Point a, Point b) {
        dots.add(new Point(a.getX() + Math.abs(a.getX() - b.getX()) / 3.0D, a.getY()));
        dots.add(new Point(b.getX() - Math.abs(a.getX() - b.getX()) / 3.0D, a.getY()));
        dots.add(b);
        dots.add(new Point(a.getX(), b.getY()));
    }
}

