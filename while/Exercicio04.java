import javax.swing.JOptionPane;
    
    public class Exercicio04{

        public static void main(String[] args){

        int ano = 0, mediaAno = 0, atual = 0, somaAnoCarro = 0, contaLetraA = 0, contaLetraG = 0;
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de carros que vai cadastrar: "));
        String modelo = "";
        char letra; 
        double valor = 0, mediaValor = 0, somaValor = 0;
        int contador = quantidade;
        
         while((quantidade > 0)){
            modelo = JOptionPane.showInputDialog("Modelo do carro: ");
            valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do carro: "));
            ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do carro: "));
            
            mediaAno = mediaAno + ano;
            mediaValor = mediaValor + valor;
            
            
            quantidade = quantidade - 1;

            letra = modelo.charAt(0);

            if((letra == 'A') || (letra == 'a')){
                contaLetraA = contaLetraA + 1;
            }else if((letra == 'G') || (letra == 'g')){
                contaLetraG = contaLetraG + 1;
            }

        }
            somaAnoCarro = mediaAno / contador;
            somaValor = mediaValor / contador;
        JOptionPane.showMessageDialog(null, "Media de anos dos carros aqui falados: " + somaAnoCarro
        + "\nMedia de valor deles: " + somaValor
        + "\nQuantidade de veiculo que começam cm a letra A: " + contaLetraA 
        + "\nQuantidade de veiculos que começam cm a letra G: " + contaLetraG);

    }
}