package bean;

/**
 * @author Francisco Lucas Sens
 */
public class HeroiBean {

  private int id;
  private String nome, raca, descricao;
  private char sexo;
  private byte quantidadeFilmes;
  private double salario;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getRaca() {
    return raca;
  }

  public void setRaca(String raca) {
    this.raca = raca;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public char getSexo() {
    return sexo;
  }

  public void setSexo(char sexo) {
    this.sexo = sexo;
  }

  public byte getQuantidadeFilmes() {
    return quantidadeFilmes;
  }

  public void setQuantidadeFilmes(byte quantidadeFilmes) {
    this.quantidadeFilmes = quantidadeFilmes;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

}
