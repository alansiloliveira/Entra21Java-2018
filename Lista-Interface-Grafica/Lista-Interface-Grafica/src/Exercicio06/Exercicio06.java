/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio06;

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
public class Exercicio06 implements InterfaceLista09 {

    private JFrame jFrame;
    private JLabel jLabelNome, jLabelPeso, jLabelAltura;
    private JTextField jTextFieldNome, jTextFieldPeso, jTextFieldAltura;
    private JButton jButtonIMC;

    public Exercicio06() {
        gerarTela();
        instanciarComponentes();
        adicionarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        acaoBotton();
        limparCampos();
        jFrame.setVisible(true);
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(350, 285);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void instanciarComponentes() {
        jLabelNome = new JLabel("Nome");
        jTextFieldNome = new JTextField();

        jLabelAltura = new JLabel("Altura");
        jTextFieldAltura = new JTextField();

        jLabelPeso = new JLabel("Peso");
        jTextFieldPeso = new JTextField();

        jButtonIMC = new JButton("Calcular");
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelNome);
        jFrame.add(jTextFieldNome);

        jFrame.add(jLabelPeso);
        jFrame.add(jTextFieldPeso);

        jFrame.add(jLabelAltura);
        jFrame.add(jTextFieldAltura);

        jFrame.add(jButtonIMC);
    }

    @Override
    public void gerarDimensoes() {
        jLabelNome.setSize(100, 20);
        jTextFieldNome.setSize(314, 30);

        jLabelPeso.setSize(70, 30);
        jTextFieldPeso.setSize(140, 30);

        jLabelAltura.setSize(70, 30);
        jTextFieldAltura.setSize(140, 30);

        jButtonIMC.setSize(314, 100);
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNome.setLocation(7, 5);
        jTextFieldNome.setLocation(10, 30);

        jLabelPeso.setLocation(7, 60);
        jTextFieldPeso.setLocation(10, 90);

        jLabelAltura.setLocation(180, 60);
        jTextFieldAltura.setLocation(183, 90);

        jButtonIMC.setLocation(7, 130);
    }

    private void acaoBotton() {
        jButtonIMC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                float imc = 0;
                if (jTextFieldNome.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Digite um nome!");
                    jTextFieldNome.requestFocus();
                    return;
                }
                if (jTextFieldPeso.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Digite um peso para o calculo!");
                    jTextFieldPeso.requestFocus();
                    return;
                }
                if (jTextFieldAltura.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Digite uma altura para o calculo!");
                    jTextFieldAltura.requestFocus();
                    return;
                }
                try {
                    float peso = Float.parseFloat(jTextFieldPeso.getText().trim().replace(",", "."));
                    float altura = Float.parseFloat(jTextFieldAltura.getText().trim().replace(",", "."));
                    String nome = jTextFieldNome.getText().trim();
                    imc = (peso / (altura * altura));

                    if (imc < 9.99) {
                        JOptionPane.showMessageDialog(null, nome + "   -   Seu IMC é: " + imc + "\nVocê esta em Desnutrição Grau V");
                        jTextFieldAltura.requestFocus();
                        return;
                    } else if (imc > 10 && imc < 12.9) {
                        JOptionPane.showMessageDialog(null, nome + "   -   Seu IMC é: " + imc + "\nVocê esta em Desnutrição Grau IV");
                        jTextFieldAltura.requestFocus();
                        return;
                    } else if (imc > 13 && imc < 15.9) {
                        JOptionPane.showMessageDialog(null, nome + "   -   Seu IMC é: " + imc + "\nVocê esta em Desnutrição Grau III");
                        jTextFieldAltura.requestFocus();
                        return;
                    } else if (imc > 16 && imc < 16.9) {
                        JOptionPane.showMessageDialog(null, nome + "   -   Seu IMC é: " + imc + "\nVocê esta em Desnutrição Grau II");
                        jTextFieldAltura.requestFocus();
                        return;
                    } else if (imc > 17 && imc < 18.4) {
                        JOptionPane.showMessageDialog(null, nome + "   -   Seu IMC é: " + imc + "\nVocê esta em Desnutrição Grau I");
                        jTextFieldAltura.requestFocus();
                        return;
                    } else if (imc > 18.5 && imc < 24.9) {
                        JOptionPane.showMessageDialog(null, nome + "   -   Seu IMC é: " + imc + "\nVocê esta no peso ideal");
                        jTextFieldAltura.requestFocus();
                        return;
                    } else if (imc > 25 && imc < 29.9) {
                        JOptionPane.showMessageDialog(null, nome + "   -   Seu IMC é: " + imc + "\nVocê esta em Pré Obesidade");
                        jTextFieldAltura.requestFocus();
                        return;
                    } else if (imc > 30 && imc < 34.5) {
                        JOptionPane.showMessageDialog(null, nome + "   -   Seu IMC é: " + imc + "\nVocê esta em Obesidade Grau I");
                        jTextFieldAltura.requestFocus();
                        return;
                    } else if (imc > 25 && imc < 39.9) {
                        JOptionPane.showMessageDialog(null, nome + "   -   Seu IMC é: " + imc + "\nVocê esta em Obesidade Grau II");
                        jTextFieldAltura.requestFocus();
                        return;
                    } else if (imc > 39.9) {
                        JOptionPane.showMessageDialog(null, nome + "   -   Seu IMC é: " + imc + "\nVocê esta em Obesidade Grau III");
                        jTextFieldAltura.requestFocus();
                        return;
                    }
                    limparCampos();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Digite só numeros");
                    jTextFieldAltura.requestFocus();
                    return;
                }
            }
        });
    }

    private void limparCampos() {
        jTextFieldNome.setText("");
        jTextFieldPeso.setText("");
        jTextFieldAltura.setText("");
    }

}
