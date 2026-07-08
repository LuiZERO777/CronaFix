package dao;

public class SqlEditarUsuario{
    public static final String SQL="""
        UPDATE usuarios
        SET nombre_completo=?,usuario=?,contraseña=?,rol=?
        WHERE id_usuario=?
    """;
}