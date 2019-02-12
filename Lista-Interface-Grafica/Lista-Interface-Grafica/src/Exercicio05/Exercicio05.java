/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio05;

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
public class Exercicio05 implements InterfaceLista09{
        
    private JFrame jFrame;
    private JLabel jLabelNumero01, jLabelNumero02;
    private JTextField jTextFieldNumero01, jTextFieldNumero02;
    private JTextArea jTextAreaResultado;
    private JScrollPane jScrollPaneResutado;
    private JButton jButtonSomar, jButtonSubtrair, jButtonMultiplicar, jButtonDividir;
    
    public Exercicio05(){
        
        gerarTela();
        instanciarComponentes();
        adicionarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        configurarScroll();
        acaoBotaoSomar();
        acaoBotaoSubtrair();
        acaoBotaoMultiplicar();
        acaoBotaoDividir();
        limparCampos();
        jFrame.setVisible(true);
}

    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(484, 370);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void instanciarComponentes() {
        jLabelNumero01 = new JLabel("Numero 1");
        jTextFieldNumero01 = new JTextField();
        
        jLabelNumero02 = new JLabel("Numero 2");
        jTextFieldNumero02 = new JTextField();
        
        jTextAreaResultado = new JTextArea();
        jScrollPaneResutado = new JScrollPane();
        
        jButtonSomar = new JButton("Somar (+)");
        jButtonSubtrair = new JButton("Subtrair (-)");
        jButtonMultiplicar = new JButton("Multiplicar (*)");
        jButtonDividir = new JButton("Dividir (/)");
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelNumero01);
        jFrame.add(jTextFieldNumero01);
        
        jFrame.add(jLabelNumero02);
        jFrame.add(jTextFieldNumero02);
        
        jFrame.add(jScrollPaneResutado);
        
        jFrame.add(jButtonSomar);
        jFrame.add(jButtonSubtrair);
        jFrame.add(jButtonMultiplicar);
        jFrame.add(jButtonDividir);
    }

    @Override
    public void gerarDimensoes() {
        jLabelNumero01.setSize(100, 30);
        jTextFieldNumero01.setSize(150, 30);
        
        jLabelNumero02.setSize(100, 30);
        jTextFieldNumero02.setSize(150, 30);
        
        jScrollPaneResutado.setSize(450, 150);
        
        jButtonSomar.setSize(110, 60);
        jButtonSubtrair.setSize(110, 60);
        jButtonMultiplicar.setSize(110, 60);
        jButtonDividir.setSize(110, 60);
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNumero01.setLocation(5, 5);
        jTextFieldNumero01.setLocation(7, 45);
        
        jLabelNumero02.setLocation(165, 5);
        jTextFieldNumero02.setLocation(167, 45);
        
        jScrollPaneResutado.setLocation(10, 170);
        
        jButtonSomar.setLocation(5, 90);
        jButtonSubtrair.setLocation(120, 90);
        jButtonMultiplicar.setLocation(235, 90);
        jButtonDividir.setLocation(350, 90);
        
        
    }

    private void configurarScroll() {
        jScrollPaneResutado.setViewportView(jTextAreaResultado);
        jScrollPaneResutado.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jScrollPaneResutado.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jTextAreaResultado.setLineWrap(true);
        jTextAreaResultado.setEditable(false);
        
    }

    private void acaoBotaoSomar() {
        jButtonSomar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(jTextFieldNumero01.getText().trim().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Está faltando um dos numeros!");
                        jTextFieldNumero01.requestFocus();
                        return;
                    }if(jTextFieldNumero02.getText().trim().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Está faltando um dos numeros!");
                        jTextFieldNumero02.requestFocus();
                        return;
                    }
                    try{
                    int num1 = Integer.parseInt(jTextFieldNumero01.getText().trim());
                    int num2 = Integer.parseInt(jTextFieldNumero02.getText().trim());
                    String resultado = "";
                    
                    int soma = (num1 + num2);
                    resultado = String.valueOf(soma);
                    jTextAreaResultado.setText(resultado);
                    limparCampos();
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Digite só numeros");
                    jTextFieldNumero01.requestFocus();
                }
            }
        });
    }

    private void acaoBotaoSubtrair() {
        jButtonSubtrair.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                 if(jTextFieldNumero01.getText().trim().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Está faltando um dos numeros!");
                        jTextFieldNumero01.requestFocus();
                        return;
                    }if(jTextFieldNumero02.getText().trim().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Está faltando um dos numeros!");
                        jTextFieldNumero02.requestFocus();
                        return;
                    } 
                    String resultado = "";
                try{
                    
                    int num1 = Integer.parseInt(jTextFieldNumero01.getText().trim());
                    int num2 = Integer.parseInt(jTextFieldNumero02.getText().trim());
                    int subtracao = (num1 - num2);  ;
                    resultado = String.valueOf(subtracao);
                    jTextAreaResultado.setText(resultado);
                    limparCampos();
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Digite só numeros");
                    jTextFieldNumero01.requestFocus();
                
                }
            }
        });
    }

    private void acaoBotaoMultiplicar() {
        jButtonMultiplicar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                    if(jTextFieldNumero01.getText().trim().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Está faltando um dos numeros!");
                        jTextFieldNumero01.requestFocus();
                        return;
                    }if(jTextFieldNumero02.getText().trim().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Está faltado um dos numeros!");
                        jTextFieldNumero02.requestFocus();
                        return;
                    }
                    String resultado = "";
                try{
                    int num1 = Integer.parseInt(jTextFieldNumero01.getText().trim());
                    int num2 = Integer.parseInt(jTextFieldNumero02.getText().trim());
                    int multiplicacao = num1 * num2;
                    
                    resultado = String.valueOf(multiplicacao);
                    jTextAreaResultado.setText(resultado);
                    limparCampos();
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Digite só numeros");
                    jTextFieldNumero01.requestFocus();
                }
            }
        });
    }

    private void acaoBotaoDividir() {
        jButtonDividir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               if(jTextFieldNumero01.getText().trim().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Está faltando um dos numeros!");
                        jTextFieldNumero01.requestFocus();
                        return;
                    }if(jTextFieldNumero02.getText().trim().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Está faltando um dos numeros!");
                        jTextFieldNumero02.requestFocus();
                        return;
                    }
                    try{
                    int num1 = Integer.parseInt(jTextFieldNumero01.getText().trim());
                    int num2 = Integer.parseInt(jTextFieldNumero02.getText().trim());
                    String resultado = "";
                 
                    int dividir = (num1 / num2);
                    resultado = String.valueOf(dividir);
                    jTextAreaResultado.setText(resultado);
                    limparCampos();
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Digite só numeros");
                    jTextFieldNumero01.requestFocus();
                }
            }
        });
    }

    private void limparCampos() {
        jTextFieldNumero01.setText("");
        jTextFieldNumero02.setText("");
        jTextAreaResultado.setText("");
    }
    
    
    
}
