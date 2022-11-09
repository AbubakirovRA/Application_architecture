import Interfaces.Creatable;
import Interfaces.Saveable;
import Repo.Storage;

import Factory.FiguresCreator;
import Figures.Rectangle;
import Figures.Square;
import Interfaces.Calculable;

public class Program {
    public static void main(String[] args) {

        Creatable maker = FiguresCreator.runCreator();
        Saveable figures = new Storage();

        figures.add(maker.createRectangle(2, 12));
        figures.add(maker.createRectangle(7, 22));
        figures.add(maker.createSquare(7));
        figures.add(maker.createCircle(8));
        figures.add(maker.createTriangle(3, 1, 3));
        
        System.out.println();
        System.out.print("Calculate all figures perimeters: \n" + ((Calculable) figures).getAllPerimeters());
        System.out.println();
        System.out.print("Calculate all figures areas: \n" + ((Calculable) figures).getAllAreas());
    }

}
