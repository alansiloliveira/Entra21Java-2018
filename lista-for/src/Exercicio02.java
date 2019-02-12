import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
		
		String texto = "";
		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				texto+= (i + " x " + j + "= " + (i * j) + "\n");
			}
			JOptionPane.showMessageDialog(null, "Tabuadas: " + "\n" + texto);
			texto = "";
		}

	}

}
