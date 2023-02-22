package sample.figures;

import javafx.scene.canvas.GraphicsContext;

public class Rhombus extends Figure {

    public Rhombus() {
        super();
    }

    @Override
    public void createDots(Point a, Point b) {
        dots.add(new Point((a.getX() + b.getX()) / 2.0D, a.getY()));
        dots.add(new Point(a.getX(), (a.getY() + b.getY()) / 2.0D));
        dots.add(new Point((a.getX() + b.getX()) / 2.0D, b.getY()));
        dots.add(new Point(b.getX(), (a.getY() + b.getY()) / 2.0D));
    }
}

