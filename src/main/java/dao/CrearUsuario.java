package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import modelo.Usuario;
import util.Conexion;

public class CrearUsuario{
    public boolean crear(Usuario u){
        try(Connection con=Conexion.conectar();
            PreparedStatement ps=con.prepareStatement(SqlCrearUsuario.SQL)){
            ps.setString(1,u.getNombre());
            ps.setString(2,u.getUsuario());
            ps.setString(3,u.getContraseña());
            ps.setString(4,u.getRol());
            return ps.executeUpdate()>0;
        }catch(Exception e){
            System.out.println("Error al crear usuario: "+e.getMessage());
            return false;
        }
    }
}