package Primitives;

public class Triangle extends Figures{
    protected double sideA;
    protected double sideB;
    protected double sideC;
    protected String name;

    public Triangle(double sideA, double sideB, double sideC, String name){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.name = name;
    }

    @Override
    public double getPerimeter() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return 0;
    }

}
