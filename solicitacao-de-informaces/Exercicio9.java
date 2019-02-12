import javax.swing.JOptionPane;

public class Exercicio9{

   public static void main(String[] args){

      int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número"));
      int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número"));
      int c = a;
      
      JOptionPane.showMessageDialog(null, "Os números selecionados foram" + "\nA: " + b + "\nB: " + c);
      
   }

}