package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorBrasileiroTest {

    @Test
    void deveRetornarJogouBem() {
        JogadorBrasileiro jogador = new JogadorBrasileiro();
        jogador.setValor1(6.0f);
        jogador.setValor2(6.0f);
        assertEquals("Jogou Bem", jogador.verificarStatus());
    }

    @Test
    void deveRetonarJogouMal() {
        JogadorBrasileiro jogador = new JogadorBrasileiro();
        jogador.setValor1(6.0f);
        jogador.setValor2(5.9f);
        assertEquals("Jogou Mal", jogador.verificarStatus());
    }

    @Test
    void deveRetornarInformacoes() {
        JogadorBrasileiro jogador = new JogadorBrasileiro();
        jogador.setValor1(6.0f);
        jogador.setValor2(5.9f);
        jogador.setNome("Marcelo");
        jogador.setId(2);
        assertEquals("Jogador{id=2, nome='Marcelo', status=Jogou Mal}", jogador.getInfo());
    }
}
