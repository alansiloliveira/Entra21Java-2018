import javax.swing.JOptionPane;

public class ExemploJOptionPaneInputDialog{

   public static void main(String[] args){

     // permitir o usuário digitar seu nome 
     String Nome = JOptionPane.showInputDialog("Nome");    
     String Sobrenome = JOptionPane.showInputDialog("Sobrenome");
     String NomeCompleto = nome + " " + sobrenome;

     int idade = Integer.parseInt(
		JOptionPane.showInputDialog("Idade")
	);
     
     JOptionPane.showMessageDialog(null, "Nome Completo: " + nomecompleto + "\nIdade: " + idade);
     
   }

}
