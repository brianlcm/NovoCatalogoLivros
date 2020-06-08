package dao;

import java.sql.Connection;
import dao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import org.mypackage.catalogo.Livro;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class LivroDAO {

    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private ArrayList<Livro> lista = new ArrayList<>();
    EntityManager em;

    public LivroDAO() throws Exception {
        conn = new ConnectionFactory().getConexao();;
    }

    public void inserir(Livro livro) {
        String sql = "INSERT INTO livro (titulo, autor, ano, preco, foto, idEditora) VALUES (?,?,?,?,?,?)";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getAutor());
            stmt.setInt(3, livro.getAno());
            stmt.setDouble(4, livro.getPreco());
            stmt.setString(5, livro.getFoto());
            stmt.setInt(6, livro.getIdEditora());
            stmt.execute();
            stmt.close();
        } catch (Exception erro) {
            throw new RuntimeException("Erro 2: " + erro);
        }
    }
    
    public void alterar(Livro livro) {
        String sql = "UPDATE livro SET titulo = ?, autor = ?, ano = ?, preco = ?, foto = ? WHERE id = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getAutor());
            stmt.setInt(3, livro.getAno());
            stmt.setDouble(4, livro.getPreco());
            stmt.setString(5, livro.getFoto());
            stmt.setInt(6, livro.getId());
            stmt.execute();
            stmt.close();
        } catch (Exception erro) {
            throw new RuntimeException("Erro 3: " + erro);
        }
    }

    public ArrayList<Livro> listarTodos() {
        String sql = "SELECT * FROM livro";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Livro livro = new Livro();
                livro.setTitulo(rs.getString("titulo"));
                livro.setAutor(rs.getString("autor"));
                livro.setAno(rs.getInt("ano"));
                livro.setPreco(rs.getDouble("preco"));
                livro.setFoto(rs.getString("foto"));
                livro.setId(rs.getInt("id"));
                livro.setIdEditora(rs.getInt("idEditora"));
                lista.add(livro);
            }
        } catch (Exception erro) {
            throw new RuntimeException("Erro 11: " + erro);
        }
        return lista;
    }

    public ArrayList<Livro> listarTodosTitutlo(String valor) {
        String sql = "SELECT * FROM livro WHERE titulo LIKE '%" + valor + "%' ";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Livro livro = new Livro();
                livro.setTitulo(rs.getString("titulo"));
                livro.setAutor(rs.getString("autor"));
                livro.setAno(rs.getInt("ano"));
                livro.setPreco(rs.getDouble("preco"));
                livro.setFoto(rs.getString("foto"));
                livro.setId(rs.getInt("id"));
                livro.setIdEditora(rs.getInt("idEditora"));
                lista.add(livro);
            }
        } catch (Exception erro) {
            throw new RuntimeException("Erro 12: " + erro);
        }
        return lista;
    }
}
