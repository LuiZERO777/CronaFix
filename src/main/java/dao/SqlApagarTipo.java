package dao;

public class SqlApagarTipo{
    public static final String SQL="""
        UPDATE tipos_cita
        SET estado=false
        WHERE id_tipo=?
    """;
}