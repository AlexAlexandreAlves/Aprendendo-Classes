package ClasseUsuario;
public class Cliente extends Usuario {
    private int cep;
    private String endereco;
    private int numero;
    private int telefone;

    public Cliente(int cep, String endereco, int numero, int telefone, String nome, String senha) {
        super(nome, senha);
        this.cep = cep;
        this.endereco = endereco;
        this.numero = numero;
        this.telefone = telefone;
    }

    // sets
    public void setCep(int cep) {
        this.cep = cep;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    // gets
    public int getCep() {
        return this.cep;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public int getNumero() {
        return this.numero;
    }

    public int getTelefone() {
        return this.telefone;
    }

    @Override
    public String toString() {
        return "O cliente de nome " + getNome() + " e senha: " + getSenha() + " possui o cep " + getCep()
                + " no endereço " + getEndereco() + " de número " + getNumero() + " e telefone " + getTelefone();

    }

}
