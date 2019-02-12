import javax. swing.JOptionPane;

public class Exercicio11{

   public static void main(String[] args){

      int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Dia de nascimento: "));
      int mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Mes de nascimento: "));
      int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Ano de nascimento: "));

      int anos = 2018 - ano; 
      int dias = anos * 365;
      int meses = anos * 12;
      int horas = dias * 24;
      int minutos = horas * 60;
      int segundos = minutos * 60;
         

    JOptionPane.showMessageDialog(null, "Quantidade de dias vivo: " + dias
    + "\nQuantidade de anos vivo: " + anos
    + "\nQuantidade de meses vivo: " + meses
    + "\nQuantidade de horas vivo: " + horas
    + "\nQuantidade de minuto vivo: " + minutos
    + "\nQuantidade de segundos vivo: " + segundos);

   }



}