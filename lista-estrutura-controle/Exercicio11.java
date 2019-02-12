import javax.swing.JOptionPane;

public class Exercicio11 {

    public static void main(String[] args){

         double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota do primeiro bimestre: "));
         double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a nota do segundo bimestre: "));
         double nota3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a nota do terceiro bimestre: "));
         double nota4 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a nota do quarto bimestre: "));
         double nota5 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota do quinto bimestre: "));

         double media = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;

         if (media <= 5.99){
             JOptionPane.showMessageDialog(null, "Reprovado");
         } else if (media > 6 && media < 7.99) {
             JOptionPane.showMessageDialog(null, "Recuperação");
         } else if (media > 7.99) {
             JOptionPane.showMessageDialog(null, "Aprovado");
         }
         
    }
}