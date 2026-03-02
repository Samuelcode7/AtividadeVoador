import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Voador[] listaDeVoadores = new Voador[10];
        Random gerador = new Random();

        for (int i = 0; i < 10; i++) {
            int sorteio = gerador.nextInt(3);
            
            if (sorteio == 0) {
                listaDeVoadores[i] = new Passaro("Galinha Voadora");
            } else if (sorteio == 1) {
                listaDeVoadores[i] = new Passaro("Drone");
            } else {
                listaDeVoadores[i] = new Passaro("Passaro Sorteado " + i);
            }
        }

        System.out.println("--- INICIANDO TESTE DE VOO ---");
        for (Voador v : listaDeVoadores) {

            v.voar();
            v.planar();
            v.pousar();
            
            System.out.println("-----------------------------");
        }
    }
}
