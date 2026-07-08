package service;

import dao.CancelacionDAO;
import modelo.Cancelacion;

public class CancelacionService {

    private final CancelacionDAO dao = new CancelacionDAO();

    public Cancelacion buscar(String codigo) {
        return dao.buscarPorCodigo(codigo);
    }

    public boolean cancelar(String codigo) {
        return dao.cancelar(codigo);
    }
}