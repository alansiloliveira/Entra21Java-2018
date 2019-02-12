package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * @author Francisco Lucas Sens
 */
public class HeroiListaJFrame {

  private JFrame jFrame;
  private JTable jTable;
  private JScrollPane jScrollPane;
  private DefaultTableModel defaultTableModel;
  private JButton jButtonNovo, jButtonEditar, jButtonApagar;

  public HeroiListaJFrame() {
    instanciarComponentes();
    configurarTela();
    definirLocalizacoes();
    definirDimensoes();
    adicionarComponentes();
    acaoNovo();
    acaoEditar();
    acaoApagar();

    jFrame.setVisible(true);
  }

  private void configurarTela() {
    jFrame.setSize(700, 600);
    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jFrame.setLocationRelativeTo(null);
    jFrame.setLayout(null);
  }

  private void instanciarComponentes() {
    jFrame = new JFrame("Lista de herois");
    jButtonNovo = new JButton("Novo");
    jButtonEditar = new JButton("Editar");
    jButtonApagar = new JButton("Apagar");
    jTable = new JTable();
    defaultTableModel = new DefaultTableModel() {
      @Override
      public boolean isCellEditable(int row, int column) {
        return false;
      }
    };

    defaultTableModel.addColumn("Nome");
    defaultTableModel.addColumn("Raça");
    defaultTableModel.addColumn("Salário");
    jTable.setModel(defaultTableModel);
    jScrollPane = new JScrollPane(jTable);
  }

  private void definirLocalizacoes() {
    jButtonNovo.setLocation(10, 10);
    jButtonEditar.setLocation(140, 10);
    jButtonApagar.setLocation(270, 10);
    jScrollPane.setLocation(10, 60);
  }

  private void definirDimensoes() {
    jScrollPane.setSize(660, 500);
    jButtonNovo.setSize(120, 40);
    jButtonEditar.setSize(120, 40);
    jButtonApagar.setSize(120, 40);
  }

  private void adicionarComponentes() {
    jFrame.add(jButtonApagar);
    jFrame.add(jButtonEditar);
    jFrame.add(jButtonNovo);
    jFrame.add(jScrollPane);
  }

  private void acaoNovo() {
    jButtonNovo.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        new HeroiCadastroJFrame();
      }
    });
  }

  private void acaoEditar() {
    jButtonEditar.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        if (jTable.getSelectedRow() == -1) {
          JOptionPane.showMessageDialog(null, "Selecione um registro");
          return;
        }
        int id
                = Integer.parseInt(jTable.getValueAt(jTable.getSelectedRow(), 0).toString());
        new HeroiCadastroJFrame(id);
      }
    });
  }

  private void acaoApagar() {
    jButtonApagar.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
      }
    });
  }
}
