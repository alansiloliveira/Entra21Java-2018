import javax.swing.JOptionPane;

public class Exercicio07{

    public static void main(String[] args){

        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero: "));

        if (num % 2 == 0){
            JOptionPane.showMessageDialog(null, "Esse numero é par"); 
        }else if(num % 2 != 0){
            JOptionPane.showMessageDialog(null, "Esse numero é impar");
        }else if(num == 0){
            JOptionPane.showMessageDialog(null, "Esse numero é neutro");
        }
        
        if (num > 0){
            JOptionPane.showMessageDialog(null, "Esse numero é positivo");
        }else if (num < 0){
            JOptionPane.showMessageDialog(null, "Esse numero é negativo");
        }
        if (num > 10){
            JOptionPane.showMessageDialog(null, "Esse numero é maior que 10");
        }
        if  (num <= 50){
            JOptionPane.showMessageDialog(null, "Esse numero é menor ou igual a 50");
        }
        if (num < -10){
            JOptionPane.showMessageDialog(null, "Esse numero é menor que -10");
        }
        if (num >= 30){
            JOptionPane.showMessageDialog(null, "Esse numero é maior que 30");
        }
        if (num != 1){
            JOptionPane.showMessageDialog(null, "Esse numero é diferente de 1");
        }
    }
}