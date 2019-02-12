/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio02;

import Exercicio01.InterfaceLista09;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Alunos
 */
public class Exercicio02 implements InterfaceLista09 {

    private JFrame jFrame;
    private JLabel jLabelNumero;
    private JTextField jTextFieldNumero;
    private JButton jButtonTabuada;

    public Exercicio02() {
        gerarTela();
        instanciarComponentes();
        adicionarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        acaoTabuada();
        limparCampos();
        jFrame.setVisible(true);
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(245, 216);
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
    }

    @Override
    public void instanciarComponentes() {
        jLabelNumero = new JLabel("Digite um número para multiplicar");
        jTextFieldNumero = new JTextField();
        jButtonTabuada = new JButton("X 50");
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelNumero);
        jFrame.add(jTextFieldNumero);
        jFrame.add(jButtonTabuada);
    }

    @Override
    public void gerarDimensoes() {
        jLabelNumero.setSize(200, 30);
        jTextFieldNumero.setSize(210, 30);
        jButtonTabuada.setSize(210, 70);
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNumero.setLocation(10, 10);
        jTextFieldNumero.setLocation(10, 50);
        jButtonTabuada.setLocation(10, 90);
    }

    private void acaoTabuada() {
        jButtonTabuada.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                int numero = 0;
                try {
                    /*numero = Integer.parseInt(jTextFieldNumero.getText().trim());
                     if(numero > Short.MAX_VALUE){
                        
                     }*/

                    if (jTextFieldNumero.getText().trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Digite algum numero!");
                        jTextFieldNumero.requestFocus();
                        return;

                    }

                    numero = Integer.parseInt(jTextFieldNumero.getText());

                    double multi = numero * 50;
                    JOptionPane.showMessageDialog(null, "O numero digitado é " + numero
                            + "\nResultado X 50: " + multi);
                    limparCampos();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Deve conter só numeros!");
                    jTextFieldNumero.requestFocus();
         
                }

            }
        });
    }

    private void limparCampos() {
        jTextFieldNumero.setText("");
    }

}
