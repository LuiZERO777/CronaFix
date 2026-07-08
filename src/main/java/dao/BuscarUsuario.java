package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.Usuario;
import util.Conexion;

public class BuscarUsuario{
    public ArrayList<Usuario> buscar(String texto){
        ArrayList<Usuario> lista=new ArrayList<>();
        try(Connection con=Conexion.conectar();
            PreparedStatement ps=con.prepareStatement(SqlBuscarUsuario.SQL)){
            String filtro="%"+texto+"%";
            ps.setString(1,filtro);
            ps.setString(2,filtro);
            ps.setString(3,filtro);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Usuario u=new Usuario();
                u.setId(rs.getInt("id_usuario"));
                u.setNombre(rs.getString("nombre_completo"));
                u.setUsuario(rs.getString("usuario"));
                u.setRol(rs.getString("rol"));
                lista.add(u);
            }
        }catch(Exception e){
            System.out.println("Error al buscar usuario: "+e.getMessage());
        }
        return lista;
    }
}