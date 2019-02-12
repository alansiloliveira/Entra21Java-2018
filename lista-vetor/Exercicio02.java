import javax.swing.JOptionPane;

public class Exercicio02{

    public static void main(String[] args){

        String[]nomes = new String[10];

        nomes[0] = "Alan";
        nomes[1] = "Roberta";
        nomes[2] = "Shaiane";
        nomes[3] = "Eduarda";
        nomes[4] = "Silva";
        nomes[5] = "Fábio";
        nomes[6] = "Camila";
        nomes[7] = "Felipe";
        nomes[8] = "Cleiton";
        nomes[9] = "Rose";

        

        JOptionPane.showMessageDialog(null,
        "Nome guardados em 10 vetores: " + nomes[0] + ", " + nomes[1] + ", " + nomes[2] + ", " + nomes[3] + ", " + nomes[4] + ", " + nomes[5] + ", " + nomes[6] + ", " + nomes[7] + ", " + nomes[8] + ", " + nomes[9]);
    }
}