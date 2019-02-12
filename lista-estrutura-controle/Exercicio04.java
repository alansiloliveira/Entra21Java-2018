import javax.swing.JOptionPane;

public class Exercicio04{

    public static void main (String[] args){

       int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));

       if(num % 2 == 0){       
       JOptionPane.showMessageDialog(null, "O numero é par ");
       }else{
           JOptionPane.showMessageDialog(null, "O numero é impar ");
       }
    }
}