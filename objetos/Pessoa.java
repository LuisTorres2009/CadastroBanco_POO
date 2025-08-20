package objetos;

public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;

    // Getters e setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    // Métodos que podem ser sobrescritos
    public void gravar() { System.out.println("Gravando pessoa..."); }
    public void editar() { System.out.println("Editando pessoa..."); }
    public void excluir() { System.out.println("Excluindo pessoa..."); }
    public void cancelar() { System.out.println("Cancelando operação..."); }
}