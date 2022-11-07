package Primitives;

public class Square extends Figures{
    private String name;
    private int sideA;
    
    public Square (){
        this.name = name;
        this.sideA = sideA;
    };

    public double getSideA(){
        return sideA;
    }

    public void setSideA(){
        this.sideA = sideA;
    }

    @Override
    public double getPerimeter() {
        return sideA * 4;
    }

    @Override
    public double getArea() {
        return sideA * sideA;
    }
    
}
