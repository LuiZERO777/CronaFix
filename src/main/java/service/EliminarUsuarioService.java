package service;

import dao.EliminarUsuario;

public class EliminarUsuarioService{
    private final EliminarUsuario eliminarUsuario=new EliminarUsuario();

    public boolean eliminar(int id){
        return eliminarUsuario.eliminar(id);
    }
}