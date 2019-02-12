import javax.swing.JOptionPane;

public class Exercicio26{

    public static void main(String[] args){

        double desconto1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do desconto: "));
        double desconto2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a porcentagem do desconto: "));

        double valor = (desconto1 * 100) / desconto2;

        JOptionPane.showMessageDialog(null, "O valor total da sua compra é: " + valor + "R$");
    }
}