public class Passaro implements Voador {
    private String especie;

    public Passaro(String especie) {
        this.especie = especie;
    }

    @Override
    public void voar() {
        System.out.println("Voando alto!");
    }

    public void cantar() {
        System.out.println("Cantando...");
    }
}
