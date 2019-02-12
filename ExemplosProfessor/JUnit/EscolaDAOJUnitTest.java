
import database.Conexao;
import model.Escola;
import org.junit.Test;
import static org.junit.Assert.*;

public class EscolaDAOJUnitTest {
    
    @Test
    public void inserir(){
        Conexao.truncate();

        Escola e = new Escola();
        e.setNome("aa");
        e.setCnpj("000000000000/000000");
        e.setTelefone("aa");
        e.setRua("aa");
        e.setNumero("aa");
        e.setBairro("aa");
        e.setCep("000000000-000");
        e.setCidade("aa");
        e.setEmail("aa");
        
        int cod = EscolaDAO.add(e);
        e.setId(cod);
        
        assertEquals(cod, 1);
        validarIgual(e, EscolaDAO.getById(cod));
    }
    
    @Test
    public void excluir(){
        Conexao.truncate();
        
        Escola e = new Escola();
        e.setNome("aa");
        e.setCnpj("000000000000/000000");
        e.setTelefone("aa");
        e.setRua("aa");
        e.setNumero("aa");
        e.setBairro("aa");
        e.setCep("0000000-000");
        e.setCidade("aa");
        e.setEmail("aa");
        
        int cod = EscolaDAO.add(e);
        EscolaDAO.delete(cod);
        
        assertNull(EscolaDAO.getById(cod));
    }
    
    @Test
    public void alterar(){
        Conexao.truncate();
        
        Escola e = new Escola();
        e.setNome("aa");
        e.setCnpj("000000000000/000000");
        e.setTelefone("aa");
        e.setRua("aa");
        e.setNumero("aa");
        e.setBairro("aa");
        e.setCep("00000000-000");
        e.setCidade("aa");
        e.setEmail("aa");
        
        int cod = EscolaDAO.add(e);
        e.setId(cod);
        
        e.setNome("bb");
        e.setCnpj("00000000/0000000-00");
        e.setTelefone("bb");
        e.setRua("bb");
        e.setNumero("bb");
        e.setBairro("bb");
        e.setCep("0000000-000");
        e.setCidade("bb");
        e.setEmail("bb");
        
        EscolaDAO.edit(e);
        
        Escola dps = EscolaDAO.getById(cod);
        validarIgual(e, dps);
    }
    
    @Test
    public void buscarPorId(){
        Conexao.truncate();
        
        Escola e = new Escola();
        e.setNome("aa");
        e.setCnpj("000000000000/000000");
        e.setTelefone("aa");
        e.setRua("aa");
        e.setNumero("aa");
        e.setBairro("aa");
        e.setCep("00000000-000");
        e.setCidade("aa");
        e.setEmail("aa");
        
        int cod = EscolaDAO.add(e);
        e.setId(cod);
        
        Escola e2 = EscolaDAO.getById(cod);
        validarIgual(e, e2);
    }
    
    public void validarIgual(Escola e1, Escola e2){
        assertEquals(e1.getId(), e2.getId());
        assertEquals(e1.getNome(), e2.getNome());
        assertEquals(e1.getCnpj(), e2.getCnpj());
        assertEquals(e1.getTelefone(), e2.getTelefone());
        assertEquals(e1.getRua(), e2.getRua());
        assertEquals(e1.getNumero(), e2.getNumero());
        assertEquals(e1.getBairro(), e2.getBairro());
        assertEquals(e1.getCep(), e2.getCep());
        assertEquals(e1.getCidade(), e2.getCidade());
        assertEquals(e1.getEmail(), e2.getEmail());
    }
    
}