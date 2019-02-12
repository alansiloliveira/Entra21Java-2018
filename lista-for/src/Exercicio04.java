import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args){
		
		String texto = "";
		
		for(int linha = 0; linha < 21; linha++){
			for(int coluna = 0; coluna < 21; coluna++){
				if(linha == 0 || linha == 20 || coluna == 0 || coluna == 20){
					texto += "* ";
				}else if(linha == coluna
						|| linha + coluna == 20
						|| coluna == 10
						|| linha == 10){
						texto += "* ";
				}else{
					texto += "  ";
				}
			}
			texto += "\n";
	}
		System.out.println(texto);
}

}
