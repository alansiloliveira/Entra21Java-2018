import javax.swing.JOptionPane;

public class Exercicio25{

    public static void main(String[] args){

        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da sua compra: "));
        double desconto = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o percentual de desconto: "));

        double desconto2 = (valor * desconto) / 100;

        JOptionPane.showMessageDialog(null, "Você teve " + desconto2 + "R$ de desconto");


    }
}