package Exercicio01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class Exercicio01 implements InterfaceLista09{

    private JFrame jFrame;
    private JLabel jLabelNome, jLabelSobrenome;
    private JTextField jTextFieldNome, jTextFieldSobrenome;
    private JButton jButtonConcatenar;
    
    public Exercicio01(){
        gerarTela();
        instanciarComponentes();
        adicionarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        acaoConcatenar();
        limparCampos();
        jFrame.setVisible(true);
    }
    
    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(350, 350);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }

    @Override
    public void instanciarComponentes() {
        jLabelNome = new JLabel("Nome:");
        jTextFieldNome = new JTextField();
        
        jLabelSobrenome = new JLabel("Sobrenome:");
        jTextFieldSobrenome = new JTextField();
        
        jButtonConcatenar = new JButton("Concatenar");
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelNome);
        jFrame.add(jTextFieldNome);
        
        jFrame.add(jLabelSobrenome);
        jFrame.add(jTextFieldSobrenome);
        
        jFrame.add(jButtonConcatenar);
    }

    @Override
    public void gerarDimensoes() {
        jLabelNome.setSize(100, 30);
        jTextFieldNome.setSize(315, 30);
        
        jLabelSobrenome.setSize(100, 30);
        jTextFieldSobrenome.setSize(315, 30);
        
        jButtonConcatenar.setSize(315, 120);
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNome.setLocation(7, 7);
        jTextFieldNome.setLocation(10, 38);
        
        jLabelSobrenome.setLocation(7, 75);
        jTextFieldSobrenome.setLocation(10, 107);
        
        jButtonConcatenar.setLocation(10, 170);
    }
    
    public void acaoConcatenar() {
        jButtonConcatenar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = jTextFieldNome.getText().trim();
                if(jTextFieldNome.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Digite um nome!");
                    jTextFieldNome.requestFocus();
                    return;
                }if(jTextFieldNome.getText().trim().length() < 3){
                    JOptionPane.showMessageDialog(null, "Nome deve conter no minimo 3 letras!");
                    jTextFieldNome.requestFocus();
                    return;
                }
                String sobrenome = jTextFieldSobrenome.getText().trim();
                if(jTextFieldSobrenome.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Digite um sobrenome!");
                    jTextFieldSobrenome.requestFocus();
                    return;
                }if(jTextFieldSobrenome.getText().trim().length() < 3){
                    JOptionPane.showMessageDialog(null, "Sobrenome deve conter pelo menos 3 digitos!");
                    jTextFieldSobrenome.requestFocus();
                    return;
                }
                JOptionPane.showMessageDialog(null, "O nome digitado é " + nome + " " + sobrenome);
                limparCampos();
            }
        });
    }

    private void limparCampos() {
        jTextFieldNome.setText("");
        jTextFieldSobrenome.setText("");
    }
    
}
