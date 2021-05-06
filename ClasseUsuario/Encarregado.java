package ClasseUsuario;
public class Encarregado extends Usuario {
    private String setor;
    private String orcamento;

    public Encarregado(String setor, String orcamento, String nome, String senha) {
        super(nome, senha);
        this.setor = setor;
        this.orcamento = orcamento;
    }

    // sets
    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setOrcamento(String orcamento) {
        this.orcamento = orcamento;
    }

    // gets
    public String getSetor() {
        return this.setor;
    }

    public String getOrcamento() {
        return this.orcamento;
    }

    @Override
    public String toString() {
        return "O Encarregado de nome " + getNome() + " do setor " + getSetor() + " que utiliza a senha: " + getSenha()
                + " gerou o orçamento de: " + getOrcamento();

    }

}