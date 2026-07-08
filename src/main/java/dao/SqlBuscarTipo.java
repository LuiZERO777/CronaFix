package dao;

public class SqlBuscarTipo{
    public static final String SQL="""
        SELECT id_tipo,nombre,descripcion,estado
        FROM tipos_cita
        WHERE nombre ILIKE ?
        ORDER BY id_tipo
    """;
}