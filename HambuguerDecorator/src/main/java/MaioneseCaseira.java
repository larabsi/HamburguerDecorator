public class MaioneseCaseira extends HamburguerDecorator{

    public MaioneseCaseira (Hamburguer hamburguer){
        super(hamburguer);
    }
    public float getValorAcrescimo(){
        return 3.0f;
    }
}