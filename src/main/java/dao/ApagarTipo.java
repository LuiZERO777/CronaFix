package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import util.Conexion;

public class ApagarTipo{
    public boolean apagar(int id){
        try(Connection con=Conexion.conectar();
            PreparedStatement ps=con.prepareStatement(SqlApagarTipo.SQL)){
            ps.setInt(1,id);
            return ps.executeUpdate()>0;
        }catch(Exception e){
            System.out.println("Error al apagar tipo: "+e.getMessage());
            return false;
        }
    }
}