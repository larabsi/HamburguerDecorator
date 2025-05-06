
public class Milho extends HamburguerDecorator{

    public Milho (Hamburguer hamburguer){
        super(hamburguer);
    }
    public float getValorAcrescimo(){
        return 2.0f;
    }
    public String getNomeEstrutura() {
        return "Milho";
    }
}