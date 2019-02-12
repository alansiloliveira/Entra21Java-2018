/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio03;

import Exercicio01.InterfaceLista09;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Alunos
 */
public class Exercicio03 implements InterfaceLista09 {

    private JFrame jFrame;
    private JLabel jLabelNumero, jLabelTabuada;
    private JTextField jTextFieldNumero;
    private JTextArea jTextAreaTabuada;
    private JScrollPane jScrollPaneTabuada;
    private JButton jButtonTabuada;

    public Exercicio03() {
        gerarTela();
        instanciarComponentes();
        adicionarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        configurarScroll();
        acaoTabuada();
        limparCampos();
        jFrame.setVisible(true);
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(500, 405);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void instanciarComponentes() {
        jLabelNumero = new JLabel("Numero");
        jTextFieldNumero = new JTextField();

        jLabelTabuada = new JLabel("Tabuada até 20");
        jTextAreaTabuada = new JTextArea();
        jScrollPaneTabuada = new JScrollPane();

        jButtonTabuada = new JButton("X");
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelNumero);
        jFrame.add(jTextFieldNumero);

        jFrame.add(jLabelTabuada);
        jFrame.add(jScrollPaneTabuada);

        jFrame.add(jButtonTabuada);

    }

    @Override
    public void gerarDimensoes() {
        jLabelNumero.setSize(100, 50);
        jTextFieldNumero.setSize(150, 35);

        jLabelTabuada.setSize(100, 35);
        jScrollPaneTabuada.setSize(288, 300);

        jButtonTabuada.setSize(153, 68);
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNumero.setLocation(7, 2);
        jTextFieldNumero.setLocation(10, 50);

        jLabelTabuada.setLocation(180, 7);
        jScrollPaneTabuada.setLocation(183, 50);

        jButtonTabuada.setLocation(7, 100);
    }

    private void configurarScroll() {
        jScrollPaneTabuada.setViewportView(jTextAreaTabuada);
        jScrollPaneTabuada.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jScrollPaneTabuada.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jTextAreaTabuada.setLineWrap(true);
    }

    private void acaoTabuada() {
        jButtonTabuada.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int numero = 0;
                try {
                    if (jTextFieldNumero.getText().trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Digite algum número para realização da tabuada!");
                        jTextFieldNumero.requestFocus();
                        return;
                        
                    }
                numero = Integer.parseInt(jTextFieldNumero.getText().trim());
                String tabuada = "";
                for (int i = 0; i < 21; i++) {
                    tabuada += numero + " x " + i + " : " + (i * numero) + "\n";
                }
                jTextAreaTabuada.setText(tabuada);
                limparCampos();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Só numeros!");
                    jTextFieldNumero.requestFocus();
                }
            }
        });

    }

    private void limparCampos() {
        jTextFieldNumero.setText("");
    }

}
