import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Voador[] lista = new Voador[10];
        Random gerador = new Random();

        for (int i = 0; i < 10; i++) {
           
            lista[i] = new Passaro("Sorteado " + i);
        }

    
        for (Voador v : lista) {
            v.voar(); // 
            System.out.println("---");
        }
    }
}
