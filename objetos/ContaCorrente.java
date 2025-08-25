package objetos;

public class ContaCorrente extends Conta {
    @Override
    public void gravar() {
        System.out.println("Gravando Conta Corrente...");
    }

    @Override
    public void editar() { 
        System.out.println("Editando Conta Corrente..."); 
    }
    
    @Override
    public void excluir() { 
        System.out.println("Excluindo Conta Corrente..."); 
    }
    
    @Override
    public void cancelar() { 
        System.out.println("Cancelando operação de Conta Corrente...");
    }
}