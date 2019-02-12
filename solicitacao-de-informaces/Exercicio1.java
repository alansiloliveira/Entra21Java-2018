import javax.swing.JOptionPane;

public class Exercicio1{

   public static void main(String[] args){
   
      // Solicitando um numero e mostrando seu sucessor e antecessor
      int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "N�mero"));
      int sucessor = numero + 1;
      int antecessor = numero - 1;
      
      JOptionPane.showMessageDialog(null, "Numero: " + numero
      + "\nSucessor: " + sucessor + "\nAntecessor" + antecessor);

   }

}

