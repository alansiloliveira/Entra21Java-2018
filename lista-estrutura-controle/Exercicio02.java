import javax.swing.JOptionPane;

public class Exercicio02{

    public static void main(String[] args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
                if (numero <= -1 ){
        JOptionPane.showMessageDialog(null, "É negativo");}
        else { 
            JOptionPane.showMessageDialog(null, "Nao é negativo");
        }
    }
}