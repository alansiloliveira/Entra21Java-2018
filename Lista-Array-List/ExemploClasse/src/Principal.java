
import javax.swing.JOptionPane;


/**
 *
 * @author Alunos
 */
public class Principal {
    
    public static void main(String[] args){
        
        Pessoa lucas = new Pessoa();
        lucas.nome = "Lucas";
        lucas.idade = 16;
        lucas.peso = 94.0f;
        lucas.altura = 1.94f;
        lucas.sexo = 'm';
        lucas.cpf = "123.123.123-54";
        lucas.sobrenome = "Rodrigo";
        
        Pessoa carlos = new Pessoa();
        carlos.idade = 18;
        carlos.peso = 78;
        carlos.sexo = 'm';
        carlos.cpf = "333.333.333-44";
        carlos.nome = "Carlos";
        carlos.sobrenome = "Augustu";
        carlos.altura = 1.78f;
        
        JOptionPane.showMessageDialog(null,lucas);
        
        JOptionPane.showMessageDialog(null, carlos);
        
    }
    
}
