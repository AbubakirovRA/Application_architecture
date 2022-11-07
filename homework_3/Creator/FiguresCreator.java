package Creator;
import Interfaces.getFigures;
import Primitives.Circle;
import Primitives.Rectangle;

public class FiguresCreator implements getFigures {

    private static FiguresCreator INSTANCE;
    private FiguresCreator(){};
    public static FiguresCreator getInstance(){
        return INSTANCE == null ? new FiguresCreator() : INSTANCE;
    }

    public Circle getCircle(double radius, String name) {
        return new Circle(radius, name);
    }

    public FiguresCreator getRectangle() {
        return null;
    }

    public Figures getSquare() {
        return null;
    }

    public Figures getTriangle() {
        return null;
    }

    public Figures getCircle() {
        return null;
    }
    
}
