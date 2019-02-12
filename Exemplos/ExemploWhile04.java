import javax.swing.JOptionPane;

public class ExemploWhile04{

    public static void main(String[] args){

        String nome = JOptionPane.showInputDialog(null, "Digite o seu nome");

        /*
        while (!nome.equalsIgnoreCase("sair") &&
            !nome.equalsIgnoreCase("fim")){
        */
            double somaMedia = 0;
            int quantidadeTotalDeAlunos = 0;
            while(!nome.equalsIgnoreCase("sair")){
                double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua nota"));
                double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
                double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota"));

                double media = (nota1 + nota2 + nota3) / 3;

                JOptionPane.showMessageDialog(null, "Olá " + nome + " sua média é " + media);
                somaMedia = somaMedia + media;
                quantidadeTotalDeAlunos = quantidadeTotalDeAlunos + 1;

                if(media < 7){
                    JOptionPane.showMessageDialog(null, "Reprovado jovi");
                }else{
                    JOptionPane.showMessageDialog(null, "Jovem padawan");
                }

                nome = JOptionPane.showInputDialog("Digite seu nome. \nSe desejar sair digite \"Sair\"");
                }
                double mediaDasMedias = somaMedia / quantidadeTotalDeAlunos;
                JOptionPane.showMessageDialog(null, "Média das medias é: " + mediaDasMedias);
    }
}