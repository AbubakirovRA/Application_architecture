package InMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

public class ModelStore implements IModelChanger{
    public PoligonalModel models;
    public Scene scenes;
    public Flash flashes;
    public Camera cameras;
    
    private IModelChangedObserver changedObservers;

    public Scene getScene(int i){
        return scenes;
    }
    
    public void NotifyChange(IModelChanger sender){}
    
}
