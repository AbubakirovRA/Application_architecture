package ModelElements;

import ModelElements.undefinedClasses.Angle3D;
import ModelElements.undefinedClasses.Color;
import ModelElements.undefinedClasses.Point3D;

public class Flash{
    public Point3D location;
    public Angle3D angle3d;
    public Color color;
    public float power;

    public Flash(Point3D location, Angle3D angle3d, Color color, float power){
        this.location = location;
        this.angle3d = angle3d;
        this.color = color;
        this.power = power;
    }

    public Angle3D getAngle3d() {
        return angle3d;
    }  
    public void rotate(Angle3D angle3d){
        System.out.println("Rotate Flash on degrees:");
        this.angle3d = getAngle3d();
    }
    
    public Point3D getLocation() {
        return location;
    }
    public void move(Point3D point3d){
        System.out.println("Move Flash to location: ");
        this.location = getLocation();
    }

    public Color getColor() {
        return color;
    }    
    public void setColor(Color color) {
        this.color = getColor();
    }

    public float getPower() {
        return power;
    }    
    public void setPower(float power) {
        this.power = getPower();
    }

}
