import javax.swing.JOptionPane;

public class Exercicio06{

    public static void main(String[] args){

        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero"));

        if (num != 1){
            JOptionPane.showMessageDialog(null, "Numero é diferente de 1");
        }else if (num == 1){
            JOptionPane.showMessageDialog(null, "Esse numero é 1");
        }

    }
}