
public class Tomate extends HamburguerDecorator{

    public Tomate (Hamburguer hamburguer){
        super(hamburguer);
    }
    public float getValorAcrescimo(){
        return 1.0f;
    }
}