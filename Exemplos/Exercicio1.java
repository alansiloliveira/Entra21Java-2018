import javax.swing.JOptionPane;

public class Exercicio1{

   public static void main(String[] args){
      
      String nome = JOptionPane.showInputDialog(null, "Nome: ");
      String corPreferida = JOptionPane.showInputDialog(null, "Cor Preferida: ");
      int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Idade"));
      double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Peso: "));  
      double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Altura: "));
      String bairro = JOptionPane.showInputDialog(null, "Bairro: ");
      String numero = JOptionPane.showInputDialog(null, "Número: ");
      String cidade = JOptionPane.showInputDialog(null, "Cidade: "); 
      String telefone = JOptionPane.showInputDialog(null, "Telefone: ");
      String cep = JOptionPane.showInputDialog(null, "CEP: ");
      String estado = JOptionPane.showInputDialog(null, "Estado: ");
      String cpf = JOptionPane.showInputDialog(null, "CPF: ");   

      JOptionPane.showMessageDialog(null, "Nome: " + nome 
      + "\nCor Preferida: " + corPreferida 
      + "\nIdade: " + idade 
      + "\nPeso: " + peso
      + "\nAltura: " + altura
      + "\nBairro: " + bairro
      + "\nNúmero: " + numero
      + "\nCidade: " + cidade
      + "\nTelefone: " + telefone
      + "\nCEP: " + cep
      + "\nEstado: " + estado
      + "\nCPF: " + cpf);
 	 
	}


}