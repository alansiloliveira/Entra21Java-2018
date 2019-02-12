public class Escola {

    private int id;
    private String nome;
    private String cnpj;
    private String telefone;
    private String rua;
    private String numero;
    private String bairro;
    private String cep;
    private String cidade;
    private String email;

    public Escola() {
    }

    public Escola(String nome, String cnpj, String telefone, String rua, String numero, String bairro, String cep, String cidade, String email) {
        setNome(nome);
        setCnpj(cnpj);
        setRua(rua);
        setNumero(numero);
        setBairro(bairro);
        setCep(cep);
        setCidade(cidade);
        setEmail(email);
        this.telefone = telefone;
        this.rua = rua;

    }

    public Escola(int id, String nome, String cnpj, String telefone, String rua, String numero, String bairro, String cep, String cidade, String email) {
        this.id = id;
        setNome(nome);
        setCnpj(cnpj);
        setRua(rua);
        setNumero(numero);
        setBairro(bairro);
        setCep(cep);
        setCidade(cidade);
        setEmail(email);
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    /**
     *
     * @param nome
     */
    public void setNome(String nome) {
        if (nome == null) {
            throw new IllegalArgumentException("Nome não pode ser null");
        }

        if (nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }

        if (nome.trim().length() > 100) {
            throw new IllegalArgumentException("Nome não pode ser maior que 100");
        }
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    /**
     *
     * @param cnpj
     * @throws IllegalArgumentException
     */
    public void setCnpj(String cnpj) throws IllegalArgumentException {
        if (cnpj == null) {
            throw new IllegalArgumentException("CNPJ não pode ser nulo");
        }
        if (cnpj.trim().isEmpty()) {
            throw new IllegalArgumentException("CNPJ não pode ser vazio");
        }
        if (cnpj.length() < 18) {
            throw new IllegalArgumentException("CNPJ não pode ser menor que 18 caracteres");
        }

        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    /**
     *
     * @param telefone
     * @throws IllegalArgumentException
     */
    public void setTelefone(String telefone) throws IllegalArgumentException {
        if (telefone == null) {
            throw new IllegalArgumentException("Telefone não pode ser nulo");
        }

        if (telefone.trim().isEmpty()) {
            throw new IllegalArgumentException("Telefone não pode ser vazio");
        }

        this.telefone = telefone;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    /**
     *
     * @param numero
     * @throws IllegalArgumentException
     */
    public void setNumero(String numero) throws IllegalArgumentException {
        if (numero == null) {
            throw new IllegalArgumentException("Número não pode nulo");
        }

        if (numero.trim().isEmpty()) {
            throw new IllegalArgumentException("Número não poder ser vazio");
        }
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    /**
     *
     * @param bairro
     * @throws IllegalArgumentException
     */
    public void setBairro(String bairro) throws IllegalArgumentException {

        if (bairro == null) {
            throw new IllegalArgumentException("Bairro não pode ser nulo");
        }

        if (bairro.trim().isEmpty()) {
            throw new IllegalArgumentException("Bairro não pode ser vazio");
        }
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    /**
     *
     * @param cep
     * @throws IllegalArgumentException
     */
    public void setCep(String cep) throws IllegalArgumentException {
        if (cep == null) {
            throw new IllegalArgumentException("CEP não pode ser nulo");
        }

        if (cep.length() < 10) {
            throw new IllegalArgumentException("CEP não pode ter menos que 10 caracteres");

        }
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    /**
     *
     * @param cidade
     * @throws IllegalArgumentException
     */
    public void setCidade(String cidade) throws IllegalArgumentException {
        if (cidade == null) {
            throw new IllegalArgumentException("Cidade nao pode ser nula");
        }
        if (cidade.trim().isEmpty()) {
            throw new IllegalArgumentException("Cidade não pode ser vazia");
        }
        this.cidade = cidade;
    }

    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     * @throws IllegalArgumentException
     */
    public void setEmail(String email) throws IllegalArgumentException {
        if (email == null) {
            throw new IllegalArgumentException("Email não pode ser nulo");
        }
        this.email = email;
    }

}