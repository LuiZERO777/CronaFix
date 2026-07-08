package dao;

public class SqlCambiarTipo{
    public static final String SQL="""
        UPDATE tipos_cita
        SET nombre=?,descripcion=?,estado=?
        WHERE id_tipo=?
    """;
}