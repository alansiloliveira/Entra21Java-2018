import javax.swing.JOptionPane;

public class Exercicio9{

   public static void main(String[] args){

      int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero"));
      int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero"));
      int c = a;
      
      JOptionPane.showMessageDialog(null, "Os n�meros selecionados foram" + "\nA: " + b + "\nB: " + c);
      
   }

}