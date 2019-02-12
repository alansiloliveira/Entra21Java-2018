import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Alunos
 */
public class Exercicio05 {
    
    public static void main(String[] args){
        
        ArrayList<String> nomes = new ArrayList<>();
        
        
        for(int i = 0; i < 5; i++){
        
        nomes.add(JOptionPane.showInputDialog("Digite um nome"));
        }
        
        String nome = JOptionPane.showInputDialog("Digite um nome para conferir");
        
        if(nomes.contains(nome)){
            JOptionPane.showMessageDialog(null, "Esse nome contém na lista");
        }else{
            JOptionPane.showMessageDialog(null, "Não existe esse nome na lista");
              
                }
    }
    
}
