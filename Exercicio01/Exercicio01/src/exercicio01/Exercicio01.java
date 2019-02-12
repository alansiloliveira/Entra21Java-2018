package exercicio01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Alan
 */
public class Exercicio01 implements InterfaceBaseExercicio {

    private JFrame jFrame;
    private JLabel jLabelNome,
            jLabelRaca,
            jLabelApelido,
            jLabelIdade,
            jLabelPreco,
            jLabelDescricao;
    private JButton jButtonSalvar,
            jButtonCancelar;
    private JComboBox jComboBoxRaca;
    private JRadioButton jRadioButtonVivo,
            jRadioButtonMorto,
            jRadioButtonRacao,
            jRadioButtonCome;
    private ButtonGroup buttonGroupEstado,
            buttonGroupAlimentos;
    private JCheckBox jCheckBoxAdestrado,
            jCheckBoxVacinado,
            jCheckBoxCastrado,
            jCheckBoxPedigree;
    private JTextArea jTextArea;
    private JTextField campoNome,
            campoIdade,
            campoApelido,
            campoPreco;
    private JScrollPane jScrollPane;

    public Exercicio01() {
        gerarTela();
        instanciarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        configurarScrollPane();
        acaoJComboBox();
        acaoBotaoSalvar();
        acaoBotaoCancelar();
        jFrame.setVisible(true);
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(600, 500);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void instanciarComponentes() {
        jLabelNome = new JLabel("Nome");
        jLabelApelido = new JLabel("Apelido");
        jLabelIdade = new JLabel("Idade");
        jLabelRaca = new JLabel("Raça");
        jLabelPreco = new JLabel("Preço");
        jLabelDescricao = new JLabel("Descrição");
        campoNome = new JTextField();
        campoApelido = new JTextField();
        campoIdade = new JTextField();
        campoPreco = new JTextField();
        jTextArea = new JTextArea();
        jComboBoxRaca = new JComboBox();
        jRadioButtonVivo = new JRadioButton("Vivo");
        jRadioButtonMorto = new JRadioButton("Morto");
        jRadioButtonRacao = new JRadioButton("Ração");
        jRadioButtonCome = new JRadioButton("Come Almoços, Jantas");
        jCheckBoxAdestrado = new JCheckBox("Adestrado");
        jCheckBoxVacinado = new JCheckBox("Vacinado");
        jCheckBoxCastrado = new JCheckBox("Castrado");
        jCheckBoxPedigree = new JCheckBox("Tem pedigree");
        jButtonCancelar = new JButton("Cancelar");
        jButtonSalvar = new JButton("Salvar");
        buttonGroupEstado = new ButtonGroup();
        buttonGroupAlimentos = new ButtonGroup();
        jScrollPane = new JScrollPane();
        jButtonSalvar = new JButton("Salvar");
        jButtonCancelar = new JButton("Cancelar");
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelNome);
        jFrame.add(jLabelApelido);
        jFrame.add(jLabelIdade);
        jFrame.add(jLabelRaca);
        jFrame.add(jLabelPreco);
        jFrame.add(jLabelDescricao);
        jFrame.add(jComboBoxRaca);
        jFrame.add(jRadioButtonVivo);
        jFrame.add(jRadioButtonMorto);
        jFrame.add(jRadioButtonCome);
        jFrame.add(jRadioButtonRacao);
        jFrame.add(jCheckBoxAdestrado);
        jFrame.add(jCheckBoxVacinado);
        jFrame.add(jCheckBoxCastrado);
        jFrame.add(jCheckBoxPedigree);
        jFrame.add(jButtonCancelar);
        jFrame.add(jButtonSalvar);
        jFrame.add(campoApelido);
        jFrame.add(campoIdade);
        jFrame.add(campoNome);
        jFrame.add(campoPreco);
        jFrame.add(jTextArea);
        jFrame.add(jScrollPane);
        jFrame.add(jButtonSalvar);
        jFrame.add(jButtonCancelar);
        buttonGroupEstado.add(jRadioButtonVivo);
        buttonGroupEstado.add(jRadioButtonMorto);
        buttonGroupAlimentos.add(jRadioButtonCome);
        buttonGroupAlimentos.add(jRadioButtonRacao);
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNome.setLocation(5, 5);
        campoNome.setLocation(7, 33);
        jLabelIdade.setLocation(400, 5);
        campoIdade.setLocation(402, 33);
        jLabelRaca.setLocation(5, 67);
        jComboBoxRaca.setLocation(7, 95);
        jLabelApelido.setLocation(190, 66);
        campoApelido.setLocation(193, 94);
        jLabelPreco.setLocation(402, 66);
        campoPreco.setLocation(403, 94);
        jRadioButtonVivo.setLocation(4, 136);
        jRadioButtonMorto.setLocation(4, 164);
        jRadioButtonRacao.setLocation(107, 136);
        jRadioButtonCome.setLocation(107, 164);
        jCheckBoxAdestrado.setLocation(325, 136);
        jCheckBoxVacinado.setLocation(325, 164);
        jCheckBoxCastrado.setLocation(450, 136);
        jCheckBoxPedigree.setLocation(450, 164);
        jLabelDescricao.setLocation(5, 200);
        jScrollPane.setLocation(7, 230);
        jButtonCancelar.setLocation(315, 356);
        jButtonSalvar.setLocation(450, 356);

    }

    @Override
    public void gerarDimensoes() {
        jLabelNome.setSize(50, 20);
        campoNome.setSize(340, 22);
        jLabelIdade.setSize(50, 20);
        campoIdade.setSize(176, 22);
        jLabelRaca.setSize(50, 20);
        jComboBoxRaca.setSize(150, 22);
        jLabelApelido.setSize(50, 20);
        campoApelido.setSize(154, 22);
        jLabelPreco.setSize(50, 20);
        campoPreco.setSize(175, 22);
        jRadioButtonVivo.setSize(80, 20);
        jRadioButtonMorto.setSize(80, 20);
        jRadioButtonRacao.setSize(80, 20);
        jRadioButtonCome.setSize(180, 20);
        jCheckBoxAdestrado.setSize(100, 20);
        jCheckBoxVacinado.setSize(100, 20);
        jCheckBoxCastrado.setSize(100, 20);
        jCheckBoxPedigree.setSize(120, 20);
        jLabelDescricao.setSize(100, 20);
        jScrollPane.setSize(572, 115);
        jButtonCancelar.setSize(127, 92);
        jButtonSalvar.setSize(127, 92);
    }

    @Override
    public void configurarScrollPane() {
        jScrollPane.setViewportView(jTextArea);
        jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jTextArea.setLineWrap(true);
    }

    @Override
    public void acaoJComboBox() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(
                new Object[]{
                    "Sem raça definida", "Pintcher", "Pitbull", "Husky Siberiano", "Rottwailler", "Pastor alemão",
                    "Pastor Holandes", "YorkShire", "Poddle", "Labrador", "Bulldogue", "Bulldogue Francês",
                    "Labrador", "Beagle"
                });
        jComboBoxRaca.setModel(modelo);
        jComboBoxRaca.setSelectedIndex(-1);

    }

    @Override
    public void acaoBotaoSalvar() {
        jButtonSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = campoNome.getText().trim();
                if(nome.isEmpty()){
                    JOptionPane.showMessageDialog(null, 
                            "Informe o nome!");
                    return;
                }
                String idade = campoIdade.getText().trim();
                if(idade.isEmpty()){
                    JOptionPane.showMessageDialog(null, 
                            "Informe a idade!");
                    return;
                }
                String apelido = campoApelido.getText().trim();
                if(apelido.isEmpty()){
                    JOptionPane.showMessageDialog(null,
                            "Informe o apelido!");
                    return;
                }
                String descricao = jTextArea.getText().trim();
                if(descricao.isEmpty()){
                    JOptionPane.showMessageDialog(null,
                            "Informe uma descrição!");
                    return;
                }
                if(!jRadioButtonVivo.isSelected() && !jRadioButtonMorto.isSelected()){
                    JOptionPane.showMessageDialog(null, 
                            "Informe o estado do cachorro!");
                    return;
                }
                if(!jRadioButtonRacao.isSelected() && !jRadioButtonCome.isSelected()){
                    JOptionPane.showMessageDialog(null,
                            "Informe o tipo de alimento!");
                    return;
                }
                
                JOptionPane.showMessageDialog(null, "Cadastro do animal\n\n" +
                        "Nome: " + campoNome.getText() +
                        "\nIdade: " + campoIdade.getText() +
                        "\nApelido: " + campoApelido.getText() +
                        "\nPreço: " + campoPreco.getText() +
                        "\nRaça: " + jComboBoxRaca.getSelectedItem()+
                        //"\nEstado do cachorro: " + buttonGroupEstado.getButtonCount() +
                        //"\nAlimentação: " + buttonGroupAlimentos.getButtonCount() +
                        //"\nO cachorro é adestrado: " + jCheckBoxAdestrado.getActionCommand()+
                        //"\nO cachorro é castrado: " + jCheckBoxCastrado.getActionCommand() +
                        //"\nO cachorro é vacinado: " + jCheckBoxVacinado.getActionCommand() +
                        //"\nO cachorro tem pedigree: " + jCheckBoxPedigree.getActionCommand() +
                        "\nDescrição: " + jTextArea.getText());                       
            }
        });
    }

    @Override
    public void acaoBotaoCancelar() {
        jButtonCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                campoNome.setText("");
                campoIdade.setText("");
                campoApelido.setText("");
                campoPreco.setText("");
                jTextArea.setText("");
                jComboBoxRaca.setSelectedIndex(-1);
                buttonGroupEstado.clearSelection();
                buttonGroupAlimentos.clearSelection();
                jCheckBoxAdestrado.setSelected(false);
                jCheckBoxCastrado.setSelected(false);
                jCheckBoxPedigree.setSelected(false);
                jCheckBoxVacinado.setSelected(false);
            }
        });
    }

}
