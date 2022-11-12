package ModelElements;

import java.util.HashSet;

import ModelElements.undefinedClasses.Point3D;

public class Poligon {

    // public Point3D points;
    // вариант задания координат полигона через задание множества уникальных точек HashSet
    private HashSet<Point3D> points;

    public Poligon(HashSet<Point3D> points){
        this.points = points;
    }

    public HashSet<Point3D> getPoints(){
        return points;
    }
    public void setPoint(Point3D point){
        this.points.addAll(points);
    }
    public void delPoint(Point3D point){
        this.points.remove(point);
    }
}