package ClasseUsuario;
public class Usuario {
    protected String nome;
    protected String senha;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;

    }

    // sets
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    // gets
    public String getNome() {
        return this.nome;
    }

    public String getSenha() {
        return this.senha;
    }

    @Override
    public String toString() {
        return "O usuário de nome " + getNome() + " gerou a senha: " + getSenha();

    }

}
