import java.util.Random;

import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {

		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de numeros que deseja digitar: "));
		Random num = new Random();
		int numero[] = new int[quantidade];
		double numTotal = 0, media = 0;
		int par = 0, impar = 0, positivo = 0, negativo = 0, neutro = 0;

		for (int i = 0; i < numero.length; i++) {
			numero[i] = num.nextInt(20);
			numTotal += numero[i];
			media = (numTotal) / numero.length;

			if (numero[i] % 2 == 0) {
				par = par + 1;
			}
			if (numero[i] % 2 != 0) {
				impar = impar + 1;
			}
			if (numero[i] > 0) {
				positivo = positivo + 1;
			}
			if (numero[i] < 0) {
				negativo = negativo + 1;
			}
			if (numero[i] == 0) {
				neutro = neutro + 1;
			}

		}
		System.out.println("Numero aleatórios: ");
		for (int i = 0; i < numero.length; i++) {
			System.out.println((i + 1) + " - " + numero[i]);
		}
		System.out.println("A soma total dos numeros são: " + numTotal + 
				"\nA media dos mesmos são " + media + 
				"\nTem " + par + " numeros pares" + 
				"\nTem " + impar + " numeros ipmares" + 
				"\nTem " + positivo	+ " numeros positivos" + 
				"\nTem " + negativo + " numeros negativos" + 
				"\ntem " + neutro + " numeros neutros");

	}

}
