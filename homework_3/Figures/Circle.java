package Figures;

public class Circle extends Figures {
    protected double radius;

    public Circle(double radius) {
        this.perimeterTittle = "Circumference: ";
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String tittle(){
        return "Circle: radius " + radius + ".";
    }
    
}
