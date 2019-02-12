import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Alunos
 */
public class Exercicio06 {
    
    public static void main(String[] args){
        
        ArrayList<Integer> numeros = new ArrayList<>();
        
        for(int i = 0; i < 26; i ++){
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para adicionar a lista")));
        }
        
        
        JOptionPane.showMessageDialog(null, numeros);
    }
    
}
