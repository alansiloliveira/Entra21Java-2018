import javax.swing.JOptionPane;

public class ExemploJOptionPane{

   public static void main(String[] args){
      JOptionPane.showMessageDialog(null, "Ol� Mundo");

      String nome = "Francisco";
      String sobrenome = "Lucas Sens";
      JOptionPane.showMessageDialog(null, nome + " " + sobrenome);
   }

}