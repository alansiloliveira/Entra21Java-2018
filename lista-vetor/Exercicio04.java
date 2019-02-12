import javax.swing.JOptionPane;

public class Exercicio04{

    public static void main(String[] args){

        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        String materia = JOptionPane.showInputDialog("Digite a matéria: ");

        double[]notas = new double[4];
        notas[0] = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        notas[1] = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
        notas[2] = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));
        notas[3] = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota: "));

        double media = (notas[0] + notas[1] + notas[2] + notas[3]) / notas.length;
        String resultado = "Você esta aprovado!";

        if(media < 7){
            resultado = "Você esta reprovado!"; 
        }

        JOptionPane.showMessageDialog(null, "Nome do aluno: " + nome + 
        "\nMatéria: " + materia +
        "\nPrimeiro Bimestre: " + notas[0] +
        "\nSegundo Bimestre: " + notas[1] +
        "\nTerceiro Bimestre: " + notas[2] + 
        "\nQuarto Bimestre: " + notas[3] + 
        "\nMédia: " + media + 
        "\n" + resultado);
    }
}