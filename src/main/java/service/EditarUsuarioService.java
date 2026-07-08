package service;

import dao.EditarUsuario;
import modelo.Usuario;

public class EditarUsuarioService{
    private final EditarUsuario editarUsuario=new EditarUsuario();

    public boolean editar(Usuario u){
        return editarUsuario.editar(u);
    }
}