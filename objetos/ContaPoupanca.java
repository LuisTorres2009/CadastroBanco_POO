package objetos;

public class ContaPoupanca extends Conta {
    @Override
    public void gravar() {
        System.out.println("Gravando Conta Poupança...");
    }

    @Override
    public void editar() { 
        System.out.println("Editando Conta Poupança..."); 
    }
    
    @Override
    public void excluir() { 
        System.out.println("Excluindo Conta Poupança..."); 
    }
    
    @Override
    public void cancelar() { 
        System.out.println("Cancelando operação de Conta Poupança...");
    }
}