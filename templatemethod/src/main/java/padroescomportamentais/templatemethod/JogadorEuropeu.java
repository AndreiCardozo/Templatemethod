package padroescomportamentais.templatemethod;

public class JogadorEuropeu extends Jogador {

    public String verificarStatus() {
        if (this.calcularMedia() >= 7.0f) {
            return "Jogou Bem";
        } else {
            return "Jogou Mal";
        }
    }
    @Override
    public String getTipo() {
        return "JogadorEuropeu";
    }

}
