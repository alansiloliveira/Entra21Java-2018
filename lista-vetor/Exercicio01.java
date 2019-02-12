import javax.swing.JOptionPane;

public class Exercicio01{

    public static void main(String[] args){

        int[] numero = new int [16];
        numero[0] = 3;
        numero[1] = 6;
        numero[2] = 7;
        numero[3] = 77;
        numero[4] = 123;
        numero[5] = 22;
        numero[6] = 122;
        numero[7] = 16;
        numero[8] = 99;
        numero[9] = 55;
        numero[10] = 2;
        numero[11] = 82;
        numero[12] = 44;
        numero[13] = 71;
        numero[14] = 19;
        numero[15] = 11;
        
        int soma = 
        numero[0] + numero[1] + numero[2] + numero[3] + numero[4] + numero[5] + numero[6] + numero[7] + numero[8] + numero[9] + numero[10] + numero[11] + numero[12] + numero[13] + numero[14] + numero[15];

        JOptionPane.showMessageDialog(null, 
        "A soma dos vetores é: " + soma);
    }
}