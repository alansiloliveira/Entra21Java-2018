import java.util.ArrayList;

/**
 *
 * @author Alunos
 */
public class Exercicio04 {
    
    public static void main(String[] args){
        
        ArrayList<Integer> num = new ArrayList<>();
        
        num.add(2);
        num.add(3);
        num.add(6);
        num.add(8);
        num.add(9);
        num.add(7);
        num.add(15);
        num.add(11);
        num.add(13);
        num.add(16);
        
        System.out.println(num);
        
        num.remove(3);
        
        System.out.println(num);
        
        num.remove(4);
        
        System.out.println(num);
        System.out.println(num.size());
        
    }
    
}
