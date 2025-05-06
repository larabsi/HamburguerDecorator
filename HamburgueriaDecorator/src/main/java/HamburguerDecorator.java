public abstract class HamburguerDecorator implements Hamburguer {

    private Hamburguer hamburguer;
    public String estrutura;

    public HamburguerDecorator(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    public Hamburguer getHamburguer() {
        return hamburguer;
    }

    public void setHamburguer(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    public abstract float getValorAcrescimo();

    public float getValorTotal() {
        return this.hamburguer.getValorTotal() + (this.getValorAcrescimo());
    }

    public abstract String getNomeEstrutura();

    public String getEstrutura() {
        return this.hamburguer.getEstrutura() + "/" + this.getNomeEstrutura();
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }






}
