package InMemoryModel;

import java.util.ArrayList;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

public class ModelStore implements IModelChanger{
    public ArrayList<PoligonalModel> models;
    public ArrayList<Scene> scenes;
    public ArrayList<Flash> flashes;
    public ArrayList<Camera> cameras;
    
    private ArrayList<IModelChangedObserver> changeObservers;

    public ArrayList<Scene> getScene(int i){
        return scenes;
    }
    
    public void NotifyChange(IModelChanger sender){}
    
}
