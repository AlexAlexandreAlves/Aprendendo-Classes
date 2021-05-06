package ClasseAnimal;
public class Animal2 {
   protected String nome;
    protected int numerodepatas;        

    protected Animal2(String nome, int numerodepatas) {
        this.nome = nome;
        this.numerodepatas = numerodepatas;

    }

    // Sets
    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected void setNumerodepatas(int numerodepatas) {
        this.numerodepatas = numerodepatas;
    }

    // Gets
    protected String getNome() {
        return nome;
    }

    protected int getNumerodepatas() {
        return numerodepatas;
    }

    protected void emitirSom() {
        System.out.println("Som desconhecido");
      } 

      
    @Override
      public String toString() {
          return " Nome: " + this.nome +
        " Numero de patas: " + numerodepatas;
      }

}
