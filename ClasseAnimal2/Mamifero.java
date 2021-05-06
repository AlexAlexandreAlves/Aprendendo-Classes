package ClasseAnimal2;
import ClasseAnimal.Animal;

public class Mamifero extends Animal {
    private String alimento;

    public Mamifero(String nome, double comprimento, int qtddepatas, String cor, String ambiente, String alimento) {
        super(nome, comprimento, qtddepatas, cor, ambiente);
        this.alimento = alimento;
    }

    // Sets
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    // Gets
    public String getAlimento() {
        return alimento;
    }

    @Override 
    public String toString() {
        String toPrint = "  Mamifero  \n";
        toPrint += super.toString();
        toPrint += "\nAlimento:  " + getAlimento();
        
        return toPrint;
    }
}
