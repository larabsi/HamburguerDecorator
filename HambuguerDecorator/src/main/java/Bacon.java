public class Bacon extends HamburguerDecorator{

    public Bacon (Hamburguer hamburguer){
        super(hamburguer);
    }
    public float getValorAcrescimo(){
        return 4.0f;
    }
}