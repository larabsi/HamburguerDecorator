
public class Carne extends HamburguerDecorator{

    public Carne (Hamburguer hamburguer){
        super(hamburguer);
    }
    public float getValorAcrescimo(){
        return 5.0f;
    }
    public String getNomeEstrutura() {
        return "Carne";
    }
}