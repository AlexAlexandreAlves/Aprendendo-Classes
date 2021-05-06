package ClasseUsuario;
public class Loja {
    public static void main(String[] args) {

        Encarregado encarregado1 = new Encarregado("Comercial", "R$10000", "Joaquim Fernandez", "vaimessi");
        Cliente cliente1 = new Cliente(89225451, "Rua das palmeiras", 155, 34256987, "Robson Junior", "pedalarobinho");
        Funcionario funcionario1 = new Funcionario("Administrativo", 3000.0, "Clodoaldo Silva", "abc211");

        System.out.println(encarregado1);
        System.out.println(cliente1);
        System.out.println(funcionario1);

    }

}
