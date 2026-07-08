package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.Cita;
import repository.ConsultaRepository;
import util.Conexion;

public class ConsultaDAO implements ConsultaRepository {

    @Override
    public ArrayList<Cita> listarTodas() {

        ArrayList<Cita> lista =
                new ArrayList<>();

        String sql = """
            SELECT
                codigo_consulta,
                nombre_paciente,
                telefono,
                fecha_cita,
                hora_cita,
                estado
            FROM citas
            ORDER BY fecha_cita, hora_cita
            """;

        try (
                Connection con =
                        Conexion.conectar();

                PreparedStatement ps =
                        con.prepareStatement(sql);

                ResultSet rs =
                        ps.executeQuery()
        ) {

            while (rs.next()) {

                Cita cita = new Cita();

                cita.setCodigoConsulta(
                        rs.getString(
                                "codigo_consulta"));

                cita.setNombrePaciente(
                        rs.getString(
                                "nombre_paciente"));

                cita.setTelefono(
                        rs.getString(
                                "telefono"));

                cita.setFecha(
                        rs.getDate(
                                "fecha_cita")
                                .toLocalDate());

                cita.setHora(
        rs.getTime(
                "hora_cita")
                .toLocalTime());

cita.setEstado(
        rs.getString("estado"));

lista.add(cita);
            }

        } catch (Exception e) {
            System.out.println(
                    "Error al listar citas: "
                    + e.getMessage());
        }

        return lista;
    }

    @Override
    public ArrayList<Cita> buscarPorCodigo(
            String codigo) {

        ArrayList<Cita> lista =
                new ArrayList<>();

        String sql = """
            SELECT
                codigo_consulta,
                nombre_paciente,
                telefono,
                fecha_cita,
                hora_cita,
                estado
            FROM citas
            WHERE codigo_consulta ILIKE ?
            ORDER BY fecha_cita, hora_cita
            """;

        try (
                Connection con =
                        Conexion.conectar();

                PreparedStatement ps =
                        con.prepareStatement(sql)
        ) {

            ps.setString(
                    1,
                    "%" + codigo + "%");

            ResultSet rs =
                    ps.executeQuery();

            while (rs.next()) {

                Cita cita = new Cita();

                cita.setCodigoConsulta(
                        rs.getString(
                                "codigo_consulta"));

                cita.setNombrePaciente(
                        rs.getString(
                                "nombre_paciente"));

                cita.setTelefono(
                        rs.getString(
                                "telefono"));

                cita.setFecha(
                        rs.getDate(
                                "fecha_cita")
                                .toLocalDate());

                cita.setHora(
        rs.getTime(
                "hora_cita")
                .toLocalTime());

cita.setEstado(
        rs.getString("estado"));

lista.add(cita);
            }

        } catch (Exception e) {
            System.out.println(
                    "Error al buscar citas: "
                    + e.getMessage());
        }

        return lista;
    }
}