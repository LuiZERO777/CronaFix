package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.ModificarCita;
import util.Conexion;

public class ModificarDAO {

    public boolean modificar(ModificarCita cita) {

        String sql = """
                     UPDATE citas
                     SET
                     fecha_cita=?,
                     hora_cita=?,
                     id_tipo=?
                     WHERE codigo_consulta=?
                     """;

        try (
                Connection con = Conexion.conectar();
                PreparedStatement ps =
                        con.prepareStatement(sql)) {

            ps.setDate(1,
                    java.sql.Date.valueOf(
                            cita.getFecha()));

            ps.setTime(2,
                    java.sql.Time.valueOf(
                            cita.getHora()));

            ps.setInt(3,
                    cita.getIdTipo());

            ps.setString(4,
                    cita.getCodigoConsulta());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {

            System.out.println(e.getMessage());
        }

        return false;
    }

}