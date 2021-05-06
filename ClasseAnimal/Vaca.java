package ClasseAnimal;
public class Vaca extends Animal2 {
    private String leite;

    public Vaca(String leite, String nome, int numerodepatas) {
        super(nome, numerodepatas);
        this.leite = leite;

    }

    // Sets
    public void setLeite(String leite) {
        this.leite = leite;
    }

    // Gets
    public String getLeite() {
        return leite;
    }

    @Override
    public void emitirSom() {
        System.out.println(" Muuh ");
    }
    
    @Override
    public String toString() {
        return "A vaca possui o tipo do leite  : " + getLeite() +
        "\nO nome: " + getNome() + "\nNúmero de patas: " + getNumerodepatas();

    }
}
