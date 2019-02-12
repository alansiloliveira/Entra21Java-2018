import javax.swing.JOptionPane;

public class Exercicio10 {

    public static void main(String[] args){

        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero"));
        int num4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero"));
    
    if (num1 == num2 && num1 != num3 && num3 == num4 || num1 == num3 && num2 == num4 && num1 != num2 || num1 == num4 && num1 != num2 && num2 == num3){
        JOptionPane.showMessageDialog(null, "E um retangulo");
    } else {
        JOptionPane.showMessageDialog(null, "Nao e um retangulo");
    }
    

    }

}