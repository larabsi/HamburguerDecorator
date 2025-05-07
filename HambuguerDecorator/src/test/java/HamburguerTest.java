import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HamburguerTest {
    @Test
    void deveRetornarValorHamburguer() {
        Hamburguer hamburguer = new HamburguerSimples(13.0f);

        assertEquals(13.0f, hamburguer.getValorTotal());
    }

    @Test
    void deveRetornarHamburguerComTomate() {
        Hamburguer hamburguer = new Tomate(new HamburguerSimples(13.0f));

        assertEquals(14.0f, hamburguer.getValorTotal());
    }

    @Test
    void deveRetornarHamburguerComAlface() {
        Hamburguer hamburguer = new Alface(new HamburguerSimples(13.0f));

        assertEquals(13.5f, hamburguer.getValorTotal());
    }

    @Test
    void deveRetornarHamburguerComOvo() {
        Hamburguer hamburguer = new Ovo(new HamburguerSimples(13.0f));

        assertEquals(15.0f, hamburguer.getValorTotal());
    }

    @Test
    void deveRetornarHamburguerComMaioneseCaseira() {
        Hamburguer hamburguer = new MaioneseCaseira(new HamburguerSimples(13.0f));

        assertEquals(16.0f, hamburguer.getValorTotal());
    }

    @Test
    void deveRetornarHamburguerComCarneExtra() {
        Hamburguer hamburguer = new Carne(new HamburguerSimples(13.0f));

        assertEquals(18.0f, hamburguer.getValorTotal());
    }


    @Test
    void deveRetornarHamburguerComCarneExtraMaisMussarela() {
        Hamburguer hamburguer = new Carne(new Mussarela(new HamburguerSimples(13.0f)));

        assertEquals(20.0f, hamburguer.getValorTotal());
    }

    @Test
    void deveRetornarHamburguerComSalada() {
        Hamburguer hamburguer = new Tomate(new Alface(new HamburguerSimples(13.0f)));

        assertEquals(14.5f, hamburguer.getValorTotal());
    }

}