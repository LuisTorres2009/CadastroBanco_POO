package objetos;

public class Cliente extends Pessoa {
    @Override
    public void gravar() {
        System.out.println("Gravando Cliente...");
    }
    
    @Override
    public void editar() { 
        System.out.println("Editando Cliente..."); 
    }
    
    @Override
    public void excluir() { 
        System.out.println("Excluindo Cliente..."); 
    }
    
    @Override
    public void cancelar() { 
        System.out.println("Cancelando operação de Cliente...");
    }
}