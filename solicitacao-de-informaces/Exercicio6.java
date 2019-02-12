import javax.swing.JOptionPane;

public class Exercicio6{

   public static void main(String[] args){

      double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota 1: "));
      double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota 2: "));
      double nota3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota 3: "));
      double nota4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota 4: "));
 
      double media = (nota1 + nota2 + nota3 + nota4) / 4;
      JOptionPane.showMessageDialog(null, "Nota 1: " + nota1 
      + "\nNota 2: " + nota2
      + "\nNota 3: " + nota3
      + "\nNota 4: " + nota4
      + "\nMédia do aluno: " + media);
     
   }


}