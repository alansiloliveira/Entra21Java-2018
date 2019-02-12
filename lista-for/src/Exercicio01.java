import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {

		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Tabuada \nDigite o número desejado: "));
		String texto = "Tabuada do " + tabuada;

		for (int i = 0; i < 11; i++) {             
			texto+="\n"+ tabuada + " x " + i + ": " + (i * tabuada); 
			
		}
		JOptionPane.showMessageDialog(null, texto);
	}
}
              