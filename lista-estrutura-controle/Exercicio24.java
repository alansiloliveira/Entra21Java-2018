import javax.swing.JOptionPane;

public class Exercicio24{

    public static void main(String[] args){

        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da sua compra: "));
        double desconto = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do desconto: "));

        double porcento = (desconto * 100) / valor;

        JOptionPane.showMessageDialog(null, "Você ganhou: " + porcento + "%");


    }
}