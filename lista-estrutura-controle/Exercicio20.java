import javax.swing.JOptionPane;

public class Exercicio21{

    public static void main(String[] args){

        double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite seu peso: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua altura: "));

        double imc = peso / (altura * altura);

        if(imc < 9.99){
            JOptionPane.showMessageDialog(null, "Você esta em desnutrição Grau V");
        }else if(imc > 10 && imc < 12.9){
            JOptionPane.showMessageDialog(null, "Você esta em desnutrição grau IV");
        }else if(imc > 13 && imc < 15.9){
            JOptionPane.showMessageDialog(null, "Você esta em desnutrição grau III");
        }else if(imc > 16 && imc < 16.9){
            JOptionPane.showMessageDialog(null, "Você esta em desnutrição grau II");
        }else if(imc > 17 && imc < 18.4){
            JOptionPane.showMessageDialog(null, "Você esta em desnutriçao grau I");
            }else if(imc > 18.5 && imc < 24.9){
                JOptionPane.showMessageDialog(null, "Você esta no peso ideal");
            }else if(imc > 25 && imc < 29.9){
                JOptionPane.showMessageDialog(null, "Você esta em pré obesidade");
            }else if(imc > 30 && imc < 34.9){
                JOptionPane.showMessageDialog(null, "Você esta em obesidade grau I");
            }else if(imc > 35 && imc < 39.9){
                JOptionPane.showMessageDialog(null, "Voce esta em obesidade grau II");
            }else if(imc > 39.9){
                JOptionPane.showMessageDialog(null, "Voce esta em obesidade grau III");
            }
        }
    }
