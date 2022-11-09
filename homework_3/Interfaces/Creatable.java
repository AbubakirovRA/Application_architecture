package Interfaces;
import Figures.Circle;
import Figures.Rectangle;
import Figures.Square;
import Figures.Triangle;

public interface Creatable {
    Square createSquare(double length);
    Rectangle createRectangle(double length, double width);
    Circle createCircle(double radius);
    Triangle createTriangle(double sideA, double sideB, double sideC);

}
