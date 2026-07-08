package dao;

public class SqlNuevoTipo{
    public static final String SQL="""
        INSERT INTO tipos_cita(nombre,descripcion,estado)
        VALUES(?,?,true)
    """;
}