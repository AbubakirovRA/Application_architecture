package ModelElements.undefinedClasses;

public class Point3D {
    private double x;
    private double y;
    private double z;

    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = getX();
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = getY();
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = getZ();
    }
}