package dao;

import bean.HeroiBean;
import conexao.ConexaoFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Francisco Lucas Sens
 */
public class HeroiDAO {

  public int inserir(HeroiBean heroi) {
    Connection conexao = ConexaoFactory.obterConexao();
    String sql = "INSERT INTO herois (nome, raca, descricao, sexo, quantidade_filmes, salario) VALUES (?,?,?,?,?,?)";
    try {
      PreparedStatement ps = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
      int quantidade = 1;
      ps.setString(quantidade++, heroi.getNome());
      ps.setString(quantidade++, heroi.getRaca());
      ps.setString(quantidade++, heroi.getDescricao());
      ps.setString(quantidade++, String.valueOf(heroi.getSexo()));
      ps.setByte(quantidade++, heroi.getQuantidadeFilmes());
      ps.setDouble(quantidade++, heroi.getSalario());
      ps.execute();
      ResultSet rs = ps.getGeneratedKeys();
      if (rs.next()) {
        return rs.getInt(0);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      ConexaoFactory.fecharConexao();
    }
    return 0;
  }

  public boolean alterar(HeroiBean heroi) {
    Connection conexao = ConexaoFactory.obterConexao();
    String sql = "UPDATE herois SET nome = ?, raca = ?, descricao = ?, sexo = ?, quantidade_filmes = ?, salario = ? WHERE id = ?";
    try {
      PreparedStatement ps = conexao.prepareStatement(sql);
      int quantidade = 0;
      ps.setString(quantidade++, heroi.getNome());
      ps.setString(quantidade++, heroi.getRaca());
      ps.setString(quantidade++, heroi.getDescricao());
      ps.setString(quantidade++, String.valueOf(heroi.getSexo()));
      ps.setByte(quantidade++, heroi.getQuantidadeFilmes());
      ps.setDouble(quantidade++, heroi.getSalario());
      ps.setInt(quantidade++, heroi.getId());
      return ps.executeUpdate() == 1;
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      ConexaoFactory.fecharConexao();
    }
    return false;
  }

  public List<HeroiBean> listarTodos() {
    List<HeroiBean> herois = new ArrayList<>();
    Connection conexao = ConexaoFactory.obterConexao();
    String sql = "SELECT id, nome, raca, descricao, sexo, quantidade_filmes, salario FROM herois";
    try {
      Statement st = conexao.createStatement();
      st.execute(sql);
      ResultSet rs = st.getResultSet();
      while (rs.next()) {
        HeroiBean heroi = new HeroiBean();
        heroi.setId(rs.getInt("id"));
        heroi.setNome(rs.getString("nome"));
        heroi.setDescricao(rs.getString("descricao"));
        heroi.setRaca(rs.getString("raca"));
        heroi.setSexo(rs.getString("sexo").charAt(0));
        heroi.setQuantidadeFilmes(rs.getByte("quantidade_filmes"));
        heroi.setSalario(rs.getDouble("salario"));
        herois.add(heroi);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      ConexaoFactory.fecharConexao();
    }
    return herois;
  }

  public HeroiBean obterPeloId(int id) {
    Connection conexao = ConexaoFactory.obterConexao();
    String sql = "SELECT id, nome, raca, descricao, sexo, quantidade_filmes, salario FROM herois WHERE id = ?";
    try {
      PreparedStatement ps = conexao.prepareStatement(sql);
      ps.setInt(1, id);
      ps.execute();
      ResultSet rs = ps.getResultSet();
      while (rs.next()) {
        HeroiBean heroi = new HeroiBean();
        heroi.setId(rs.getInt("id"));
        heroi.setNome(rs.getString("nome"));
        heroi.setDescricao(rs.getString("descricao"));
        heroi.setRaca(rs.getString("raca"));
        heroi.setSexo(rs.getString("sexo").charAt(0));
        heroi.setQuantidadeFilmes(rs.getByte("quantidade_filmes"));
        heroi.setSalario(rs.getDouble("salario"));
        return heroi;
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      ConexaoFactory.fecharConexao();
    }
    return null;
  }

  public boolean apagar(int id) {
    Connection conexao = ConexaoFactory.obterConexao();
    String sql = "DELETE FROM alunos WHERE id = ?";
    try {
      PreparedStatement ps = conexao.prepareStatement(sql);
      ps.setInt(1, id);
      return ps.executeUpdate() == 1;
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      ConexaoFactory.fecharConexao();
    }
    return false;
  }

}
