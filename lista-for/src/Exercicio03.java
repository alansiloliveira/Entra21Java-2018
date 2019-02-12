import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {

		String texto = "";

		

		for (int i = 1; i < 15; i++) {
			for (int j = 1; j < 15; j++) {
				texto += "*" ;
				
				

				// System.out.print("*");
			}
			texto += "\n" ;
		}
		// System.out.println("");
	
		JOptionPane.showMessageDialog(null,  texto);

	}
}
