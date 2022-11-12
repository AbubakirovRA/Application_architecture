package ModelElements;

import ModelElements.undefinedClasses.Picture;

public class Texture {
    protected Picture texture;

    public Texture(Picture texture){
        this.texture = texture;
    }

    public Picture getTexture(){
        return texture; 
    }
    public void setTexture(Picture texture){
        this.texture = getTexture();
    }
}
