import javax.swing.JOptionPane;

public class Exercicio10{

   public static void main(String[] args){

      String nome = JOptionPane.showInputDialog(null, "Nome do usuário: ");
      int nascimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Data de nascimento: "));
      
      int idade = 2018 - nascimento;

      JOptionPane.showMessageDialog(null, "Nome do usuário: " + nome 
      + "\nIdade: " + idade);
      
   
   }


}