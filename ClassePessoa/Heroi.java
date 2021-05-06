package ClassePessoa;
import java.util.ArrayList;

public class Heroi extends Pessoa implements Orcamento {
    protected int idheroi;
    protected String identidade;
    protected int idfranquia;
    protected ArrayList<Filme> qtdfilmesheroi;

    public Heroi(int idheroi, String nome, String localizacao, String identidade, Double preco, int idfranquia) {
        super(nome, localizacao, preco);
        this.idheroi = idheroi;
        this.identidade = identidade;
        this.idfranquia = idfranquia;
        this.qtdfilmesheroi = new ArrayList<>();

    }

    // Sets
    public void setIdheroi(int idheroi) {
        this.idheroi = idheroi;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public void setFranquia(int idfranquia) {
        this.idfranquia = idfranquia;
    }

    // Gets
    public int getIdheroi() {
        return idheroi;
    }

    public String getIdentidade() {
        return identidade;
    }

    public int getIdfranquia() {
        return idfranquia;
    }

    
    public double investimentoTotal() {
    double investimento = super.getPreco() * this.qtdfilmesheroi.size();
    
        return investimento;
    }

    public double totalInvestimentos() {
        double investimento = super.getPreco() * this.qtdfilmesheroi.size();
        return investimento;
    }

    public void imprimirInvestimento() {
        System.out.println(
                "\nO total de investimento do herói " + super.getNome() + " foi de: " + this.totalInvestimentos());

    }

    public void participacaoFilmes() {
        System.out.println( // listar a participação dos heróis nos filmes
                "\nA quantidade de filmes que o herói " + this.idheroi + " participa é: " + this.qtdfilmesheroi.size());

    }

    

}
