import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Clientes {
    private static final String URL = "jdbc:sqlite:banco.db";
    private Connection connection;

    public void connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection(URL);
            connection.setAutoCommit(false);
            System.out.println("Conexão realizada! Banco de dados: " + URL);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC do SQLite não encontrado: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }
    }

    public void close() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Conexão fechada.");
            } catch (SQLException e) {
                System.out.println("Erro ao fechar a conexão: " + e.getMessage());
            }
        }
    }

    public void createTable() {
        try (Statement statement = connection.createStatement()) {
            statement.execute("CREATE TABLE IF NOT EXISTS Clientes (ID INTEGER PRIMARY KEY, Nome VARCHAR, Idade INTEGER)");
            connection.commit();
            System.out.println("Tabela criada ou já existe.");
        } catch (SQLException e) {
            System.out.println("Erro ao criar tabela: " + e.getMessage());
        }
    }

    public void insertClient(List<String[]> lista) {
        try (PreparedStatement insertStatement = connection.prepareStatement("INSERT INTO clientes(Nome, Idade) VALUES(?, ?)")) {
            for (String[] s : lista) {
                insertStatement.setString(1, s[0]);
                insertStatement.setInt(2, Integer.parseInt(s[1]));
                insertStatement.executeUpdate();
            }
            connection.commit();
            System.out.println("Clientes inseridos.");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir cliente: " + e.getMessage());
        }
    }

    public void queryClients() {
        try (PreparedStatement selectStatement = connection.prepareStatement("SELECT * FROM Clientes WHERE Idade >= 18 ")) {
            ResultSet resultSet = selectStatement.executeQuery();
            System.out.println("Clientes:");
            while (resultSet.next()) {
                int idade = resultSet.getInt("Idade");
                String nome = resultSet.getString("Nome");
                System.out.println("Nome: " + nome + ", Idade: "+ idade);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao consultar clientes: " + e.getMessage());
        }
    }

    public void atualizarMenores() {
        try (PreparedStatement selectStatement = connection.prepareStatement("SELECT * FROM Clientes WHERE Idade < 18")) {
            ResultSet resultSet = selectStatement.executeQuery();
            System.out.println("Clientes:");
            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String nome = resultSet.getString("Nome");
                nome = nome.concat("(menor)");
                updateClient(id,nome);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao consultar clientes: " + e.getMessage());
        }
    }

    public void updateClient(int id, String novoNome) {
        try (PreparedStatement updateStatement = connection.prepareStatement("UPDATE Clientes SET Nome = ? WHERE ID = ?")) {
            updateStatement.setString(1, novoNome);
            updateStatement.setInt(2, id);
            updateStatement.executeUpdate();
            connection.commit();
            System.out.println("Cliente atualizado.");
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar cliente: " + e.getMessage());
        }
    }

    public void deleteClient() {
        try (PreparedStatement deleteStatement = connection.prepareStatement("DELETE FROM Clientes WHERE Idade < 18")) {
            deleteStatement.executeUpdate();
            connection.commit();
            System.out.println("Cliente deletado.");
        } catch (SQLException e) {
            System.out.println("Erro ao deletar cliente: " + e.getMessage());
        }
    }
}
