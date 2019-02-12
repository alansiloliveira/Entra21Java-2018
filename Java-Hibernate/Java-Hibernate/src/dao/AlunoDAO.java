
package dao;

import bean.Aluno;
import database.Conexao;
import java.util.ArrayList;
import java.util.List;


public class AlunoDAO {
    
    public List<Aluno> obterTodos() {
        List<Aluno> alunos = new ArrayList<>();
        return alunos;
    }
    
    public Aluno obterPeloId(int id) {
        Aluno aluno = null;
        return aluno;
    }
    
    public int insetir(Aluno aluno) {
        Conexao conexao = new Conexao();
        if(conexao.conectar()){
            conexao.session.save(aluno);
            conexao.transaction.commit();
            conexao.session.close();
            return aluno.getId();
        }
        
        return -1;
    }
    
    public int inserir(Aluno aluno) {
        return -1;
    }
    
    public boolean alterar(Aluno aluno) {
        return false;
    }
    
    public boolean excluir(int id){
        return false;
    }
}
