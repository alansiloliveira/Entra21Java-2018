import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {

		int quantidade = Integer
				.parseInt(JOptionPane.showInputDialog("Digite a quantidade de camisas que vai regitrar"));
		//String pp = "PP", p = "P", m = "M", g = "G", gg = "GG", xgg = "XGG";
		int contpp = 0, cp = 0, cm = 0, cg = 0, cgg = 0, cxgg = 0;
		String[] tamanho = new String[quantidade];
		for (int i = 0; i < tamanho.length; i++) {
			tamanho[i] = JOptionPane.showInputDialog("Tamanho da peça").toUpperCase();
			if (tamanho[i].equalsIgnoreCase("PP")) {
				//pp = tamanho[i] + 1;
				contpp = contpp + 1;
			}
			if (tamanho[i].equalsIgnoreCase("P")) {
				//p = tamanho[i] + 1;
				cp = cp + 1;
			}
			if (tamanho[i].equalsIgnoreCase("M")) {
				//m = tamanho[i] + 1;
				cm = cm + 1;
			}
			if (tamanho[i].equalsIgnoreCase("G")) {
				//g = tamanho[i] + 1;
				cg = cg + 1;
			}
			if (tamanho[i].equalsIgnoreCase("GG")) {
				//gg = tamanho[i] + 1;
				cgg = cgg + 1;
			}
			if (tamanho[i].equalsIgnoreCase("XGG")) {
				//xgg = tamanho[i] + 1;
				cxgg = cxgg + 1;
			}
		}
		System.out.println("Contabilizando peças" +
							"\nPP - " + contpp +
							"\nP - " + cp +
							"\nM - " + cm +
							"\nG - " + cg +
							"\nGG - " + cgg +
							"\nXGG - " + cxgg);
							

	}

}
