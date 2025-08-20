package objetos;

public class ContaCorrente extends Conta {
    @Override
    public void gravar() {
        System.out.println("Gravando Conta Corrente...");
    }
}