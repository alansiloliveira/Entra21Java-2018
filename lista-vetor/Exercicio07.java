import javax.swing.JOptionPane;

public class Exercicio07{

    public static void main(String[] args){

        String nomeMenor = " ";
        int numero = 4;
        double alturaMenor = 0;
        double[] altura = new double[numero];
        String[] nomes = new String[numero];

        nomes[0] = JOptionPane.showInputDialog("Digite qual animal é: ");
        altura[0] = Double.parseDouble(JOptionPane.showInputDialog("Qual a altura dele: "));
        if(altura[0] > alturaMenor){
            alturaMenor = altura[0];
            nomeMenor = nomes[0];
        }
        nomes[1] = JOptionPane.showInputDialog("Digite qual animal é: ");
        altura[1] = Double.parseDouble(JOptionPane.showInputDialog("Qual a altura dele: "));
        if(altura[1] > alturaMenor){
            alturaMenor = altura[1];
            nomeMenor = nomes[1];
        }
        nomes[2] = JOptionPane.showInputDialog("Digite qual animal é: ");
        altura[2] = Double.parseDouble(JOptionPane.showInputDialog("Qual a altura dele: "));
        if(altura[2] > alturaMenor){
            alturaMenor = altura[2];
            nomeMenor = nomes[2];
        }
        nomes[3] = JOptionPane.showInputDialog("Digite qual animal é: ");
        altura[3] = Double.parseDouble(JOptionPane.showInputDialog("Qual a altura dele: "));
        if(altura[3] > alturaMenor){
            alturaMenor = altura[3];
            nomeMenor = nomes[3];
        }
        
        JOptionPane.showMessageDialog(null, "O animal é " + nomeMenor + " com " + alturaMenor + " de altura.");
    }
}