import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {

		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Tabela de Jogos" + "\nQuantidade de registros: "));
		String nomes[] = new String[qtd];
		int qtdJogos[] = new int[qtd];

		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = JOptionPane.showInputDialog("Digite o nome do jogo");
			qtdJogos[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de jogos"));

		}
		System.out.println("Tabela de jogos" + "\nJogos" + "\t\tQuantidade" + "\n");

		for (int i = 0; i < nomes.length; i++)

			System.out.println((i + 1) + " - " + nomes[i] + "\t\t" + qtdJogos[i]);

	}

}
