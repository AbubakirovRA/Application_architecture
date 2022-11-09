package Interfaces;
import java.util.ArrayList;
import Figures.Figures;

public interface Saveable {
    void add(Figures figure);
    void del(Figures figure);
    ArrayList<Figures> getAllFigures(); 
}
