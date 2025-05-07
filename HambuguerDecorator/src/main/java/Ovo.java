public class Ovo extends HamburguerDecorator{

    public Ovo (Hamburguer hamburguer){
        super(hamburguer);
    }
    public float getValorAcrescimo(){
        return 2.0f;
    }
}