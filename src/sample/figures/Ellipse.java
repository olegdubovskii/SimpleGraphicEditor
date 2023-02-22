package sample.figures;


public class Ellipse extends Figure {

    public Ellipse() {
        super();
    }

    @Override
    public void createDots(Point a, Point b) {
        dots.add(a);
        dots.add(b);
    }
}

