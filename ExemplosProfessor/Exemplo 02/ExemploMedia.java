import javax.swing.JOptionPane;

public class ExemploMedia{

   public static void main(String[] args){
      
      double nota1 = 10;
      double nota2 = 8.76;
      double nota3 = 4.32;
      double media = (nota1 + nota2 + nota3) / 3;
      JOptionPane.showMessageDialog(null, 
            "Nota 1: " + nota1 +
            "\nNota 2: " + nota2 +
            "\nNota 3: " + nota3 +
            "\nMédia: " + media
      );
   }

}