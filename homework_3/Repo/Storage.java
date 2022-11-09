package Repo;
import java.util.ArrayList;
import Figures.Figures;
import Interfaces.Calculable;
import Interfaces.Saveable;

public class Storage implements Saveable,  Calculable{
    protected ArrayList<Figures> figures;

    public Storage(){
        this.figures = new ArrayList<>();
    }

    @Override
    public void add(Figures figure) {
        figures.add(figure);
    }

    @Override
    public void del(Figures figure) {
        figures.remove(figure);
    }

    @Override
    public ArrayList<Figures> getAllFigures() {
        return figures;
    }

    @Override
    public String getAllPerimeters(){
        StringBuilder sb = new StringBuilder();
        for (Figures figure : figures) {
            sb.append(String.format("Figure: %s %s\n", figure.tittle(), figure.printPerimeter()));
        }
        return sb.toString();
    }

    @Override
    public String getAllAreas(){
        StringBuilder sb = new StringBuilder();
        for (Figures figure : figures) {
            sb.append(String.format("Figure: %s %s\n", figure.tittle(), figure.printArea()));
        }
        return sb.toString();
    }
    
}
