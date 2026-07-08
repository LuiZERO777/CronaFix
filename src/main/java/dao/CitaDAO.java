package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Cita;
import util.Conexion;

public class CitaDAO {

    public boolean registrar(Cita cita) {

        String sql = """
            INSERT INTO citas(
                codigo_consulta,
                nombre_paciente,
                telefono,
                fecha_cita,
                hora_cita,
                estado,
                fecha_registro,
                id_tipo,
                id_usuario
            )
            VALUES (?, ?, ?, ?, ?, ?, NOW(), ?, ?)
            """;

        try (
                Connection con = Conexion.conectar();
                PreparedStatement ps =
                        con.prepareStatement(sql)
        ) {

            ps.setString(1,
                    cita.getCodigoConsulta());

            ps.setString(2,
                    cita.getNombrePaciente());

            ps.setString(3,
                    cita.getTelefono());

            ps.setDate(4,
                    java.sql.Date.valueOf(
                            cita.getFecha()));

            ps.setTime(5,
                    java.sql.Time.valueOf(
                            cita.getHora()));

            ps.setString(6,
                    "Pendiente");

            ps.setInt(7,
                    cita.getIdTipo());

            ps.setInt(8,
                    cita.getIdUsuario());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {

            System.out.println(
                    "Error al registrar: "
                    + e.getMessage());

            return false;
        }
    }
}