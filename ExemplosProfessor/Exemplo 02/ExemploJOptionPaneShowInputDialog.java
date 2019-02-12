import javax.swing.JOptionPane;

public class ExemploJOptionPaneShowInputDialog{

   public static void main(String[] args){
	String nome = JOptionPane.showInputDialog("Nome");
	String sobrenome = JOptionPane.showInputDialog("Sobrenome");


	// int numero = Integer.parseInt("2");
	int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));

//Double.parseDouble("2.30");
//Boolean.parseBoolean("verdadeiro"); 
//   012345678
//"Olá Mundo".charAt(0)

	JOptionPane.showMessageDialog(null, nome + " "+ sobrenome + " com " + idade + " anos.");
   }

}