import javax.swing.JOptionPane;

public class Exercicio20{
    
    public static void main(String[] args) {
     
        double saldo = Double.parseDouble(JOptionPane.showInputDialog(null, "Diga seu saldo: "));
        double depositos = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor dos depositos: "));
        double parcela = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor das parcelas: "));
        double saque = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor dos Saques: "));


        double saldoAtual = saldo + depositos - parcela - saque;


        if(saldoAtual == 0){
            JOptionPane.showMessageDialog(null, "Seu saldo é zero" + "\nNeutro");
        }else if(saldoAtual > 0){
            JOptionPane.showMessageDialog(null, "Seu saldo é positivo" + "\nPositivo");
        }else if(saldoAtual < 0){
            JOptionPane.showMessageDialog(null, "Seu saldo é negativo" + "\nNegativo");
        }
    
    
    }


}