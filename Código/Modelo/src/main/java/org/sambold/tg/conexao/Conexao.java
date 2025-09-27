package org.sambold.tg.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class Conexao {
    private static final String URL  =
        "jdbc:mysql://localhost:3306/sambold"
      + "?useSSL=false&allowPublicKeyRetrieval=true"
      + "&serverTimezone=UTC&characterEncoding=UTF-8";

    private static final String USER = "root";
    private static final String PASS = "090207";

    private Conexao() {}

    // método “oficial”
    public static Connection get() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }

    // alias para compatibilizar com seu código antigo
    public static Connection conectar() throws SQLException {
        return get();
    }
}
