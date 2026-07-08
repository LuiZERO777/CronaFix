package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import modelo.TipoCita;
import util.Conexion;

public class CambiarTipo{
    public boolean cambiar(TipoCita t){
        try(Connection con=Conexion.conectar();
            PreparedStatement ps=con.prepareStatement(SqlCambiarTipo.SQL)){
            ps.setString(1,t.getNombre());
            ps.setString(2,t.getDescripcion());
            ps.setBoolean(3,t.isEstado());
            ps.setInt(4,t.getIdTipo());
            return ps.executeUpdate()>0;
        }catch(Exception e){
            System.out.println("Error al cambiar tipo: "+e.getMessage());
            return false;
        }
    }
}