package dao;

public class SqlCrearUsuario{
    public static final String SQL="""
        INSERT INTO usuarios(nombre_completo,usuario,contraseña,rol,estado)
        VALUES(?,?,?,?,true)
    """;
}