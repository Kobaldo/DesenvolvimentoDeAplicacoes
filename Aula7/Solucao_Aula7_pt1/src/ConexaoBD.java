import java.sql.*;
import java.util.List;

public class ConexaoBD {
    private static final String URL = "jdbc:sqlite:banco.db";
    public Connection connection;

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
            statement.execute("CREATE TABLE IF NOT EXISTS Cliente (ID INTEGER PRIMARY KEY, Nome VARCHAR, DataNasc VARCHAR, CPF VARCHAR, Tel VARCHAR)");
            connection.commit();
            System.out.println("Tabela criada ou já existe.");
        } catch (SQLException e) {
            System.out.println("Erro ao criar tabela: " + e.getMessage());
        }
    }

    public void insertClient(Cliente cliente) {
        try (PreparedStatement insertStatement = connection.prepareStatement("INSERT INTO Cliente(Nome, DataNasc, CPF, Tel) VALUES(?, ?, ?, ?)")) {
            insertStatement.setString(1, cliente.nome);
            insertStatement.setString(2, cliente.dataDeNascimento);
            insertStatement.setString(3, cliente.cpf);
            insertStatement.setString(4, cliente.telefone);
            insertStatement.executeUpdate();
            connection.commit();
            System.out.println("Cliente inserido.");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir cliente: " + e.getMessage());
        }
    }

    public void queryClients(String nome) {
        try (PreparedStatement selectStatement = connection.prepareStatement("SELECT * FROM Cliente WHERE Nome = ? ")) {
            selectStatement.setString(1, nome);
            ResultSet resultSet = selectStatement.executeQuery();
            System.out.println("Cliente:");
            String dataDeNascimento = resultSet.getString("DataNasc");
            String cpf = resultSet.getString("CPF");
            String telefone= resultSet.getString("Tel");
            System.out.println("Nome: " + nome + ", DataNasc: "+ dataDeNascimento+", CPF: "+ cpf+", Tel: "+ telefone);
        } catch (SQLException e) {
            System.out.println("Erro ao consultar clientes: " + e.getMessage());
        }
    }
}
