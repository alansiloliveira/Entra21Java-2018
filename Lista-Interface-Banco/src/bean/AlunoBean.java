package bean;

/**
 *
 * @author Alan
 */
public class AlunoBean {
    
    private int id;
    private String nome, codigo_matricula;
    private float nota1, nota2, nota3;
    private byte frequencia;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the codigo_matricula
     */
    public String getCodigo_matricula() {
        return codigo_matricula;
    }

    /**
     * @param codigo_matricula the codigo_matricula to set
     */
    public void setCodigo_matricula(String codigo_matricula) {
        this.codigo_matricula = codigo_matricula;
    }

    /**
     * @return the nota1
     */
    public float getNota1() {
        return nota1;
    }

    /**
     * @param nota1 the nota1 to set
     */
    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    /**
     * @return the nota2
     */
    public float getNota2() {
        return nota2;
    }

    /**
     * @param nota2 the nota2 to set
     */
    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    /**
     * @return the nota3
     */
    public float getNota3() {
        return nota3;
    }

    /**
     * @param nota3 the nota3 to set
     */
    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    /**
     * @return the frequencia
     */
    public byte getFrequencia() {
        return frequencia;
    }

    /**
     * @param frequencia the frequencia to set
     */
    public void setFrequencia(byte frequencia) {
        this.frequencia = frequencia;
    }
    
}
