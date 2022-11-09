package Factory;
import Figures.Circle;
import Figures.Rectangle;
import Figures.Square;
import Figures.Triangle;
import Interfaces.Creatable;

public class FiguresCreator implements Creatable{
    private static FiguresCreator INSTANCE;
    private FiguresCreator(){}
    public static FiguresCreator runCreator(){
        return INSTANCE == null ? new FiguresCreator() : INSTANCE;
    }

    @Override
    public Square createSquare(double length) throws IllegalArgumentException{
        if (length <= 0){
            throw new IllegalArgumentException("Zero or negative value was entered!");
        }
        return new Square(length);
    }

    @Override
    public Rectangle createRectangle(double length, double width)throws IllegalArgumentException{
        if (length <= 0 || width <= 0){
            throw new IllegalArgumentException("Zero or negative value was entered!");
        }
        return new Rectangle(length, width);
    }

    @Override
    public Circle createCircle(double radius) throws IllegalArgumentException{
        if (radius <= 0){
            throw new IllegalArgumentException("Zero or negative value was entered!");
        }
        return new Circle(radius);
    }
    @Override
    public Triangle createTriangle(double sideA, double sideB, double sideC) throws IllegalArgumentException{
        double p = (sideA + sideB + sideC) / 2;
        if (sideA * sideB * sideC <= 0 || p * (p - sideA) * (p - sideB) * (p - sideC) <= 0){
            throw new IllegalArgumentException("Incorrect value of triangle sides was entered!");
        }
        return new Triangle(sideA, sideB, sideC);
    }
    
}
