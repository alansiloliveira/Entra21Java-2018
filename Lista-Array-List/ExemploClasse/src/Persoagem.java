
/**
 *
 * @author Alunos
 */
public class Persoagem {

    private String nome, cla, aldeia;
    private long nivelChakra;

    // peritir guarda a iformação
    public void setNome(String x1) {
        if (x1.trim().equals("")) {
            throw new IllegalArgumentException("Nome não pode ser vazio!!");
        }
        if (x1.trim().length() < 3) {
            throw new IllegalArgumentException(
                    "Nome tem que conter no mínimo 3 caracteres!");
        }
        this.nome = x1;
    }

    public String getNome() {
        return nome;

    }

}
