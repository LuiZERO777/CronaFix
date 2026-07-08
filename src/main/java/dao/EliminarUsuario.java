package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import util.Conexion;

public class EliminarUsuario{
    public boolean eliminar(int id){
        try(Connection con=Conexion.conectar();
            PreparedStatement ps=con.prepareStatement(SqlEliminarUsuario.SQL)){
            ps.setInt(1,id);
            return ps.executeUpdate()>0;
        }catch(Exception e){
            System.out.println("Error al eliminar usuario: "+e.getMessage());
            return false;
        }
    }
}