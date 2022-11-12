package ModelElements;

import java.lang.ProcessBuilder.Redirect.Type;

public class Scene {
    public int id;
    public PoligonalModel models;
    public Flash flashes;
    public Camera cameras;

    public Scene(int id, PoligonalModel models, Flash flashes, Camera cameras){
        this.id = id;
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;
    }
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id= getId();
    }

    public PoligonalModel getModels(){
        return models;
    }
    public void setModels(PoligonalModel models){
        this.models = getModels();
    }

    public Flash getFlashes(){
        return flashes;
    }
    public void setFlashes(Flash flashes){
        this.flashes = getFlashes();
    }

    public Camera getCameras(){
        return cameras;
    }
    public void setCameras(Camera cameras){
        this.cameras = getCameras();
    }

    public Type method1(Type type){
        return type;
    }
    public Type method2(Type type, Type type2){
        return type;
    }
}
