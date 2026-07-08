package service;

import dao.CrearUsuario;
import modelo.Usuario;

public class CrearUsuarioService{
    private final CrearUsuario crearUsuario=new CrearUsuario();

    public boolean crear(Usuario u){
        return crearUsuario.crear(u);
    }
}