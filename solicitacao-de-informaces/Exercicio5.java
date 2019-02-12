import javax.swing.JOptionPane;

public class Exercicio5{

   public static void main(String[] args){

      String nome = JOptionPane.showInputDialog(null, "Nome do carro: ");
      double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do carro: "));
      double parcela = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor de cada parcela: "));
      double quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Quantidade de parcelas: "));

      double valortotal = parcela * quantidade;
      double valortotal1 = valortotal - valor;

      JOptionPane.showMessageDialog(null, "Nome do Carro:      " + nome 
      + "\nValor do Carro:      " + valor
      + "\nValor do Financiamento:      " + valortotal
      + "\nDiferença entre o valor total do financiamento e valor do carro:      " + valortotal1);

   }


}