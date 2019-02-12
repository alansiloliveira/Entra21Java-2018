import javax.swing.JOptionPane;

public class Exercicio4{

   public static void main(String[] args){

      int tabuada = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha um n�mero para realizar a tabuada"));
      
      int n1 = tabuada * 0;
      int n2 = tabuada * 1; 
      int n3 = tabuada * 2;
      int n4 = tabuada * 3;
      int n5 = tabuada * 4;
      int n6 = tabuada * 5;
      int n7 = tabuada * 6;
      int n8 = tabuada * 7;
      int n9 = tabuada * 8;
      int n10 = tabuada * 9;
      int n11 = tabuada * 10;

      JOptionPane.showMessageDialog(null,
      "Tabuada do: " + "\n" +
      tabuada + " x 0 = " + n1 + "\n"
      + tabuada + " x 1 = " + n2 + "\n"
      + tabuada + " x 2 = " + n3 + "\n"
      + tabuada + " x 3 = " + n4 + "\n"
      + tabuada + " x 4 = " + n5 + "\n"
      + tabuada + " x 5 = " + n6 + "\n"
      + tabuada + " x 6 = " + n7 + "\n"
      + tabuada + " x 7 = " + n8 + "\n"
      + tabuada + " x 8 = " + n9 + "\n"
      + tabuada + " x 9 = " + n10 + "\n"
      + tabuada + " x 10 = " + n11);

           
     
   }

}