package dao;

public class SqlVerTipos{
    public static final String SQL="""
        SELECT id_tipo,nombre,descripcion,estado
        FROM tipos_cita
        ORDER BY id_tipo
    """;
}