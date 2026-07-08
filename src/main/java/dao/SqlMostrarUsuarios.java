package dao;

public class SqlMostrarUsuarios{
    public static final String SQL="""
        SELECT id_usuario,nombre_completo,usuario,rol
        FROM usuarios
        WHERE estado=true
        ORDER BY id_usuario
    """;
}