import javax.swing.JOptionPane;

public class Exercicio16{

    public static void main(String[] args){

        double temp = Double.parseDouble(JOptionPane.showInputDialog(null, 
        "Diga a temperatura: "));

        String escala = JOptionPane.showInputDialog(null, 
        "Escalas de temperatura", 
        " ", 
        JOptionPane.WARNING_MESSAGE, 
        null, 
        new Object[]{"Celsius", "Fahreneight", "Kelvin"}, 
        "Celsius")
        .toString();

         
         String conv = JOptionPane.showInputDialog(null, 
         "Para qual deseja converter", 
         "Conversor", 
         JOptionPane.WARNING_MESSAGE,
         null, 
         new Object[]{"Celsius", "Fahreneight", "Kelvin"}, 
         "Celsius").toString();

         if(escala.equalsIgnoreCase("Celsius") && conv.equalsIgnoreCase("Fahreneight")){
             JOptionPane.showMessageDialog(null, "Sua temperatura é: " + (temp * 2) + 30 + "F");
         }else if(escala.equals("Fahreneight") && conv.equals("Celsius")){
             JOptionPane.showMessageDialog(null, "Sua temperatura é: " + (temp / 2) - 30 + "F");
         }else if(escala.equals("Celsius") && conv.equals("Kelvin")){
             JOptionPane.showMessageDialog(null, "Sua temperatura é: " + (temp + 272));
         }else if(escala.equals("Kelvin") && conv.equals("Fahreneight")){
             JOptionPane.showMessageDialog(null, "Sua temperatura é: " + (temp - 273 * 2) - 30);
         }


    }
}