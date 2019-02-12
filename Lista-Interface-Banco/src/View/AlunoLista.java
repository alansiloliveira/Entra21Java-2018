/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Interface.BaseInterface;
import bean.AlunoBean;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alan
 */
public class AlunoLista implements BaseInterface{
    
    private int linhaSelecionada = -1;
    private JFrame jFrame;
    private JTable jTable;
    private JLabel jLabelID, jLabelNome, jLabelCodigo, jLabelNota1, jLabelNota2, jLabelNota3, jLabelNota4, jLabelMedia, jLabelFrequencia;
    private JTextField jTextFieldID, jTextFieldNome, jTextFieldCodigo, jTextFieldNota1, jTextFieldNota2, jTextFieldNota3, jTextFieldNota4, jTextFieldMedia, jTextFieldFrequencia;
    private JButton jButtonCadastrar, jButtonAlterar, jButtonExcluir;
    private JScrollPane jSrcollPane;
    private DefaultTableModel dtm;
    private ArrayList<AlunoBean> cadastro = new ArrayList<>();
    
    public AlunoLista() {
        gerarTela();
        instanciarComponentes();
        adicionarComponentes();
        gerarLocalizacoes();
        gerarDimensoes();
        acaoBotaoCadastrar();
        acaoBotaoAlterar();
        acaoBotaoExcluir();
        popularTabela();
        acaoCodigoLostFocus();
        jFrame.setVisible(true);
    }       

    @Override
    public void gerarTela() {
        jFrame = new JFrame("Cadastro Alunos");
        jFrame.setSize(500, 500);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
    }

    private void instanciarComponentes() {
        jLabelNome = new JLabel("Nome");
        jTextFieldNome = new JTextField();
        
        jLabelCodigo = new JLabel("Codigo de matricula");
        jTextFieldCodigo = new JTextField();
        jTextFieldCodigo.setEnabled(false);
        
        jLabelID = new JLabel("ID");
        jTextFieldID = new JTextField();
        jTextFieldID.setEnabled(false);
        
        jLabelNota1 = new JLabel("Nota 1");
        jTextFieldNota1 = new JTextField();
        
        jLabelNota2 = new JLabel("Nota 2");
        jTextFieldNota2 = new JTextField();
        
        jLabelNota3 = new JLabel("Nota 3");
        jTextFieldNota3 = new JTextField();
        
        jLabelNota4 = new JLabel("Nota 4");
        jTextFieldNota4 = new JTextField();
         
        jLabelMedia = new JLabel("Média");
        jTextFieldMedia = new JTextField();
        jTextFieldMedia.setEnabled(false);
        
        jLabelFrequencia = new JLabel("Frequencia");
        jTextFieldFrequencia = new JTextField();
        
        jButtonCadastrar = new JButton("Cadastrar");
        jButtonAlterar = new JButton("Alterar");
        jButtonExcluir = new JButton("Excluir");
        
        jTable = new JTable();
        jSrcollPane = new JScrollPane(jTable);
        
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelID);
        jFrame.add(jTextFieldID);
        
        jFrame.add(jLabelCodigo);
        jFrame.add(jTextFieldCodigo);
        
        jFrame.add(jLabelNome);
        jFrame.add(jTextFieldNome);
        
        jFrame.add(jLabelNota1);
        jFrame.add(jTextFieldNota1);
        
        jFrame.add(jLabelNota2);
        jFrame.add(jTextFieldNota2);
        
        jFrame.add(jLabelNota3);
        jFrame.add(jTextFieldNota3);
        
        jFrame.add(jLabelNota4);
        jFrame.add(jTextFieldNota4);
        
        jFrame.add(jLabelMedia);
        jFrame.add(jTextFieldMedia);
        
        jFrame.add(jLabelFrequencia);
        jFrame.add(jTextFieldFrequencia);
        
        jFrame.add(jSrcollPane);
        
        jFrame.add(jButtonCadastrar);
        jFrame.add(jButtonAlterar);
        jFrame.add(jButtonExcluir);
        
    }

    @Override
    public void gerarLocalizacoes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void gerarDimensoes() {
        jLabelID.setSize(120, 25);
        jTextFieldID.setSize(200, 25);
        
        jLabelNome.setSize(jLabelID.getSize());
        jTextFieldNome.setSize(jTextFieldID.getSize());
        
        jLabelCodigo.setSize(jLabelID.getSize());
        jTextFieldCodigo.setSize(jTextFieldID.getSize());
        
        jLabelNota1.setSize(jLabelID.getSize());
        jTextFieldNota1.setSize(jTextFieldID.getSize());
        
        jLabelNota2.setSize(jLabelID.getSize());
        jTextFieldNota2.setSize(jTextFieldID.getSize());
        
        jLabelNota3.setSize(jLabelID.getSize());
        jTextFieldNota3.setSize(jTextFieldID.getSize());
        
        jLabelNota4.setSize(jLabelID.getSize());
        jTextFieldNota4.setSize(jTextFieldID.getSize());
        
        jLabelMedia.setSize(jLabelID.getSize());
        jTextFieldMedia.setSize(jTextFieldID.getSize());
        
        jLabelFrequencia.setSize(jLabelID.getSize());
        jTextFieldID.setSize(jTextFieldID.getSize());
        
        jButtonCadastrar.setSize(75, 40);
        jButtonAlterar.setSize(jButtonCadastrar.getSize());
        jButtonExcluir.setSize(jButtonCadastrar.getSize());
        
        jSrcollPane.setSize(300, 300);
    }



    private void acaoBotaoCadastrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void acaoBotaoAlterar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void acaoBotaoExcluir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    private void popularTabela() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void acaoCodigoLostFocus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
