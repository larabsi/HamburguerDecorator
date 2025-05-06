
public class Tomate extends HamburguerDecorator{

    public Tomate (Hamburguer hamburguer){
        super(hamburguer);
    }
    public float getValorAcrescimo(){
        return 2.0f;
    }
    public String getNomeEstrutura() {
        return "Tomate";
    }
}
