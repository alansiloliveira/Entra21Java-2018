import javax.swing.JOptionPane;

public class Exercicio2{

   public static void main(String[] args){

      //Calculando Quantidade de água e preço pago por ano.
      double quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Quantidade consumida por dia: "));
      int anos = Integer.parseInt(JOptionPane.showInputDialog(null, "Anos consumido: "));
      double preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Preço pago por litro: "));  
      
      double quantidade1 = (quantidade * 365);
      double quantidade2 = (quantidade1 * anos * preco);

      JOptionPane.showMessageDialog(null, "Litros de agua consumida no ano: " + quantidade1 +
      "\nDinheiro gasto em todos anos: " + quantidade2);
   }

}