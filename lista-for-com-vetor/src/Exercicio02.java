import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog(
				"Quantidade de idades que deseja registrar "));
		int[] idades = new int[quantidade];
		for(int i = 0; i < idades.length; i++){
			idades[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do usuario"));
		}for(int i = 0; i < idades.length; i++){
			System.out.println(idades[i]);
			
		}

	}

}
