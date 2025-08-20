package objetos;

public class Cliente extends Pessoa {
    @Override
    public void gravar() {
        System.out.println("Gravando cliente no sistema...");
    }
}