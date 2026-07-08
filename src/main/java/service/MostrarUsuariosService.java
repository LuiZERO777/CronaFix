package service;

import dao.MostrarUsuarios;
import java.util.ArrayList;
import modelo.Usuario;

public class MostrarUsuariosService{
    private final MostrarUsuarios mostrarUsuarios=new MostrarUsuarios();

    public ArrayList<Usuario> mostrar(){
        return mostrarUsuarios.mostrar();
    }
}
