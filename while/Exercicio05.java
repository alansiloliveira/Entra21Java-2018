import javax.swing.JOptionPane;

public class Exercicio05{
    
    public static void main(String[] args) {

        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero: "));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro numero: "));

        int opcao = 0;
        
        while(opcao != 5){
        opcao = Integer.parseInt(JOptionPane.showInputDialog("            Menu" +
        "\n1.                    Soma" +
        "\n2.                    Subtrair" +
        "\n3.                    Multiplicar" + 
        "\n4.                    Dividir" +
        "\n5.                    Sair"));

        if(opcao == 1){
            JOptionPane.showMessageDialog(null, "A soma é: " + (num1 + num2));
        }else if(opcao == 2){
            JOptionPane.showMessageDialog(null, "A subtração é: " + (num1 - num2));
        }else if(opcao == 3){
            JOptionPane.showMessageDialog(null, "A multiplicação é: " + (num1 * num2));
        }else if(opcao == 4){
            JOptionPane.showMessageDialog(null, "A divisao é: " + (num1 / num2));
        }}
    }
}