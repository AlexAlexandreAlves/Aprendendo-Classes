package ClasseAnimal;
public class Gato extends Animal2 {

    private String pelo;

    public Gato(String pelo, String nome, int numerodepatas) {
        super(nome, numerodepatas);
        this.pelo = pelo;

    }

    // Sets
    public void setPelo(String pelo) {
        this.pelo = pelo;
    }

    // Gets
    public String getPelo() {
        return pelo;
    }

    @Override
    public void emitirSom() {
        System.out.println(" Miau ");
    }

    @Override
    public String toString() {
        return "O Gato possui o pelo de cor : " + getPelo() +
        "\nO nome: " + getNome() + "\nNúmero de patas: " + getNumerodepatas();
    }

}
