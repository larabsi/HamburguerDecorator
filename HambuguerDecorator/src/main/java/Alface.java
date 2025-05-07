public class Alface extends HamburguerDecorator{

    public Alface (Hamburguer hamburguer){
        super(hamburguer);
    }
    public float getValorAcrescimo(){
        return 0.5f;
    }

}