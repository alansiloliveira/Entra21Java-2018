import javax.swing.JOptionPane;

public class Exercicio22{

    public static void main(String[] args){

        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero: "));

        if(num1 == num2 && num1 == num3){
            JOptionPane.showMessageDialog(null, "Esses numeros podem ser um triangulo equilatero");
        }else if(num1 == num2 && num1 != num3){
            JOptionPane.showMessageDialog(null, "Esses numeros podem ser um triangulo isósceles");
        }else if(num1 != num2 && num1 != num3){
            JOptionPane.showMessageDialog(null, "Esses numeros podem er um triangulo escaleno");
        }
    }

}