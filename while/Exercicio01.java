import javax.swing.JOptionPane;

public class Exercicio01{

    public static void main(String[] args){

        String nome = "";
        while(!nome.equalsIgnoreCase("Fim")){
            nome = JOptionPane.showInputDialog("Digite o seu nome"); 
        }


    }
}