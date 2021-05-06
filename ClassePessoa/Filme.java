package ClassePessoa;
import java.util.ArrayList;

public class Filme {
    protected int idfilme;
    protected String datalancamento;
    protected Double previsaoinvestimento;
    protected Double custofilme;
    protected ArrayList<Heroi> qtdheroisfilme;

    public Filme(int idfilme, String datalancamento, Double previsaoinvestimento) {

        this.idfilme = idfilme;
        this.datalancamento = datalancamento;
        this.previsaoinvestimento = previsaoinvestimento;
        this.qtdheroisfilme = new ArrayList<>(); // Criação da Array List

    }

    public void addHeroi(Heroi adicionarheroinofilme) { // Método para adicionar heróis na ArrayList
        this.qtdheroisfilme.add(adicionarheroinofilme);
        adicionarheroinofilme.qtdfilmesheroi.add(this);
    }

    public void imprimirHerois() { // Imprimir a quantidade de heróis presente nos filmes
        System.out.println(
                "\nQuantidade de heróis presentes no filme " + this.idfilme + " é: " + this.qtdheroisfilme.size());

    }

    public double valorinvestido() { // Método do valor investido com os Heróis
        Double soma = 0.0;
        for (Heroi heroi : qtdheroisfilme) {
            soma += heroi.preco;
            System.out.println("\nO valor investido com os Heróis no filme " + this.idfilme + " foi: $ " + soma);
        }
        return soma;
    }

    public void valorPrevisto() { // Método para definir margem de lucro ou prejuizo do filme

        System.out.println(
                "\nO valor previsto para a produção do filme " + this.idfilme + " foi de $ " + previsaoinvestimento);
        System.out.println("\nO valor real investido no filme " + this.idfilme + " foi de $ " + valorinvestido());

        if (previsaoinvestimento >= valorinvestido()) {
            System.out.println("\nO filme " + this.idfilme + " lucrou $ " + (valorinvestido() - previsaoinvestimento));
        } else {
            System.out.println(
                    "\nO filme " + this.idfilme + " deu prejuízo de $ " + (valorinvestido() - previsaoinvestimento));
        }

    }
}
