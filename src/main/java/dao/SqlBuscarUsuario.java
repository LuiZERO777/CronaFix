package dao;

public class SqlBuscarUsuario{
    public static final String SQL="""
        SELECT id_usuario,nombre_completo,usuario,rol
        FROM usuarios
        WHERE estado=true
        AND(CAST(id_usuario AS TEXT) ILIKE ? OR nombre_completo ILIKE ? OR rol ILIKE ?)
        ORDER BY id_usuario
    """;
}