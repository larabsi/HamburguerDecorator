public class Mussarela extends HamburguerDecorator{

    public Mussarela (Hamburguer hamburguer){
        super(hamburguer);
    }
    public float getValorAcrescimo(){
        return 2.0f;
    }
}