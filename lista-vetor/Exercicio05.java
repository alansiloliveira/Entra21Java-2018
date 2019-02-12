import javax.swing.JOptionPane;

public class Exercicio05{

    public static void main(String[] args){

        double[]pesos = new double[5];
        pesos[0] = Double.parseDouble(JOptionPane.showInputDialog("Digite um peso: "));
        pesos[1] = Double.parseDouble(JOptionPane.showInputDialog("Digite um peso: "));
        pesos[2] = Double.parseDouble(JOptionPane.showInputDialog("Digite um peso: "));
        pesos[3] = Double.parseDouble(JOptionPane.showInputDialog("Digite um peso: "));
        pesos[4] = Double.parseDouble(JOptionPane.showInputDialog("Digite um peso: "));        

        double soma = pesos[0] + pesos[1] + pesos[2] + pesos[3] + pesos[4];
        double media = soma / pesos.length;
        //int tamanho = pesos.length;

        JOptionPane.showMessageDialog(null, "A soma dos pesos são: " + soma + "\nE a média dos mesmo são: " + media);
    }
}