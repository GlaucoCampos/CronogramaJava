package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import dal.ModuloConexao;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class TarefaDAO {

    private Connection connection;

    public TarefaDAO() {
        this.connection = ModuloConexao.conector();
    }

    public int buscarIdUsuarioPorNome(String nome) {
        String sql = "SELECT iduser FROM tbusuario WHERE usuario = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nome);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("iduser");
                } else {
                    throw new RuntimeException("Usuário não encontrado: " + nome);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar ID do usuário", e);
        }
    }

    public void adicionarNota(int iduser, int idatividade, double nota, String observacao, String bimestre) {
        String sql = "INSERT INTO tbnotas (iduser, idatividade, nota, observacao, bimestre) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, iduser);
            stmt.setInt(2, idatividade);
            stmt.setDouble(3, nota);
            stmt.setString(4, observacao);
            stmt.setString(5, bimestre);

            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir nota no banco de dados", e);
        }
    }

    public void excluirNota(int idnota) {
    String sql = "DELETE FROM tbnotas WHERE idnota = ?";
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
        stmt.setInt(1, idnota);
        stmt.executeUpdate();
    } catch (SQLException e) {
        throw new RuntimeException("Erro ao excluir nota do banco de dados", e);
    }
}

    public ResultSet buscarNotaPorNome(String nome) throws SQLException {
        String sql = "SELECT n.idnota, n.nota, n.observacao, n.bimestre " +
                     "FROM tbnotas n " +
                     "JOIN tbusuario u ON n.iduser = u.iduser " +
                     "WHERE u.usuario = ?";

        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, nome);

        return stmt.executeQuery();
    }

   public void atualizarNotaEObservacao(int idnota, double novaNota, String novaObs) throws SQLException {
    String sql = "UPDATE tbnotas SET nota = ?, observacao = ? WHERE idnota = ?";
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
        stmt.setDouble(1, novaNota);
        stmt.setString(2, novaObs);
        stmt.setInt(3, idnota);
        stmt.executeUpdate();
    }
}
    
    public ResultSet buscarNotaPorNomeAtividadeEBimestre(String nome, int idatividade, String bimestre) throws SQLException {
    String sql = "SELECT n.idnota, n.nota, n.observacao, n.bimestre " +
                 "FROM tbnotas n " +
                 "JOIN tbusuario u ON n.iduser = u.iduser " +
                 "WHERE u.usuario = ? AND n.idatividade = ? AND n.bimestre = ?";
    PreparedStatement stmt = connection.prepareStatement(sql);
    stmt.setString(1, nome);
    stmt.setInt(2, idatividade);
    stmt.setString(3, bimestre);
    return stmt.executeQuery();
}
    
    private Connection connect() {
    // URL do banco de dados
    String url = "jdbc:mysql://localhost:3306/seubanco";
    // Nome de usuário e senha do banco de dados
    String user = "seuusuario";
    String password = "suasenha";

    Connection conn = null;
    try {
        conn = DriverManager.getConnection(url, user, password);
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
    return conn;
}

}