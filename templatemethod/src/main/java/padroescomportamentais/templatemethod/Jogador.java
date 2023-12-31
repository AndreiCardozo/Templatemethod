package padroescomportamentais.templatemethod;

public abstract class Jogador {

    private int id;
    protected String nome;
    private float valor1;
    private float valor2;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor1() {
        return valor1;
    }

    public void setValor1(float valor1) {
        this.valor1 = valor1;
    }

    public float getValor2() {
        return valor2;
    }

    public void setValor2(float valor2) {
        this.valor2 = valor2;
    }

    public float calcularMedia() {
        return (this.valor1 + this.valor2) / 2;
    }

    public abstract String verificarStatus();

    public String getTipo() {
        return "Jogador";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "id=" + this.id +
                ", nome='" + this.nome + '\'' +
                ", status=" + this.verificarStatus() +
                '}';
    }
}
