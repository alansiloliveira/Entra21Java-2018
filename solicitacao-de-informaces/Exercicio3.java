import javax.swing.JOptionPane;

public class Exercicio3{

   public static void main(String[] args){

      int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
      int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
      
      int soma = numero + numero1;
      int subtracao = numero - numero1;
      int multiplicacao = numero * numero1;
      double divisao = numero / numero1;
      int produto = (numero * numero) + (numero1 * numero1);

      JOptionPane.showMessageDialog(null,"Numero escolhido: " + numero
      + "\nNumero 2 escolhido: " + numero1
      + "\nSoma dos numeros: " + soma
      + "\nSubtração dos numeros: " + subtracao
      + "\nMultiplicação dos numeros: " + multiplicacao
      + "\nDivisao dos numeros: " + divisao
      + "\nProduto dos numeros: " + produto);

      
      

   }   

}