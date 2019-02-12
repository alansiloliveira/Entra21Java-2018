import javax.swing.JOptionPane;

public class Exercicio01{

   public static void main(String[] args){
 
      int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
            if (numero > 0){
      JOptionPane.showMessageDialog(null, "E positivo");
      } else {
      JOptionPane.showMessageDialog(null, "Não é positivo");
      

      } 
      
      }
   
}