import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Criando o repositório (array) de 10 voadores
        Voador[] listaDeVoadores = new Voador[10];
        Random gerador = new Random();

        // 1. Sorteio e preenchimento da lista
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

        // 2. Percorrendo a lista e executando as ações
        System.out.println("--- INICIANDO TESTE DE VOO ---");
        for (Voador v : listaDeVoadores) {
            
            // ABAIXO OCORREM AS CHAMADAS POLIMORFICAS (O Java decide o comportamento no runtime)
            v.voar();
            v.planar();
            v.pousar();
            
            System.out.println("-----------------------------");
        }
    }
}
