package dao;

import Conexao.ConexaoFactory;
import bean.AlunoBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alan
 */
public class AlunoDAO {

    public int cadastrar(AlunoBean aluno) {
        Connection conexao = ConexaoFactory.obterConexao();
        if (conexao != null) {
            String sql = "INSERT INTO alunos"
                    + "\n(nome, codigo_matricula, nota1, nota2, nota3, frequencia"
                    + "\nVALUES(?, ?, ?, ?, ?, ?, ?";
            try {
                PreparedStatement preparedStatement = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
                preparedStatement.setString(1, aluno.getNome());
                preparedStatement.setString(2, aluno.getCodigo_matricula());
                preparedStatement.setFloat(3, aluno.getNota1());
                preparedStatement.setFloat(4, aluno.getNota2());
                preparedStatement.setFloat(5, aluno.getNota3());
                preparedStatement.setByte(6, aluno.getFrequencia());
                preparedStatement.execute();
                ResultSet resultSet = preparedStatement.getGeneratedKeys();
                if (resultSet.next()) {
                    return resultSet.getInt(1);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                ConexaoFactory.fecharConexao();
            }
        }
        return 0;
    }

    public boolean alterar(AlunoBean aluno) {
        Connection conexao = ConexaoFactory.obterConexao();
        String sql = "UPDATE alunos SET nome = ?, codigo_matricula = ?, nota1 = ?, nota2 = ?, nota3 = ?, frequencia = ?";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, aluno.getNome());
            ps.setString(2, aluno.getCodigo_matricula());
            ps.setFloat(3, aluno.getNota1());
            ps.setFloat(4, aluno.getNota2());
            ps.setFloat(5, aluno.getNota3());
            ps.setByte(6, aluno.getFrequencia());

            ps.setInt(5, aluno.getId());
            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConexaoFactory.fecharConexao();
        }
        return false;
    }

    public boolean apagar(int id) {
        String sql = "DELETE FROM alunos WHERE id = ?";
        Connection conexao = ConexaoFactory.obterConexao();
        if (conexao != null) {
            try {
                PreparedStatement ps = conexao.prepareStatement(sql);
                ps.setInt(1, id);
                return ps.executeUpdate() == 1;
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                ConexaoFactory.fecharConexao();
            }
        }
        return false;
    }

    public AlunoBean obterAlunoPeloId(int id) {
        String sql = "SELECT id, nome, codigo_matricula, nota1, nota2, nota3, frequencia FROM alunos WHERE id = ?";
        Connection conexao = ConexaoFactory.obterConexao();
        if (conexao != null) {
            try {
                PreparedStatement ps = conexao.prepareStatement(sql);
                ps.setInt(1, id);
                ps.execute();
                ResultSet resultSet = ps.getResultSet();
                if (resultSet.next()) {
                    AlunoBean aluno = new AlunoBean();
                    if (resultSet.next()) {
                        aluno.setId(resultSet.getInt("id"));
                        aluno.setNome(resultSet.getString("nome"));
                        aluno.setCodigo_matricula(resultSet.getString("codigo_matricula"));
                        aluno.setNota1(resultSet.getFloat("nota1"));
                        aluno.setNota2(resultSet.getFloat("nota2"));
                        aluno.setNota3(resultSet.getFloat("nota3"));
                        aluno.setFrequencia(resultSet.getByte("frequencia"));
                        return aluno;
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                ConexaoFactory.fecharConexao();
            }
        }
        return null;
    }
    
    public List<AlunoBean> obterAlunos() {
        List<AlunoBean> alunos = new ArrayList<>();
        Connection conexao = ConexaoFactory.obterConexao();
        if(conexao != null) {
            String sql = "SELECT id, nome, codigo_matriculo, nota1, nota2, nota3, frequencia FROM alunos";
            try{
                Statement statement = conexao.createStatement();
                statement.execute(sql);
                ResultSet resultSet = statement.getResultSet();
                while(resultSet.next()){
                    AlunoBean aluno = new AlunoBean();
                    aluno.setId(resultSet.getInt("id"));
                    aluno.setCodigo_matricula(resultSet.getString("codigo_matricula"));
                    aluno.setNota1(resultSet.getFloat("nota1"));
                    aluno.setNota2(resultSet.getFloat("nota2"));
                    aluno.setNota3(resultSet.getFloat("nota3"));
                    aluno.setFrequencia(resultSet.getByte("frequencia"));
                    alunos.add(aluno);
                }
            }catch (SQLException e) {
                e.printStackTrace();
            } finally {
                ConexaoFactory.fecharConexao();
            }
        }
        return alunos;
    }
}

