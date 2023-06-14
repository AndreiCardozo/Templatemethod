package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorEuropeuTest {

    @Test
    void deveRetonarJogouBem() {
        JogadorEuropeu jogador = new JogadorEuropeu();
        jogador.setValor1(7.0f);
        jogador.setValor2(7.0f);
        assertEquals("Jogou Bem", jogador.verificarStatus());
    }

    @Test
    void deveRetonarJogouMal() {
        JogadorEuropeu jogador = new JogadorEuropeu();
        jogador.setValor1(7.0f);
        jogador.setValor2(6.9f);
        assertEquals("Jogou Mal", jogador.verificarStatus());
    }

    @Test
    void deveRetornarInformacoes() {
        JogadorEuropeu jogador = new JogadorEuropeu();
        jogador.setValor1(7.0f);
        jogador.setValor2(7.0f);
        jogador.setNome("Marco");
        jogador.setId(1);
        assertEquals("JogadorEuropeu{id=1, nome='Marco', status=Jogou Bem}", jogador.getInfo());
    }
}
