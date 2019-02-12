package view;

import bean.HeroiBean;
import dao.HeroiDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * @author Francisco Lucas Sens
 */
public class HeroiCadastroJFrame {

  private JFrame jFrame;
  private JButton jButtonSalvar;
  private HeroiDAO heroiDAO;

  public HeroiCadastroJFrame() {
    inicializarComponentes();
    jFrame.setVisible(true);

  }

  public void inicializarComponentes() {
    heroiDAO = new HeroiDAO();
    instanciarComponentes();
    configurarTela();
    definirLocalizacoes();
    definirDimensoes();
    adicionarComponentes();
    acaoNovo();
  }

  HeroiCadastroJFrame(int id) {
    inicializarComponentes();
    HeroiBean heroi = heroiDAO.obterPeloId(id);

    jFrame.setVisible(true);

  }

  private void configurarTela() {
    jFrame.setSize(700, 600);
    jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    jFrame.setLocationRelativeTo(null);
    jFrame.setLayout(null);
  }

  private void instanciarComponentes() {
    jFrame = new JFrame("Cadastro de heroi");
    jButtonSalvar = new JButton("Salvar");
  }

  private void definirLocalizacoes() {
  }

  private void definirDimensoes() {
  }

  private void adicionarComponentes() {
  }

  private void acaoNovo() {
    jButtonSalvar.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
      }
    });
  }
}
