import javax.swing.JOptionPane;

public class Exercicio15{

    public static void main(String[] args){

        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero: "));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero: "));

        if (num1 < num2 && num1 < num3 && num2 < num3){
            JOptionPane.showMessageDialog(null, "A ordem Decrescente dos mesmos é : \n" + num1 + "\n" + num2 + "\n" + num3);
        } else if (num2 < num1 && num2 < num3 && num1 < num3){
            JOptionPane.showMessageDialog(null, "A ordem decrecente dos mesmos é: \n" + num2 + "\n" + num1 + "\n" + num3);
        } else if (num3 < num1 && num3 < num2 && num1 < num2){
            JOptionPane.showMessageDialog(null, "A ordem decrescente do mesmos é: \n" + num3 + "\n" + num1 + "\n" + num2);
        }
    }
}