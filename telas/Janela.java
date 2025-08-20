package telas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import funcoes.*;

public class Janela extends JFrame {

    // Atributos (labels, campos, botões etc.)
    private JLabel jlAgencia, jlConta, jlNome, jlEndereco, jlTelefone, jlCpf;
    private JTextField jtfAgencia, jtfConta, jtfNome, jtfEndereco, jtfTelefone, jtfCpf;
    private JSeparator jSeparator01, jSeparator02;
    private JRadioButton jrbCorrente, jrbPoupanca;
    private ButtonGroup bgContas;
    private JButton jbConsultar, jbAtualizar, jbFechar;

    // Construtor
    public Janela() {
        super("Java Swing - Desenvolvimento de Sistemas"); // título
        setSize(400, 255); // tamanho da janela
        setResizable(false); // não pode redimensionar
        getContentPane().setLayout(null); // layout nulo
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        centralizar(); // chama método de centralização

        // ---------- CAMPOS DE AGÊNCIA E CONTA ----------
        jlAgencia = new JLabel("Código da Agência:");
        jlAgencia.setBounds(10, 10, 110, 18);
        getContentPane().add(jlAgencia);

        jtfAgencia = new JTextField();
        jtfAgencia.setBounds(125, 10, 50, 20);
        getContentPane().add(jtfAgencia);

        jlConta = new JLabel("Número da Conta:");
        jlConta.setBounds(205, 10, 105, 18);
        getContentPane().add(jlConta);

        jtfConta = new JTextField();
        jtfConta.setBounds(315, 10, 60, 20);
        getContentPane().add(jtfConta);

        jSeparator01 = new JSeparator();
        jSeparator01.setBounds(10, 40, 365, 10);
        getContentPane().add(jSeparator01);

        // ---------- CAMPOS DO CLIENTE ----------
        jlNome = new JLabel("Nome:");
        jlNome.setBounds(10, 50, 60, 18);
        jlNome.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(jlNome);

        jtfNome = new JTextField();
        jtfNome.setBounds(75, 50, 300, 20);
        getContentPane().add(jtfNome);

        jlEndereco = new JLabel("Endereço:");
        jlEndereco.setBounds(10, 75, 60, 18);
        jlEndereco.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(jlEndereco);

        jtfEndereco = new JTextField();
        jtfEndereco.setBounds(75, 75, 300, 20);
        getContentPane().add(jtfEndereco);

        jlTelefone = new JLabel("Telefone:");
        jlTelefone.setBounds(10, 100, 60, 18);
        jlTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(jlTelefone);

        jtfTelefone = new JTextField();
        jtfTelefone.setBounds(75, 100, 300, 20);
        getContentPane().add(jtfTelefone);

        jlCpf = new JLabel("CPF:");
        jlCpf.setBounds(10, 125, 60, 18);
        jlCpf.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(jlCpf);

        jtfCpf = new JTextField();
        jtfCpf.setBounds(75, 125, 300, 20);
        getContentPane().add(jtfCpf);

        // ---------- TIPO DE CONTA ----------
        jrbCorrente = new JRadioButton("Conta Corrente");
        jrbCorrente.setBounds(100, 150, 111, 20);
        jrbCorrente.setMnemonic(KeyEvent.VK_C); // Alt + C
        jrbCorrente.setSelected(true);
        getContentPane().add(jrbCorrente);

        jrbPoupanca = new JRadioButton("Conta Poupança");
        jrbPoupanca.setBounds(225, 150, 118, 20);
        jrbPoupanca.setMnemonic(KeyEvent.VK_P); // Alt + P
        getContentPane().add(jrbPoupanca);

        bgContas = new ButtonGroup();
        bgContas.add(jrbCorrente);
        bgContas.add(jrbPoupanca);

        jSeparator02 = new JSeparator();
        jSeparator02.setBounds(10, 180, 365, 10);
        getContentPane().add(jSeparator02);

        // ---------- BOTÕES ----------
        jbConsultar = new JButton("Consultar");
        jbConsultar.setBounds(35, 190, 100, 23);
        jbConsultar.setMnemonic(KeyEvent.VK_S); // Alt + S
        getContentPane().add(jbConsultar);

        jbAtualizar = new JButton("Atualizar");
        jbAtualizar.setBounds(145, 190, 100, 23);
        jbAtualizar.setMnemonic(KeyEvent.VK_A); // Alt + A
        jbAtualizar.setEnabled(false); // começa desabilitado
        getContentPane().add(jbAtualizar);

        jbFechar = new JButton("Fechar");
        jbFechar.setBounds(255, 190, 100, 23);
        jbFechar.setMnemonic(KeyEvent.VK_F); // Alt + F
        getContentPane().add(jbFechar);
    }

    // ---------- GETTERS PARA O CONTROLLER ----------
    public JTextField getJtfAgencia() { return jtfAgencia; }
    public JTextField getJtfConta() { return jtfConta; }
    public JTextField getJtfNome() { return jtfNome; }
    public JTextField getJtfEndereco() { return jtfEndereco; }
    public JTextField getJtfTelefone() { return jtfTelefone; }
    public JTextField getJtfCpf() { return jtfCpf; }

    public JRadioButton getJrbCorrente() { return jrbCorrente; }
    public JRadioButton getJrbPoupanca() { return jrbPoupanca; }

    public JButton getJbConsultar() { return jbConsultar; }
    public JButton getJbAtualizar() { return jbAtualizar; }
    public JButton getJbFechar() { return jbFechar; }

    // ---------- MÉTODO CENTRALIZAR ----------
    private void centralizar() {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension janela = getSize();
        if (janela.height > screen.height)
            setSize(janela.width, screen.height);
        if (janela.width > screen.width)
            setSize(screen.width, janela.height);
        setLocation((screen.width - janela.width) / 2,
                (screen.height - janela.height) / 2);
    }

    // ---------- MÉTODO MAIN ----------
    public static void main(String[] args) {
        Janela janela = new Janela();
        new CadastroController(janela); // conecta a tela ao controller
        janela.setVisible(true);
    }
}