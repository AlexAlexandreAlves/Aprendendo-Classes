package ClasseAnimal;
public class Peixe extends Animal {
    private String escamas;

    public Peixe(String nome, double comprimento, int qtddepatas, String cor, String ambiente, String escamas) {
       super(nome, comprimento, qtddepatas, cor, ambiente);
        this.escamas = escamas;
    }

    // Sets
    public void setEscamas(String escamas) {
        this.escamas = escamas;
    }

    // Gets
    public String getEscamas() {
        return escamas;
    }

    @Override 
    public String toString() {
        String toPrint = "  Peixe  \n";
        toPrint += super.toString();
        toPrint += "\nEscamas:  " + getEscamas();
        
        return toPrint;
    }

}
