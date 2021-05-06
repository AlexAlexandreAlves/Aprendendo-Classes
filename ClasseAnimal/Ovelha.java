package ClasseAnimal;
public class Ovelha extends Animal2 {
    private String corDala;

    public Ovelha(String corDala, String nome, int numerodepatas) {
        super(nome, numerodepatas);
        this.corDala = corDala;

    }

    // Sets
    public void setCorDala(String corDala) {
        this.corDala = corDala;
    }

    // Gets
    public String getCorDala() {
        return corDala;
    }

    @Override
    public void emitirSom() {
        System.out.println(" Behhhhhhh ");
    }

    @Override
    public String toString() {
        return "A ovelha possui a lã de cor : " + getCorDala() +
        "\nO nome: " + getNome() + "\nNúmero de patas: " + getNumerodepatas();

    }
}
