package sample.figures;

import javafx.scene.canvas.GraphicsContext;

public class DrawingService {

    protected GraphicsContext graphicsContext;
    protected Figure figureForDrawing;


    public DrawingService(Figure figureForDrawing, GraphicsContext graphicsContext) {
        this.graphicsContext = graphicsContext;
        this.figureForDrawing = figureForDrawing;
    }

    public void drawFigure() {
        graphicsContext.beginPath();
        graphicsContext.moveTo(figureForDrawing.dots.get(0).getX(), figureForDrawing.dots.get(0).getY());
        for(int i = 1; i<figureForDrawing.dots.size(); i++) {
            graphicsContext.lineTo(figureForDrawing.dots.get(i).getX(), figureForDrawing.dots.get(i).getY());
        }
        graphicsContext.lineTo(figureForDrawing.dots.get(0).getX(), figureForDrawing.dots.get(0).getY());
        graphicsContext.closePath();
        graphicsContext.stroke();
    }

}
