import javax.swing.JOptionPane;

public class Exercicio13{

   public static void main(String[] args){

       int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero: "));
       int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero: "));

       if (num1 < num2){
           JOptionPane.showMessageDialog(null, "Este numero é menor: " + num1);
       } else if (num1 > num2) {
           JOptionPane.showMessageDialog(null, "Este numero e menor: " + num2);
       }
   }
}