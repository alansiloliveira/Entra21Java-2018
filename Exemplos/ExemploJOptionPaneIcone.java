import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ExemploJOptionPaneIcone{

    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Olá Mundo",
        "Sistema da Vovo", JOptionPane.WARNING_MESSAGE,
        new ImageIcon(
             ExemploJOptionPaneIcone.class.getResource("/imagens/bug.png"))
             
        );
            }
}