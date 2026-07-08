package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import modelo.Usuario;
import util.Conexion;

public class EditarUsuario{
    public boolean editar(Usuario u){
        try(Connection con=Conexion.conectar();
            PreparedStatement ps=con.prepareStatement(SqlEditarUsuario.SQL)){
            ps.setString(1,u.getNombre());
            ps.setString(2,u.getUsuario());
            ps.setString(3,u.getContraseña());
            ps.setString(4,u.getRol());
            ps.setInt(5,u.getId());
            return ps.executeUpdate()>0;
        }catch(Exception e){
            System.out.println("Error al editar usuario: "+e.getMessage());
            return false;
        }
    }
}