package Figures;

public class Square extends Rectangle{

    public Square(double length) {
        super(length, length);
    }
    
    @Override
    public double getArea(){
        return length * length;
    }

    @Override
    public double getPerimeter(){
        return 4 * length;
    }

    @Override
    public String tittle(){
        return "Square with sides: " + length + " x " + length + ".";
    }
}
