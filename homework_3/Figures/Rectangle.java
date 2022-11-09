package Figures;

public class Rectangle extends Figures {
    protected double length;
    protected double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public String tittle(){
        return "Rectangle with sides: " + length + " x " + width + ".";
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
    
}
