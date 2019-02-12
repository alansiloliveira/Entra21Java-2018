import javax.swing.JOptionPane;

public class Exercicio03{

    public static void main(String[] args){

        String[]nome = new String[2];
        
        nome[0] = "Super Mercado";
        nome[1] = "Padaria"; 

        double[]produtos = new double[7];

        produtos[0] = 9.50;
        produtos[1] = 2;
        produtos[2] = 3.23;
        produtos[3] = 6;
        produtos[4] = 22;
        produtos[5] = 25.5;
        produtos[6] = 5.5;

        double produtosMedia = (produtos[0] + produtos[1] + produtos[2] + produtos[3] + produtos[4] + produtos[5] + produtos[6]) / produtos.length;
        
        JOptionPane.showMessageDialog(null,
        nome[0] + " e " + nome[1] + "\nO preço dos produtos são: " +
        produtos[0] + "R$, " + produtos[1] + "R$, " + produtos[2] + "R$, " + produtos[3] + "R$, " + produtos[4] + "R$, " + produtos[5] + "R$, " + 
        produtos[6] + "R$, " + 
        "\nE a médias dos produtos foram: " + produtosMedia + "R$");
    }
}