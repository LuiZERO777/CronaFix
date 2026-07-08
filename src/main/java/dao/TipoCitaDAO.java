package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.TipoCita;
import util.Conexion;

public class TipoCitaDAO {

    public ArrayList<TipoCita> listar() {

        ArrayList<TipoCita> lista = new ArrayList<>();

        String sql = """
            SELECT id_tipo, nombre
            FROM tipos_cita
            WHERE estado = true
        """;

        try (
                Connection con = Conexion.conectar();
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()
        ) {

            while (rs.next()) {

                lista.add(
                    new TipoCita(
                        rs.getInt("id_tipo"),
                        rs.getString("nombre")
                    )
                );
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return lista;
    }

    public int buscarIdPorNombre(String nombre) {

        String sql = """
            SELECT id_tipo
            FROM tipos_cita
            WHERE nombre = ?
        """;

        try (
                Connection con = Conexion.conectar();
                PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setString(1, nombre);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt("id_tipo");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return 0;
    }

    // NUEVO MÉTODO
    public String buscarNombrePorId(int idTipo) {

        String sql = """
            SELECT nombre
            FROM tipos_cita
            WHERE id_tipo = ?
        """;

        try (
                Connection con = Conexion.conectar();
                PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setInt(1, idTipo);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getString("nombre");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return "";
    }
}