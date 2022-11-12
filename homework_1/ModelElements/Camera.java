package ModelElements;

import ModelElements.undefinedClasses.Angle3D;
import ModelElements.undefinedClasses.Point3D;

public class Camera{
    public Point3D location;
    public Angle3D angle3d;
    
    public Camera(Point3D location, Angle3D angle3d){
        this.location = location;
        this.angle3d = angle3d;
    }

    public Angle3D getangle3d() {
        return angle3d;
    }    
    public void rotate(Angle3D angle3d){
        System.out.println("Rotate Cam on degrees");
        this.angle3d = getangle3d();
    }

    public Point3D getLocation() {
        return location;
    }
    public void move(Point3D point3d){
        System.out.println("Move Camera to location: ");
        this.location = getLocation();
    }

}
