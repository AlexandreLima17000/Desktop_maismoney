package org.example;

import org.example.DataBaseConfig;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {
    public void salvarUsuario(String nome, String email,String apelido,String senha) {
        String sql = "INSERT INTO usuario (nome, email,apelido,senha) VALUES (?, ?,?,?)";

        try (Connection conn = DataBaseConfig.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nome);
            stmt.setString(2, email);
            stmt.setString(3, apelido);
            stmt.setString(4, senha);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
