import javax.swing.JOptionPane;

public class Exercicio3{

   public static void main(String[] args){

      int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero: "));
      int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero: "));
      
      int soma = numero + numero1;
      int subtracao = numero - numero1;
      int multiplicacao = numero * numero1;
      double divisao = numero / numero1;
      int produto = (numero * numero) + (numero1 * numero1);

      JOptionPane.showMessageDialog(null,"Numero escolhido: " + numero
      + "\nNumero 2 escolhido: " + numero1
      + "\nSoma dos numeros: " + soma
      + "\nSubtra��o dos numeros: " + subtracao
      + "\nMultiplica��o dos numeros: " + multiplicacao
      + "\nDivisao dos numeros: " + divisao
      + "\nProduto dos numeros: " + produto);

      
      

   }   

}