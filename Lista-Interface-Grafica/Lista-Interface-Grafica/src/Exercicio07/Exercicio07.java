/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio07;

import Exercicio01.InterfaceLista09;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Alan
 */
public class Exercicio07 implements InterfaceLista09{
    
    private JFrame jFrame;
    private JLabel jLabelNome, jLabelQuantidadeHoras, jLabelValorINSS, jLabelContribuicaoSindical, jLabelValorPasse, 
            jLabelAuxilioAlmoco, jLabelAuxilioEducacao, jLabelAuxilioSaude, jLabelResultado, jLabelCargo;
    private JTextField jTextFieldNome, jTextFieldQuantidadeHoras, jTextFieldValorINSS, jTextFieldContribuicaoSindical, 
            jTextFieldValorPasse, jTextFieldAuxilioAlmoco, jTextFieldAuxilioEducacao, jTextFieldAuxilioSaude;
    private JTextArea jTextAreaResultado;
    private JComboBox jComboBoxCargo;
    private JButton jButtonProcessar;
    
    public Exercicio07(){
        gerarTela();
        instanciarComponentes();
        adicionarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        acaoBotao();
        configurarComboBox();
        limparCampos();
        jFrame.setVisible(true);
    }
    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(500, 500);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void instanciarComponentes() {
        jLabelNome = new JLabel("Nome");
        jTextFieldNome = new JTextField();
        
        jLabelQuantidadeHoras = new JLabel("Quantidade de horas");
        jTextFieldQuantidadeHoras = new JTextField();
        
        jLabelValorINSS = new JLabel("Valor do INSS");
        jTextFieldValorINSS = new JTextField();
        
        jLabelContribuicaoSindical = new JLabel("Contribuição Sindical");
        jTextFieldContribuicaoSindical = new JTextField();
        
        jLabelValorPasse = new JLabel("Auxilio Transporte");
        jTextFieldValorPasse = new JTextField();
        
        jLabelAuxilioAlmoco = new JLabel("Auxilio Almoço");
        jTextFieldAuxilioAlmoco = new JTextField();
        
        jLabelAuxilioEducacao = new JLabel("Auxilio Educação");
        jTextFieldAuxilioEducacao = new JTextField();
        
        jLabelAuxilioSaude = new JLabel("Auxilio Saude");
        jTextFieldAuxilioSaude = new JTextField();
        
        jLabelResultado = new JLabel("Resultado");
        jTextAreaResultado = new JTextArea();
        
        jLabelCargo = new JLabel("Cargo");
        jComboBoxCargo = new JComboBox();
        
        jButtonProcessar = new JButton("Processar");
        
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelNome);
        jFrame.add(jTextFieldNome);
        
        jFrame.add(jLabelQuantidadeHoras);
        jFrame.add(jTextFieldQuantidadeHoras);
        
        jFrame.add(jLabelValorINSS);
        jFrame.add(jTextFieldValorINSS);
        
        jFrame.add(jLabelContribuicaoSindical);
        jFrame.add(jTextFieldContribuicaoSindical);
        
        jFrame.add(jLabelValorPasse);
        jFrame.add(jTextFieldValorPasse);
        
        jFrame.add(jLabelAuxilioAlmoco);
        jFrame.add(jTextFieldAuxilioAlmoco);
        
        jFrame.add(jLabelAuxilioEducacao);
        jFrame.add(jTextFieldAuxilioEducacao);
        
        jFrame.add(jLabelAuxilioSaude);
        jFrame.add(jTextFieldAuxilioSaude);
        
        jFrame.add(jLabelResultado);
        jFrame.add(jTextAreaResultado);
        
        jFrame.add(jLabelCargo);
        jFrame.add(jComboBoxCargo);
        
        jFrame.add(jButtonProcessar);
    }

    @Override
    public void gerarDimensoes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void gerarLocalizacoes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void acaoBotao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void configurarComboBox() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void limparCampos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
