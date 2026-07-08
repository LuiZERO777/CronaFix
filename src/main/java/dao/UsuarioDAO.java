package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Usuario;
import util.Conexion;

public class UsuarioDAO {

    public Usuario iniciarSesion(String usuario, String contraseña) {

        String sql = """
                     SELECT id_usuario,
                            nombre_completo,
                            usuario,
                            rol
                     FROM usuarios
                     WHERE usuario = ?
                     AND contraseña = ?
                     AND estado = true
                     """;

        Usuario usuarioEncontrado = null;

        try (
                Connection con = Conexion.conectar();
                PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setString(1, usuario);
            ps.setString(2, contraseña);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                usuarioEncontrado = new Usuario();

                usuarioEncontrado.setId(
                        rs.getInt("id_usuario"));

                usuarioEncontrado.setNombre(
                        rs.getString("nombre_completo"));

                usuarioEncontrado.setUsuario(
                        rs.getString("usuario"));

                usuarioEncontrado.setRol(
                        rs.getString("rol"));
            }

        } catch (SQLException e) {

            System.out.println("Error Login: " + e.getMessage());
        }

        return usuarioEncontrado;
    }
}