public class Passaro implements Voador {
    private String especie;

    public Passaro(String especie) {
        this.especie = especie;
    }

    @Override
    public void voar() {
        System.out.println(especie + " voando alto!");
    }

    @Override
    public void planar() {
        System.out.println(especie + " planando no vento...");
    }

    @Override
    public void pousar() {
        System.out.println(especie + " pousou no ninho.");
    }
}
