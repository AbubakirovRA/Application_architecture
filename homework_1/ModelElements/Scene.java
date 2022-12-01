package ModelElements;

import java.lang.ProcessBuilder.Redirect.Type;
import java.util.ArrayList;

public class Scene {
    public int id;
    public ArrayList<PoligonalModel> models;
    public ArrayList<Flash> flashes;
    public ArrayList<Camera> cameras;

    public Scene(int id, ArrayList<PoligonalModel> models, ArrayList<Flash> flashes, ArrayList<Camera> cameras){
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

    public ArrayList<PoligonalModel> getModels(){
        return models;
    }
    public void setModels(ArrayList<PoligonalModel> models){
        this.models = getModels();
    }

    public ArrayList<Flash> getFlashes(){
        return flashes;
    }
    public void setFlashes(ArrayList<Flash> flashes){
        this.flashes = getFlashes();
    }

    public ArrayList<Camera> getCameras(){
        return cameras;
    }
    public void setCameras(ArrayList<Camera> cameras){
        this.cameras = getCameras();
    }

    public Type method1(Type type){
        return type;
    }
    public Type method2(Type type, Type type2){
        return type;
    }
}
