package dao;

import java.sql.*;
import modelo.Cancelacion;
import util.Conexion;

public class CancelacionDAO {

    public Cancelacion buscarPorCodigo(String codigo) {

        Cancelacion c = null;

        String sql = """
            SELECT nombre_paciente,
                   codigo_consulta,
                   fecha_cita,
                   hora_cita,
                   telefono
            FROM citas
            WHERE codigo_consulta = ?
            AND estado = 'Pendiente'
        """;

        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, codigo);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                c = new Cancelacion();

                c.setNombrePaciente(
                        rs.getString("nombre_paciente"));

                c.setCodigoConsulta(
                        rs.getString("codigo_consulta"));

                c.setFechaCita(
                        rs.getDate("fecha_cita").toLocalDate());

                c.setHoraCita(
                        rs.getTime("hora_cita").toLocalTime());

                c.setTelefono(
                        rs.getString("telefono"));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return c;
    }

    public boolean cancelar(String codigo) {

        String sql = """
            UPDATE citas
            SET estado = 'Cancelada'
            WHERE codigo_consulta = ?
        """;

        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, codigo);

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return false;
    }
}