package org.me.jdbcaula;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {
    
    public static Connection getConnection() {

        String urlConnection = "jdbc:mysql://localhost/digital_innovation_one";

        Connection conexao = null;
        try {

            conexao = DriverManager.getConnection(urlConnection, "root", "password");
        } catch (SQLException e) {

            System.out.println("Falha na conexao");
        }

        return conexao;
    }
}
