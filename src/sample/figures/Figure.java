package sample.figures;

import java.util.ArrayList;


public abstract class Figure implements Cloneable {


    public ArrayList<Point> dots;
    protected String nameOfFigure;


    public Figure() {
        dots = new ArrayList<>();
        this.nameOfFigure = getClass().getSimpleName();
    }


    public abstract void createDots(Point a, Point b);

    @Override
    public Figure clone() throws CloneNotSupportedException {
        Figure newFigure = (Figure) super.clone();
        newFigure.dots = (ArrayList<Point>) this.dots.clone();
        return newFigure;
    }

    public String getNameOfFigure() {
        return nameOfFigure;
    }

    public void setNameOfFigure(String nameOfFigure) {
        this.nameOfFigure = nameOfFigure;
    }
}
