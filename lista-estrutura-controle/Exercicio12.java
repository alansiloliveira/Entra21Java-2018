import javax.swing.JOptionPane;

public class Exercicio12{

    public static void main(String[] args){

        Double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um numero: "));
        Double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um numero: "));

        if (num1 > num2){
            JOptionPane.showMessageDialog(null, "Este numero é maior: " + num1);
        } else if (num2 > num1) {
            JOptionPane.showMessageDialog(null, "Este numero é maior: " + num2);
        }
    }
}