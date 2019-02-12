import javax.swing.JOptionPane;

public class Exercicio03{

    public static void main (String[] args){

        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero: "));
        
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero: "));

        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opção" + 
        "\n\n1 .                             Somar"
        + "\n2 .                             Subtrair"
        + "\n3 .                             Multiplicar"
        + "\n4 .                             Dividir"));

        if (opcao == 1) {
            int soma = num1 + num2;
            JOptionPane.showMessageDialog(null, "A soma delas é: " + soma);
        }else if(opcao == 2){
            int subtracao = num1 - num2;
            JOptionPane.showMessageDialog(null, "A subtracao é: " + subtracao);
        }else if(opcao == 3){
            int multiplicacao = num1 * num2;
            JOptionPane.showMessageDialog(null, "A multiplicacao é: " + multiplicacao);
        }else if(opcao == 4){
            int divisao = num1 / num2;
            JOptionPane.showMessageDialog(null, "A divisao e: " + divisao);
        }

        
                }
        


}