package service;

import dao.BuscarUsuario;
import java.util.ArrayList;
import modelo.Usuario;

public class BuscarUsuarioService{
    private final BuscarUsuario buscarUsuario=new BuscarUsuario();

    public ArrayList<Usuario> buscar(String texto){
        return buscarUsuario.buscar(texto);
    }
}