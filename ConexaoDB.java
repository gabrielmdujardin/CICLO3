package apresentacao.acesso_a_dado;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
    private static final String URL = "jdbc:postgresql://localhost:5432/db";
    private static final String USER = "user";
    private static final String PASSWORD = "pass";

    public static Connection conectar() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
