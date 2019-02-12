import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int nome = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de nomes que deseja registrar: "));
		String[] nomes = new String[nome];
		for(int i = 0; i < nomes.length; i++){
			nomes[i] = JOptionPane.showInputDialog("Digite o nome");
		}for(int i = 0; i < nomes.length; i++){
		System.out.println(nomes[i]);}
		//JOptionPane.showMessageDialog(null, nomes[i]);
		
	}

}

