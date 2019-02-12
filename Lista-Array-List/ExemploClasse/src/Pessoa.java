
/**
 *
 * @author Alunos
 */
public class Pessoa {

    //Atributos
    public String nome, sobrenome, cpf;
    public byte idade;
    public float peso, altura;
    public char sexo;

    @Override
    public String toString() {
        return "Nome: " + nome
                + "\nSobroome: " + sobrenome
                + "\nIdade: " + idade
                + "\nPeso: " + peso
                + "\nAltura: " + altura
                + "\nSexo: " + sexo
                + "\nCpf: " + cpf;
    


   }
    
    
    
}
