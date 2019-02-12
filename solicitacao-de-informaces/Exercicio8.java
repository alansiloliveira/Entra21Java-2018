import javax.swing.JOptionPane;

public class Exercicio8{
 
   public static void main(String[] args){

      double luz = Double.parseDouble(JOptionPane.showInputDialog(null, "Conta de luz: "));
      double agua = Double.parseDouble(JOptionPane.showInputDialog(null, "Conta de agua: "));
      double net = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor da NET: "));
      double vivo = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor da VIVO: "));
      double oi = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor da OI: "));
      double iptu = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do IPTU: "));
      double ipva = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do IPVA: "));
      double seguro = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do Seguro do carro: "));

      double telefone = net + vivo + oi;
      double impostos = iptu + ipva;
      double contas = luz + agua + seguro;
      double total = telefone + impostos + contas;

      JOptionPane.showMessageDialog(null, "Contas do mês: " 
      + "\nValor das contas de Telefone: " + telefone
      + "\nValor dos Impostos: " + impostos
      + "\nValor do restante das constas: " + contas
      + "\nValor total das contas: " + total);

   }

}