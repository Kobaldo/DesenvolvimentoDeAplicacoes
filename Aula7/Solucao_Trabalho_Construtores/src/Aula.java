import com.sun.source.tree.WhileLoopTree;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Aula {
    String professor;
    List<String> alunos;

    public void lerAula(String nomeQuery) {
        try (PreparedStatement selectStatement = BancoDeDados.connection.prepareStatement("SELECT * FROM Professor WHERE Aula = ? ")) {
            selectStatement.setString(1, nomeQuery);
            ResultSet resultSet = selectStatement.executeQuery();
            String nome = resultSet.getString("Nome");
            String aula = resultSet.getString("Aula");
            System.out.println("Aula: "+ aula);
            System.out.println("Professor: "+ nome);
        } catch (SQLException e) {
            System.out.println("Erro ao consultar professores: " + e.getMessage());
        }
        try (PreparedStatement selectStatement = BancoDeDados.connection.prepareStatement("SELECT * FROM Alunos WHERE Aula = ? ")) {
            selectStatement.setString(1, nomeQuery);
            ResultSet resultSet = selectStatement.executeQuery();
            System.out.println("Alunos: ");
            while(resultSet.next()){
                String nome = resultSet.getString("Nome");
                System.out.println(nome);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao consultar alunos: " + e.getMessage());
        }
    }
}
