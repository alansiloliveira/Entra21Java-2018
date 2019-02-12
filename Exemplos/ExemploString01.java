import javax.swing.JOptionPane;

public class ExemploString01{

    public static void main(String[] arg){

        String nome = "Curso de Java";
        // retorna a quantidade de caracteres da String
        System.out.println(nome);
        System.out.println("Tamanho da String: "
         + nome.length());

         String nick = JOptionPane.showInputDialog( "Informe o nick do seu pager");

         if(nick.equals("")){
             JOptionPane.showMessageDialog(null,
             "Digite seu nick");
         }

         String jogoDoAno = "  League of Legend    ";
         // reove espaços do começo e do fim
         jogoDoAno= jogoDoAno.trim();

         String sistemaOperacional = "Linux";
         // colocar o texto todo em caixa alta
        sistemaOperacional = sistemaOperacional.toUpperCase();

        // colocar o texto todo em caixa baixa
        sistemaOperacional = sistemaOperacional.toLowerCase();

        // pegar um caracter em determinado indice
        char letra = sistemaOperacional.charAt(2);

        String nomeCompleto = "Juan Roberto da Rocha";
        System.out.println(nomeCompleto.substring(5,12));

        //             01234 
        String nome2 = "casas".trim();
        //nome = nome.trim();
        char letra = nome.charAt(nome.lenght() - 1);
        if(letra == 's'){
            //plural
        }else{
            //singular
        }
    }
}