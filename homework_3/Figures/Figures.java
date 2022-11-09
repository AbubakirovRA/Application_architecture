package Figures;

public abstract class Figures{
    protected String perimeterTittle = "Perimeter: ";
    public abstract String tittle();
    public abstract double getArea();
    public abstract double getPerimeter();

    public String printArea() {
        return String.format("Area: %f", getArea());
    }
    public String printPerimeter() {
        return String.format("%s %f", perimeterTittle, getPerimeter());
    }
    
}
