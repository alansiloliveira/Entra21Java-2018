import javax.swing.JOptionPane;

public class Exercicio03{

    public static void main(String[] args){

        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: "));

        double contaPeso = 0;
        int contador = 0;
        while((peso > 0) && (peso < 300)){
            contador = contador + 1;
            contaPeso = contaPeso + peso; 
            peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: "));         
        }
        JOptionPane.showMessageDialog(null, "Peso das pessoas que informaram: " + (contaPeso / contador) + "\nQuantidades de pessoas que informaram: " + contador);
    }
}