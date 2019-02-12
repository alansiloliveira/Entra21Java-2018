import javax.swing.JOptionPane;

public class Exercicio02{

    public static void main(String[] args){

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite uma idade"));
        while(idade <= 128){
            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite uma idade"));
        }
    }
}