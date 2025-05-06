
public class MaioneseCaseira extends HamburguerDecorator{

    public MaioneseCaseira (Hamburguer hamburguer){
        super(hamburguer);
    }
    public float getValorAcrescimo(){
        return 2.0f;
    }
    public String getNomeEstrutura() {
        return "Maionese Caseira";
    }
}