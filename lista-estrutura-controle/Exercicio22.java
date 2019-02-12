import javax.swing.JOptionPane;

public class Exercicio23{

    public static void main(String[] args){

        int quant = Integer.parseInt(JOptionPane.showInputDialog(null, "Diga quantidade de produtos: "));
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do produto: "));
        double pag = Double.parseDouble(JOptionPane.showInputDialog(null, "Dinheiro entregue ao vendedor: "));

        double total = quant * valor;
        double pag2 = pag - total;
        
        if(pag > total){
            JOptionPane.showMessageDialog(null, "Seu troco é: " + pag2);
        }else if(total > pag){
            JOptionPane.showMessageDialog(null, "Saldo insuficiente");
        }
    }
    
}