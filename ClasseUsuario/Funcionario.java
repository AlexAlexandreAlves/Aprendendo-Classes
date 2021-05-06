package ClasseUsuario;

public class Funcionario extends Usuario {
    private String setor;
    private double salario;

    public Funcionario(String setor, double salario, String nome, String senha) {
        super(nome, senha);
        this.setor = setor;
        this.salario = salario;

    }

    // sets
    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // gets
    public String getSetor() {
        return this.setor;
    }

    public double getSalario() {
        return this.salario;
    }

    @Override
    public String toString() {
        return "O Funcionário de nome " + getNome() + " do setor " + getSetor() + " utiliza a senha: " + getSenha()
                + " e possui o salário de: R$" + getSalario();

    }

}
