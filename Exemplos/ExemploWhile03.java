import javax.swing.JOptionPane;

public class ExemploWhile03{

    public static void main(String[] args){

        int quantidadeMaxima = 4;
        int atual = 0; 
        String nome = "";

        while(atual < quantidadeMaxima){
            String nome = JOptionPane.showInputDialog(null, "Digite o seu nome");
            
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));

            if(idade > maiorIdade){
                maiorIdade = idade;
            }

            if(idade < menorIdade){
                menorIdade = idade;
            }

            System.out.println("Atual: " + atual);
            atual = atual + 1;

        JOptionPane.showMessageDialog(null, "A maior idade é: " + maiorIdade);

        }
        }
      
        }
    
