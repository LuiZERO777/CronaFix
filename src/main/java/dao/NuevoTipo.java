package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import modelo.TipoCita;
import util.Conexion;

public class NuevoTipo{
    public boolean guardar(TipoCita t){
        try(Connection con=Conexion.conectar();
            PreparedStatement ps=con.prepareStatement(SqlNuevoTipo.SQL)){
            ps.setString(1,t.getNombre());
            ps.setString(2,t.getDescripcion());
            return ps.executeUpdate()>0;
        }catch(Exception e){
            System.out.println("Error al guardar tipo: "+e.getMessage());
            return false;
        }
    }
}