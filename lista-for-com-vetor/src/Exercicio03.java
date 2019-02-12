import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de registros"));
		double preco = 0;
		double[] itens = new double[quantidade];
		for(int i = 0; i < itens.length; i++){;
			itens[i] += Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do item"));
			preco = preco + itens[i];
		}for(int i = 0; i < itens.length; i++){
		System.out.println((i+1)+"º preço é " + itens[i] + "R$");  
		}
		System.out.println("\nO total dos itens é " + preco + "R$");

	}

	}
