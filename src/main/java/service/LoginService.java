package service;

import dao.UsuarioDAO;
import modelo.Usuario;

public class LoginService {

    private UsuarioDAO usuarioDAO = new UsuarioDAO();

    public Usuario iniciarSesion(
            String usuario,
            String contraseña) {

        return usuarioDAO.iniciarSesion(
                usuario,
                contraseña);
    }
}