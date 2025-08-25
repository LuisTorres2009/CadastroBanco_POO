package funcoes;

import objetos.*;
import telas.Janela;

import javax.swing.*;

public class CadastroController {

    private Janela janela;
    private Cliente cliente;
    private Conta conta;

    public CadastroController(Janela janela) {
        this.janela = janela;

        // Ações dos botões
        configurarEventos();
    }

    private void configurarEventos() {
        // Botão Consultar
        janela.getJbConsultar().addActionListener(e -> consultar());

        // Botão Atualizar
        janela.getJbAtualizar().addActionListener(e -> atualizar());

        // Botão Fechar
        janela.getJbFechar().addActionListener(e -> janela.dispose());
    }

    private void consultar() {
        // Cria um cliente com os dados digitados
        cliente = new Cliente();
        cliente.setNome(janela.getJtfNome().getText());
        cliente.setEndereco(janela.getJtfEndereco().getText());
        cliente.setTelefone(janela.getJtfTelefone().getText());
        cliente.setCpf(janela.getJtfCpf().getText());

        // Cria conta de acordo com a seleção
        if (janela.getJrbCorrente().isSelected()) {
            conta = new ContaCorrente();
        } else {
            conta = new ContaPoupanca();
        }
        conta.setAgencia(janela.getJtfAgencia().getText());
        conta.setNumero(janela.getJtfConta().getText());

        // Exibe mensagem simulando consulta
        JOptionPane.showMessageDialog(janela,
                "Consulta realizada!\n\n" +
                "Cliente: " + cliente.getNome() + "\n" +
                "CPF: " + cliente.getCpf() + "\n" +
                "Agência: " + conta.getAgencia() + "\n" +
                "Conta: " + conta.getNumero(),
                "Consulta",
                JOptionPane.INFORMATION_MESSAGE);

        // Habilita o botão atualizar após consulta
        janela.getJbAtualizar().setEnabled(true);
    }

    private void atualizar() {
        if (cliente != null && conta != null) {
            cliente.setNome(janela.getJtfNome().getText());
            cliente.setEndereco(janela.getJtfEndereco().getText());
            cliente.setTelefone(janela.getJtfTelefone().getText());
            cliente.setCpf(janela.getJtfCpf().getText());

            conta.setAgencia(janela.getJtfAgencia().getText());
            conta.setNumero(janela.getJtfConta().getText());

            JOptionPane.showMessageDialog(janela,
                    "Dados atualizados com sucesso!",
                    "Atualização",
                    JOptionPane.INFORMATION_MESSAGE);
        } 
    }
}