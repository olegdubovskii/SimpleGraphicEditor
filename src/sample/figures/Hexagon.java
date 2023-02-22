package sample.figures;


public class Hexagon extends Figure {

    public Hexagon() {
        super();
    }

    @Override
    public void createDots(Point a, Point b) {
        dots.add(new Point((a.getX()+ b.getX()) / 2.0D, a.getY()));
        dots.add(new Point(b.getX(), a.getY() + Math.abs(a.getY() - b.getY()) / 3.0D));
        dots.add(new Point(b.getX(), b.getY() + Math.abs(a.getY() - b.getY()) / 3.0D));
        dots.add(new Point((a.getX()+ b.getX()) / 2.0D, b.getY()));
        dots.add(new Point(a.getX(), b.getY() - Math.abs(a.getY() - b.getY()) / 3.0D));
        dots.add(new Point(a.getX(), a.getY() + Math.abs(a.getY() - b.getY()) / 3.0D));
    }
}

