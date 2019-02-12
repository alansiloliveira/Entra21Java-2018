import javax.swing.JOptionPane;

public class Exercicio07{

    public static void main(String[] args){

        String nome = " ", maiorNome = " ", menorNome = " ", nomeCartaoAmareloMin = " ", nomeCartaoAmareloMax = " ", nomeCartaoVermelhoMin = "", nomeCartaoVermelhoMax = "";
        int numeroJogadores = 22, idade = 0, altura = 0;
        double peso = 0;
        double menorPeso = Integer.MAX_VALUE;
        double maiorPeso = Integer.MIN_VALUE;
        double menorAltura = Integer.MAX_VALUE;
        double maiorAltura = Integer.MIN_VALUE;
        int quantidadeFeminino = 0, quantidadeMasculino = 0, gols = 0, cartaoAmarelo = 0, cartaoVermelho = 0;
        int menorCartaoAmarelo = Integer.MAX_VALUE, maiorCartaoAmarelo = Integer.MIN_VALUE;
        int menorCartaoVermelho = Integer.MAX_VALUE, maiorCartaoVermelho = Integer.MIN_VALUE;

        while(numeroJogadores < 23){
            nome = JOptionPane.showInputDialog("Digite o nome do jogador: ");
            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
            peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: "));
            char sexo = JOptionPane.showInputDialog(null,
            "Selecione o sexo do jogador",
            "Sistema",
            JOptionPane.QUESTION_MESSAGE, 
            null,
            new Object[]{"Selecione o sexo do jogador", "M", "F"},
            "Selecione o sexo do jogador")
            .toString().charAt(0);
            gols = Integer.parseInt(JOptionPane.showInputDialog("Quantidades de gols marcados: "));
            cartaoAmarelo = Integer.parseInt(JOptionPane.showInputDialog("Quantidades de cartões amarelos: "));
            cartaoVermelho = Integer.parseInt(JOptionPane.showInputDialog("Quantidades de cartões vermelhos: "));
            numeroJogadores = numeroJogadores - 1;


        if(sexo == 'M'){
            quantidadeMasculino = quantidadeMasculino + 1;
        }else if(sexo == 'F'){
            quantidadeFeminino = quantidadeFeminino + 1;
        }if(maiorNome.length() > nome.length()){
            maiorNome = nome;
        }if(menorNome.length() < nome.length()){
            menorNome = nome;
        }if(maiorAltura > altura){
            maiorAltura = altura;
        }if(menorAltura < altura){
            menorAltura = altura;
        }if(maiorCartaoAmarelo > cartaoAmarelo){
            maiorCartaoAmarelo = cartaoAmarelo; 
            nomeCartaoAmareloMax = nome;
        }if(menorCartaoAmarelo < cartaoAmarelo){
            menorCartaoAmarelo = cartaoAmarelo;
            nomeCartaoAmareloMin = nome;
        }if(maiorCartaoVermelho > cartaoVermelho){
            maiorCartaoVermelho = cartaoVermelho;
            nomeCartaoVermelhoMax = nome;
        }if(menorCartaoVermelho < cartaoVermelho){
            menorCartaoVermelho = cartaoVermelho;
            nomeCartaoVermelhoMin = nome;
        }if(maiorPeso > peso){
            maiorPeso = peso;
        }if(menorPeso < peso){
            menorPeso = peso;
        }
        }

        JOptionPane.showMessageDialog(null,
        "Existem 22 jogadores " + quantidadeMasculino + " homens e " + quantidadeFeminino + " mulheres" + 
        "\nO jogador com maior nome é " + maiorNome + "\nE com menor nome é " + menorNome + 
        "\nCom a maior altura é " + maiorAltura + "\nE menor altura " + menorAltura + 
        "\nCom o maior peso " + maiorPeso + "\nE menor peso " + menorPeso + 
        "\nO jogador com maior quantidade de cartõe amarelo " + nomeCartaoAmareloMax + 
        "\nQue levou " + maiorCartaoAmarelo +
        "\nE o que menos levou foi " + nomeCartaoAmareloMin + 
        "\nQue levou " + menorCartaoAmarelo +
        "\nO jogador com maior quantidade de cartões vermelho foi " + nomeCartaoVermelhoMax +
        "\nQue levou " + maiorCartaoAmarelo +
        "\nE o que menos levou foi " + nomeCartaoVermelhoMin +
        "\nCom " + menorCartaoVermelho);

    }
    
}