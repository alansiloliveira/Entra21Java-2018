import javax.swing.JOptionPane;

public class Exercicio09s{

    public static void main(String[] args){

    int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero"));
    int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero"));
    int num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero"));
    int num4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero"));

    if (num1 == num2 && num1 == num3 && num1 == num 4){
        JOptionPane.showMessageDialog(null, "E um quadrado");
    } else {
        JOptionPane.showMessageDialog(null, "Nao e um quadrado");
    }
    }
}