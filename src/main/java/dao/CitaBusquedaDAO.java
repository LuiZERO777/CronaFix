package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Cita;
import util.Conexion;

public class CitaBusquedaDAO {

    public Cita buscarPorCodigo(String codigo) {

        Cita cita = null;

        String sql = """
            SELECT
                fecha_cita,
                hora_cita,
                id_tipo
            FROM citas
            WHERE codigo_consulta = ?
            """;

        try (
                Connection con = Conexion.conectar();
                PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setString(1, codigo);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                cita = new Cita();

                cita.setFecha(
                        rs.getDate("fecha_cita")
                                .toLocalDate());

                cita.setHora(
                        rs.getTime("hora_cita")
                                .toLocalTime());

                cita.setIdTipo(
                        rs.getInt("id_tipo"));
            }

        } catch (Exception e) {

            System.out.println(
                    "Error buscar cita: "
                    + e.getMessage());
        }

        return cita;
    }
}