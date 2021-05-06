package ClasseAnimal2;
import ClasseAnimal.Peixe;

public class Zoologico {
    public static void main(String[] args) {
        
        Peixe palhaço = new Peixe("Palhaço", 0.15, 0, "Laranja e branco", "Oceano", "Preta");      
        Mamifero pitbull = new Mamifero("Pitbull", 1.10, 4, "Branco", "Doméstico", "Ração");

         System.out.println(palhaço);
         System.out.println(pitbull);
    }
}
