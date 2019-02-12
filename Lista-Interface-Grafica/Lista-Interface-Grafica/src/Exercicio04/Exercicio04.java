/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio04;

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
public class Exercicio04 implements InterfaceLista09{
    
    private JFrame jFrame;
    private JLabel jLabelNumero;
    private JTextField jTextFieldNumero;
    private JButton jButtonVerificar;
    
    public Exercicio04(){
        gerarTela();
        instanciarComponentes();
        adicionarComponentes(); 
        gerarDimensoes();
        gerarLocalizacoes();
        acaoBotaoVerificar();
        limparCampos();
        jFrame.setVisible(true);
    }
    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(200, 240);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void instanciarComponentes() {
        jLabelNumero = new JLabel("Digite um numero:");
        jTextFieldNumero = new JTextField();
        jButtonVerificar = new JButton("Verificando");
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelNumero);
        jFrame.add(jTextFieldNumero);
        jFrame.add(jButtonVerificar);
    }

    @Override
    public void gerarDimensoes() {
        jLabelNumero.setSize(120, 30);
        jTextFieldNumero.setSize(170, 35);
        jButtonVerificar.setSize(173, 100);
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNumero.setLocation(5, 5);
        jTextFieldNumero.setLocation(7, 40);
        jButtonVerificar.setLocation(5, 90);
    }

    private void acaoBotaoVerificar() {
        jButtonVerificar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int numero = 0;
                try{
                    if(jTextFieldNumero.getText().trim().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Digite algum numero para verificação!");
                        jTextFieldNumero.requestFocus();
                        return;
                    }
                numero = Integer.parseInt(jTextFieldNumero.getText().trim());
                if(numero > 0 && numero %2 == 0){
                    JOptionPane.showMessageDialog(null, "Esse numero é positivo e par!");
                }else if(numero > 0 && numero %2 != 0){
                    JOptionPane.showMessageDialog(null, "O numero é positivo e impar!");
                }else if(numero < 0 && numero %2 == 0){
                    JOptionPane.showMessageDialog(null, "Esse numero é negativo e par!");
                }else if(numero < 0 && numero %2 != 0){
                    JOptionPane.showMessageDialog(null, "Esse numero é negativo e impar!");
                }
                limparCampos();
                }
                catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Digite só numeros!");
                }
            }
        });
    }

    private void limparCampos() {
        jTextFieldNumero.setText("");
    }
    
    
    
}
