package sample.figures;

import java.util.HashMap;
import java.util.Map;

public class FigureDictionary {

    public Map<String, Figure> dictionary;

    public FigureDictionary() {
        dictionary = new HashMap<>();
        dictionary.put("Ellipse", new Ellipse());
        dictionary.put("Triangle", new Triangle());
        dictionary.put("Hexagon", new Hexagon());
        dictionary.put("Trapezium", new Trapezium());
        dictionary.put("Rhombus", new Rhombus());
        dictionary.put("Rectangle", new Rectangle());
    }
}
