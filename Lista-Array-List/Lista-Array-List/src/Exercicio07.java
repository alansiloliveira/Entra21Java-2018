
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class Exercicio07 {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Character> vogais = new ArrayList<>();

        int quantidadeVogais = 0;
        String texto = "";
        String maiorNome = "";
        String menorNome = "fadsfgasdgasfgdsfga";
        int quantidadePaulo = 0;
        int quantidadeAna = 0;
        for (int i = 0; i < 5; i++) {
            nomes.add(JOptionPane.showInputDialog("Digite um nome").trim());
            vogais.add(nomes.get(i).charAt(0));
            texto += nomes.get(i) + "\n";

            if (vogais.get(i) == 'A' || vogais.get(i) == 'E' || vogais.get(i) == 'I' || vogais.get(i) == 'O' || vogais.get(i) == 'U') {
                quantidadeVogais++;
            }
            if (nomes.get(i).equalsIgnoreCase("Paulo")) {
                quantidadePaulo++;
            }
            if (nomes.get(i).equalsIgnoreCase("Ana")) {
                quantidadeAna++;
            }
            if (nomes.get(i).length() > maiorNome.length()) {
                maiorNome = nomes.get(i);
            }
            if (nomes.get(i).length() < menorNome.length()) {
                menorNome = nomes.get(i);
            }

        }
            JOptionPane.showMessageDialog(null,
                    "Nomes: " + texto
                    + "\nQuantidade de vogais: " + quantidadeVogais
                    + "\nQuantidade de Paulos: " + quantidadePaulo
                    + "\nQuantidade de Anas: " + quantidadeAna
                    + "\nMaior nome: " + maiorNome
                    + "\nMenos nome: " + menorNome);
    }
}

         //Descobrindo numero tabela ASCII
//String nome = "Paulo";
//int numeroTabeloASCII = (int) nome.charAt(0);
//if(numeroTabeloASCII == 65 || numeroTabeloASCII == 69 )
//System.out.println(numeroTabeloASCII);
//}

