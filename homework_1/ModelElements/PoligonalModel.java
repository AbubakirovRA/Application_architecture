package ModelElements;

public class PoligonalModel {

    public Poligon poligons;
    public Texture textures;

    public PoligonalModel(Poligon poligons, Texture textures){
        this.poligons = poligons;
        this.textures = textures;
    }

    public Poligon getPoligon(){
        return poligons;
    }
    public void setPoligon(Poligon poligon){
        this.poligons = getPoligon();
    }

    public Texture getTexture(){
        return textures;
    }
    public void setTexture(Texture texture){
        this.textures = getTexture();
    }
}