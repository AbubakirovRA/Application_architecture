package ModelElements.undefinedClasses;

public class Picture {
    public Picture picture;

    public Picture(Picture picture){
        this.picture =  picture;
    }

    public Picture getPicture(){
        return picture;
    }
    public void setPicture(Picture picture){
        this.picture = getPicture();
    }
}
