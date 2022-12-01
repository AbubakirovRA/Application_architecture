package ModelElements;

import java.util.ArrayList;

public class PoligonalModel {

    public ArrayList<Poligon> poligons;
    public ArrayList<Texture> textures;

    public PoligonalModel(ArrayList<Poligon>  poligons, ArrayList<Texture> textures){
        this.poligons = poligons;
        this.textures = textures;
    }

    public ArrayList<Poligon> getPoligon(){
        return poligons;
    }
    public void setPoligon(ArrayList<Poligon> poligon){
        this.poligons = getPoligon();
    }

    public ArrayList<Texture> getTexture(){
        return textures;
    }
    public void setTexture(ArrayList<Texture> texture){
        this.textures = getTexture();
    }
}