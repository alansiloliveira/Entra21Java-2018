/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.entra21java.dao;

import br.com.entra21java.bean.AlunosBean;
import br.com.entra21java.database.Conexao;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alunos
 */
public class AlunosDAO {

    public List<AlunosBean> obterTodos() {
        List<AlunosBean> alunos = new ArrayList<>();
        String sql = "SELECT * FROM alunos";
        try {
            Statement st = Conexao.obterConexao().createStatement();
            st.execute(sql);
            ResultSet resultSet = st.getResultSet();
            while (resultSet.next()) {
                AlunosBean aluno = new AlunosBean();
                aluno.setId(resultSet.getInt("id"));
                aluno.setCodigo_matricula(resultSet.getString("codigo_matricula"));
                aluno.setNome(resultSet.getString("nome"));
                aluno.setNota1(resultSet.getFloat("nota1"));
                aluno.setNota2(resultSet.getFloat("nota2"));
                aluno.setNota3(resultSet.getFloat("nota3"));
                aluno.setFrequencia(resultSet.getByte("frequencia"));
                alunos.add(aluno);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return alunos;
    }

    public int adicionar(AlunosBean alunos) {
        String sql = "INSERT INTO alunos (nome, codigo_matricula, nota1, nota2, nota3, frequencia) VALUES (?, ? , ? , ? ,?, ?)";
        try {
            PreparedStatement ps = Conexao.obterConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            int quantidade = 1;
            ps.setString(quantidade++, alunos.getNome());
            ps.setString(quantidade++, alunos.getCodigo_matricula());
            ps.setFloat(quantidade++, alunos.getNota1());
            ps.setFloat(quantidade++, alunos.getNota2());
            ps.setFloat(quantidade++, alunos.getNota3());
            ps.setByte(quantidade++, alunos.getFrequencia());
            ps.execute();
            ResultSet resultSet = ps.getGeneratedKeys();
            if (resultSet.next()) {
                return resultSet.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return -1;
    }

    public boolean excluir(int id) {
        String sql = "DELETE FROM alunos WHERE id = ?";
        try {
            PreparedStatement ps = Conexao.obterConexao().prepareStatement(sql);
            ps.setInt(1, id);
            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return false;
    }

    public boolean alterar(AlunosBean alunos) {
        String sql = "UPDATE alunos SET nome, codigo_matricula, nota1, nota2, nota3, frequencia WHERE id = ?";
        try {
            PreparedStatement ps = Conexao.obterConexao().prepareStatement(sql);
            ps.setString(1, alunos.getNome());
            ps.setString(2, alunos.getCodigo_matricula());
            ps.setFloat(3, alunos.getNota1());
            ps.setFloat(4, alunos.getNota2());
            ps.setFloat(5, alunos.getNota3());
            ps.setByte(6, alunos.getFrequencia());
            ps.setInt(7, alunos.getId());

            return ps.executeUpdate() == 1;

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return false;
    }
    
    public AlunosBean obterPeloId(int id){
        String sql = "SELECT * FROM alunos WHERE id = ?";
        try{
            PreparedStatement ps = Conexao.obterConexao().prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            if (resultSet.next()) {
                AlunosBean alunos = new AlunosBean();
                alunos.setId(id);
                alunos.setNome(resultSet.getString("nome"));
                alunos.setCodigo_matricula(resultSet.getString("codigo_matricula"));
                alunos.setNota1(resultSet.getFloat("nota1"));
                alunos.setNota2(resultSet.getFloat("nota2"));
                alunos.setNota3(resultSet.getFloat("nota3"));
                alunos.setFrequencia(resultSet.getByte("frequecia"));
                return alunos;
                        
                
            }
        } catch(SQLException e){
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return null;
    }
}
