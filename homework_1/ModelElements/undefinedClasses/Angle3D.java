package ModelElements.undefinedClasses;

public class Angle3D {//Трехгранный угол имеет вершину и три плоских угла при вершине
    protected Point3D top; //Сумма всех углов меньше 360
    protected double cornerA;
    protected double cornerB;
    protected double cornerC;

    public Angle3D(Point3D top, double cornerA, double cornerB, double cornerC){
        this.top = top;
        this.cornerA = cornerA;
        this.cornerB = cornerB;
        this.cornerC = cornerC;
    }

    public Point3D getTop(){
        return top;
    }
    public void setTop(){
        this.top = getTop();
    }

    public double getCornerA(){
        return cornerA;
    }
    public void setCornerA(){
        this.cornerA = getCornerA();
    }

    public double getCornerB(){
        return cornerB;
    }
    public void setCornerB(){
        this.cornerB = getCornerB();
    }

    public double getCornerC(){
        return cornerC;
    }
    public void setCornerC(){
        this.cornerC = getCornerC();
    }

}
