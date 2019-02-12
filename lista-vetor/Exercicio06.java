import javax.swing.JOptionPane;

public class Exercicio06{

    public static void main(String[] args){

        int numero = 9, maiorIdade = 0;
        String[] nomes = new String[numero];
        int[] idade = new int[numero];
        String nomeIdade = " ";
        
        nomes[0] = JOptionPane.showInputDialog("Digite o nome do cliente: ");
        idade[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do cliente: "));
        if(idade[0] > maiorIdade){
            maiorIdade = idade[0];
            nomeIdade = nomes[0];
        }
        nomes[1] = JOptionPane.showInputDialog("Digite o nome do cliente: ");
        idade[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do cliente: "));
        if(idade[1] > maiorIdade){
            maiorIdade = idade[1];
            nomeIdade = nomes[1];
        }
        nomes[2] = JOptionPane.showInputDialog("Digite o nome do cliente: ");
        idade[2] = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do cliente: "));
        if(idade[2] > maiorIdade){
            maiorIdade = idade[2];
            nomeIdade = nomes[2];
        }
        nomes[3] = JOptionPane.showInputDialog("Digite o nome do cliente: ");
        idade[3] = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do cliente: "));
        if(idade[3] > maiorIdade){
            maiorIdade = idade[3];
            nomeIdade = nomes[3];
        }
        nomes[4] = JOptionPane.showInputDialog("Digite o nome do cliente: ");
        idade[4] = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do cliente: "));
        if(idade[4] > maiorIdade){
            maiorIdade = idade[4];
            nomeIdade = nomes[4];
        }
        nomes[5] = JOptionPane.showInputDialog("Digite o nome do cliente: ");
        idade[5] = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do cliente: "));
        if(idade[5] > maiorIdade){
            maiorIdade = idade[5];
            nomeIdade = nomes[5];
        }
        nomes[6] = JOptionPane.showInputDialog("Digite o nome do cliente: ");
        idade[6] = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do cliente: "));
        if(idade[6] > maiorIdade){
            maiorIdade = idade[6];
            nomeIdade = nomes[6];
        }
        nomes[7] = JOptionPane.showInputDialog("Digite o nome do cliente: ");
        idade[7] = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do cliente: "));
        if(idade[7] > maiorIdade){
            maiorIdade = idade[7];
            nomeIdade = nomes[7];
        }
        nomes[8] = JOptionPane.showInputDialog("Digite o nome do cliente: ");
        idade[8] = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do cliente: "));
        if(idade[8] > maiorIdade){
            maiorIdade = idade[8];
            nomeIdade = nomes[8];
        }

        JOptionPane.showMessageDialog(null, "O cliente com a maior idade é: " + nomeIdade + " que tem " + maiorIdade + " anos");
        
    }
}