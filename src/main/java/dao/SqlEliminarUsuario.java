package dao;

public class SqlEliminarUsuario{
    public static final String SQL="""
        UPDATE usuarios
        SET estado=false
        WHERE id_usuario=?
    """;
}