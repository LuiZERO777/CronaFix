package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.TipoCita;
import util.Conexion;

public class VerTipos{
    public ArrayList<TipoCita> mostrar(){
        ArrayList<TipoCita> lista=new ArrayList<>();
        try(Connection con=Conexion.conectar();
            PreparedStatement ps=con.prepareStatement(SqlVerTipos.SQL);
            ResultSet rs=ps.executeQuery()){
            while(rs.next()){
                TipoCita t=new TipoCita();
                t.setIdTipo(rs.getInt("id_tipo"));
                t.setNombre(rs.getString("nombre"));
                t.setDescripcion(rs.getString("descripcion"));
                t.setEstado(rs.getBoolean("estado"));
                lista.add(t);
            }
        }catch(Exception e){
            System.out.println("Error al mostrar tipos: "+e.getMessage());
        }
        return lista;
    }
}