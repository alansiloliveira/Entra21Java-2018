import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de registros"));
		double preco = 0;
		double[] itens = new double[quantidade];
		for(int i = 0; i < itens.length; i++){;
			itens[i] += Double.parseDouble(JOptionPane.showInputDialog("Digite o pre�o do item"));
			preco = preco + itens[i];
		}for(int i = 0; i < itens.length; i++){
		System.out.println((i+1)+"� pre�o � " + itens[i] + "R$");  
		}
		System.out.println("\nO total dos itens � " + preco + "R$");

	}

	}
