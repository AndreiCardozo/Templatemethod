package padroescomportamentais.templatemethod;

public class JogadorBrasileiro extends Jogador {

    public String verificarStatus() {
        if (this.calcularMedia() >= 6.0f) {
            return "Jogou Bem";
        }
        else {
            return "Jogou Mal";
        }
    }

}


