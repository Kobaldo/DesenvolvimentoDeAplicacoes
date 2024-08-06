import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Professor {
    String nome;
    String formacao;
    String aula;

    public Professor(String nome, String formacao,  String aula){
        this.nome = nome;
        this.formacao = formacao;
        this.aula = aula;
    }

    public void createTable() {
        try (Statement statement = BancoDeDados.connection.createStatement()) {
            statement.execute("CREATE TABLE IF NOT EXISTS Professor (ID INTEGER PRIMARY KEY, Nome VARCHAR, Formacao VARCHAR, Aula VARCHAR)");
            BancoDeDados.connection.commit();
            System.out.println("Tabela criada ou já existe.");
        } catch (SQLException e) {
            System.out.println("Erro ao criar tabela: " + e.getMessage());
        }
    }

    public void inserirProfessor(List<Professor> lista) {
        try (PreparedStatement insertStatement = BancoDeDados.connection.prepareStatement("INSERT INTO Professor(Nome, Formacao, Aula) VALUES(?, ?, ?)")) {
            for (Professor s : lista) {
                insertStatement.setString(1, s.nome);
                insertStatement.setString(2, s.formacao);
                insertStatement.setString(3, s.aula);
                insertStatement.executeUpdate();
            }
            BancoDeDados.connection.commit();
            System.out.println("Professor inserido.");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir professor: " + e.getMessage());
        }
    }

    public void lerProfessor(String nomeQuery) {
        try (PreparedStatement selectStatement = BancoDeDados.connection.prepareStatement("SELECT * FROM Professor WHERE Nome = ? ")) {
            selectStatement.setString(1, nomeQuery);
            ResultSet resultSet = selectStatement.executeQuery();
            System.out.println("Professor");
            String formacao = resultSet.getString("Formacao");
            String nome = resultSet.getString("Nome");
            String aula = resultSet.getString("Aula");
            System.out.println("Nome: " + nome + ", Formacao: "+ formacao + " , Aula: "+ aula);
        } catch (SQLException e) {
            System.out.println("Erro ao consultar professor: " + e.getMessage());
        }
    }

    public void deleteProfessor(String nome) {
        try (PreparedStatement deleteStatement = BancoDeDados.connection.prepareStatement("DELETE FROM Professor WHERE Nome = ?")) {
            deleteStatement.setString(1, nome);
            deleteStatement.executeUpdate();
            BancoDeDados.connection.commit();
            System.out.println("Professor deletado.");
        } catch (SQLException e) {
            System.out.println("Erro ao deletar professor: " + e.getMessage());
        }
    }
}
