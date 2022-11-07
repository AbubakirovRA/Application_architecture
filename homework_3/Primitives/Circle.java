package Primitives;

public class Circle extends Figures {

    protected double radius;

    public  Circle(double radius, String name){
        this.radius = radius;
        this.name = name;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(){
        this.radius = radius;
    }


    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
}
