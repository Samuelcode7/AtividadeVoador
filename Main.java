import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Voador[] lista = new Voador[10];
        Random gerador = new Random();

        for (int i = 0; i < 10; i++) {
            // Sorteia e preenche a lista
            lista[i] = new Passaro("Sorteado " + i);
        }

        // Percorrendo e fazendo chamadas polimorficas
        for (Voador v : lista) {
            v.voar(); // Isso e Polimorfismo!
            System.out.println("---");
        }
    }
}
