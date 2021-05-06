package ClasseAnimal;
public class Animal {
    protected String nome;
    protected double comprimento;
    protected int qtddepatas;
    protected String cor;
    protected String ambiente;

    protected Animal(String nome, double comprimento, int qtddepatas, String cor, String ambiente) {
        this.nome = nome;
        this.ambiente = ambiente;
        this.qtddepatas = qtddepatas;
        this.cor = cor;
        this.ambiente = ambiente;

    }

    // sets
    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    protected void setQtddepatas(int qtddepatas) {
        this.qtddepatas = qtddepatas;
    }

    protected void setCor(String cor) {
        this.cor = cor;
    }

    protected void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    // gets
    protected String getNome() {
        return this.nome;
    }

    protected double getComprimento() {
        return this.comprimento;
    }

    protected int getQtddepatas() {
        return this.qtddepatas;
    }

    protected String getCor() {
        return this.cor;
    }

    protected String getAmbiente() {
        return this.ambiente;
    }

    @Override
    public String toString() {
        return "Nome:" + getNome() + "\nComprimento: " + getComprimento() + "\nQuantidade de patas: " + getQtddepatas()
                + "\nCor: " + getCor() + "\nAmbiente: " + getAmbiente();

    }

}
