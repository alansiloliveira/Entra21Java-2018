
/**
 *
 * @author Alunos
 */
public class Macaco {
    
    public String nome, nomeCientifico, corPelo, apelido, reino, filo, classe, ordem, familia, genero, especie;
    public float altura, peso;
    public byte idade;
    
    @Override
    public String toString(){
        return "Nome: " + nome
                + "\nIdade: " + idade
                + "\nNome Cientifico: " + nomeCientifico
                + "\nCor da pelagem: " + corPelo
                + "\nApelido: " + apelido
                + "\nReino: " + reino
                + "\nFilo: " + filo
                + "\nClasse: " + classe
                + "\nOrdem: " + ordem
                + "\nFamilia: " + familia
                + "\nGenero: " + genero
                + "\nEspecie: " + especie
                + "\nAltura: " + altura
                + "\nPeso: " + peso;
    }
    
}
